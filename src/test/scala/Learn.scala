class LearnLists extends munit.FunSuite {
  test("list concat") {
    val oneTwoThree = List(1, 2, 3)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwoThree ::: threeFour
    assertEquals(oneTwoThreeFour, List(1, 2, 3, 3, 4))
  }
}

class LearnLoops extends munit.FunSuite {
  test("for loop") {
    val oneTwoThree = List(1, 2, 3)
    val oneTwoThreeFour = for (i <- oneTwoThree) yield i + 1
    assertEquals(oneTwoThreeFour, List(2, 3, 4))
  }
}
