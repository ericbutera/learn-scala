/*
from _Get Programming with Scala_:
> while loops are part of the Scala language, but they are rarely used and often considered anti-patterns.
> while loops operate on mutable state: they keep track of how it evolves, and they stop once a predicate is respected.
*/
class LearnLoops extends munit.FunSuite {
  test("for loop list") {
    val oneTwoThree = List(1, 2, 3)
    val oneTwoThreeFour = for (i <- oneTwoThree) yield i + 1
    assertEquals(oneTwoThreeFour, List(2, 3, 4))
  }

  test("for loop range") {
    val oneTwoThree = for (i <- 1 to 3) yield i
    assertEquals(oneTwoThree, IndexedSeq(1, 2, 3))
  }

}
