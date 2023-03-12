// prints: `HelloIo` which is the name of the object
// import cats.effect.IO
// import cats.implicits._
//
// @main def helloIo: Unit =
//   val effect = for {
//     _ <- IO(println("Hello"))
//     _ <- IO(println("World"))
//   } yield ()

import cats.effect._

object Main extends IOApp.Simple {
  val run = for {
    _ <- IO(println("Hello"))
    _ <- IO(println("World!"))
  } yield ()
}
