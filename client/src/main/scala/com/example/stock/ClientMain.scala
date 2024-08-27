package com.example.stock

import cats.effect.{ExitCode, IO, IOApp}
import com.example.stock.stockquote.{Stock, StockQuoteProvider}
import fs2.io.net.tls.TLSContext
import org.http4s.Headers
import org.http4s.ember.client.EmberClientBuilder
import org.http4s.implicits.uri

import java.io.{File, FileInputStream}
import java.security.KeyStore
import javax.net.ssl.{KeyManagerFactory, SSLContext, TrustManagerFactory}

object ClientMain extends IOApp {
  lazy val root = {
    var file = new File(getClass.getProtectionDomain.getCodeSource.getLocation.getFile)
    while (!new File(file.getParentFile, "build.sbt").exists())
      file = file.getParentFile
    file.getParentFile
  }

  def sslContextForClient: SSLContext = {
    val js = KeyStore.getInstance("PKCS12")
    js.load(new FileInputStream(new File(root, "keystore.p12")), "password".toCharArray)

    val tmf = TrustManagerFactory.getInstance("SunX509")
    tmf.init(js)

    val ctx = SSLContext.getInstance("TLS")
    ctx.init(null, tmf.getTrustManagers, null)
    ctx
  }

  override def run(args: List[String]): IO[ExitCode] =
    EmberClientBuilder
      .default[IO]
      .withHttp2
      .withTLSContext(TLSContext.Builder.forAsync[IO].fromSSLContext(sslContextForClient))
      .build
      .map(c => StockQuoteProvider.fromClient(c, uri"https://localhost:9999"))
      .use { svc =>
        svc
          .serverSideStreamingGetListStockQuotes(Stock("yey", "yey", "yeye"), Headers())
          .evalTap(IO.println)
          .compile
          .drain
      }
      .as(ExitCode.Success)
}
