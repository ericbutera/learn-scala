import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Random
import scala.util.{Failure, Success}
import Thread.sleep


@main def futureExample: Unit =
  futureRunOne()
  multipleFutures()


def futureRunOne(): Unit =
  val f = Future {
    sleep(500)
    1 + 1
  }

  val res = Await.result(f, 1.second)
  println(res)

  sleep(1_000)

def multipleFutures(): Unit =
  val f1 = Future {
    sleep(500)
    1 + 1
  }

  val f2 = Future {
    sleep(900)
    2 + 2
  }

  val f3 = Future {
    sleep(200)
    2 + 2
  }

  val res = for {
    r1 <- f1
    r2 <- f2
    r3 <- f3
  } yield r1 + r2 + r3

  // val res2 = Await.result(res, 1.second)
  // println(res2)

  res.onComplete {
    case Success(value) => println(s"success: $value")
    case Failure(e) => println(s"failure: $e")
  }

  sleep(3_000)