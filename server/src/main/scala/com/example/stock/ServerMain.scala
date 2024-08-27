package com.example.stock

import cats.syntax.all.*
import cats.effect.{ExitCode, IO, IOApp, Resource}
import cats.effect.std.{Dispatcher, Random}
import com.example.stock.stockquote.StockQuoteProviderGrpc.{StockQuoteProvider, StockQuoteProviderStub}
import com.example.stock.stockquote.{Stock, StockQuote, StockQuoteProviderGrpc}
import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver

import scala.concurrent.duration.*

object ServerMain extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {
    val resources = for {
      disp <- Dispatcher.sequential[IO]
      ec <- Resource.eval(IO.executionContext)
    } yield disp -> ec

    resources.flatMap { (disp, ec) =>
      Resource(
        IO.blocking(
          ServerBuilder
            .forPort(9999)
            .addService(
              StockQuoteProviderGrpc.bindService(StockServiceRpc(InfiniteStockServiceStream, disp), ec)
            )
            .build
            .start
        ).map(s => s -> IO.blocking(s.shutdown()))
      )
    }.useForever
  }

}

trait StockServiceStream {
  def getQuotes(stock: Stock): fs2.Stream[IO, StockQuote]
}

object InfiniteStockServiceStream extends StockServiceStream {
  override def getQuotes(stock: Stock): fs2.Stream[IO, StockQuote] =
    fs2.Stream
      .eval(Random.scalaUtilRandom[IO])
      .flatMap(rnd =>
        fs2.Stream
          .repeatEval((rnd.nextDouble, rnd.nextInt).mapN((price, num) => StockQuote.of(price, num, stock.description)))
          .meteredStartImmediately(50.millis)
          .take(10)
      )
}

class StockServiceRpc(stream: StockServiceStream, dispatcher: Dispatcher[IO]) extends StockQuoteProvider {

  override def serverSideStreamingGetListStockQuotes(
      request: Stock,
      responseObserver: StreamObserver[StockQuote]
  ): Unit = {
    val quotes = stream
      .getQuotes(request)
      .attempt
      .evalMap {
        case Right(value) =>
          IO(responseObserver.onNext(value))
        case Left(err) => IO(responseObserver.onError(err))
      }
      .onFinalize(IO.println("before finalize") >> IO(responseObserver.onCompleted()) >> IO.println("after finalize"))
    dispatcher.unsafeRunAndForget(quotes.compile.drain)
  }
}
