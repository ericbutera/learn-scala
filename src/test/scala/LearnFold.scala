class LearnFold extends munit.FunSuite {
  test("fold left") {
    val r = List(1, 2, 3).foldLeft(0)(_ + _)
    assertEquals(r, 6)
  }
}