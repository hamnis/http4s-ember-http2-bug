package com.example.stock

import cats.effect.{ExitCode, IO, IOApp}
import com.example.stock.stockquote.{Stock, StockQuoteProvider}
import org.http4s.Headers
import org.http4s.ember.client.EmberClientBuilder
import org.http4s.implicits.uri

object ClientMain extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    EmberClientBuilder
      .default[IO]
      .withHttp2
      .build
      .map(c => StockQuoteProvider.fromClient(c, uri"http://localhost:9999"))
      .use { svc =>
        svc
          .serverSideStreamingGetListStockQuotes(Stock("yey", "yey", "yeye"), Headers())
          .evalTap(IO.println)
          .compile
          .drain
      }
      .as(ExitCode.Success)
}
