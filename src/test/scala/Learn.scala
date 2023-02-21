class LearnLoops extends munit.FunSuite {
  test("for loop") {
    val oneTwoThree = List(1, 2, 3)
    val oneTwoThreeFour = for (i <- oneTwoThree) yield i + 1
    assertEquals(oneTwoThreeFour, List(2, 3, 4))
  }
}
