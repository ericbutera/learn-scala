class LearnFor extends munit.FunSuite {
  test("for comprehension") {
    val y = List(1,2,3)
      .flatMap(num => List("a", "b", "c")
        .map(letter => s"$num-$letter")
      )

    val x = for {
      number <- List(1,2,3)
      letter <- List("a", "b", "c")
    } yield s"$number-$letter"

    assertEquals(x, y)
    assertEquals(x, List("1-a", "1-b", "1-c", "2-a", "2-b", "2-c", "3-a", "3-b", "3-c"))
  }
}