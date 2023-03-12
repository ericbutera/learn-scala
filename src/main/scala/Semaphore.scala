import cats.effect._
import cats.effect.{IO, Temporal}
import cats.effect.std.{Console, Semaphore}
import cats.implicits._
import cats.effect.syntax.all._

import scala.concurrent.duration._

class PreciousResource[F[_]: Temporal](name: String, s: Semaphore[F])(implicit F: Console[F]) {
  def use: F[Unit] =
    for {
      x <- s.available
      _ <- F.println(s"$name >> Availability: $x")
      _ <- s.acquire
      y <- s.available
      _ <- F.println(s"$name >> Started | Availability: $y")
      _ <- s.release.delayBy(3.seconds)
      z <- s.available
      _ <- F.println(s"$name >> Done | Availability: $z")
    } yield ()
}

val program: IO[Unit] =
  for {
    s  <- Semaphore[IO](2)
    r1 = new PreciousResource[IO]("R1", s)
    r2 = new PreciousResource[IO]("R2", s)
    r3 = new PreciousResource[IO]("R3", s)
    r4 = new PreciousResource[IO]("R4", s)
    _  <- List(r1.use, r2.use, r3.use, r4.use).parSequence.void
  } yield ()


object SemaphoreExample extends IOApp.Simple {
  val run = program
}