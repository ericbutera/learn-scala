package file

import scala.io.Source

@main def readme: Unit =
  val filename = "src/main/scala/file/Read.scala"
  for (line <- Source.fromFile(filename).getLines) {
      println(line)
  }