package http

import scala.collection.parallel.immutable.ParVector
// import scala.collection.parallel.CollectionConverters._

@main def httpExample: Unit =
  parallelFetcherDemo()


def parallelFetcherDemo(): Unit =
  // https://github.com/scala/scala-parallel-collections
  val urls = ParVector.range(0, 100)
  urls.foreach { i =>
    val url = s"http://localhost:8080/todos?$i"
    println(s"fetching $url")

    // todo i know try/catch is bad, use the idiomatic
    try {
      val data = fetcher(url)
      println(s"data $data")
    } catch {
      case e: Exception => println(s"error fetching $url: $e")
    }
    println(s"done fetching $url")
  }
  println("done!")


def fetcher(url: String): String =
  val r = requests.get(
    url,
    verifySslCerts = false
  )
  r.text()
