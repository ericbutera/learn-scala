import scala.collection.mutable

class LearnMaps extends munit.FunSuite {
  test("add tuples to empty map") {
    val treasureMap = mutable.Map.empty[Int, String]
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    val step2 = treasureMap(2)
    assertEquals(step2, "Find big X on ground.")
  }

  test("yield") {
    val adjectives = List("One", "Two", "Red", "Blue")
    val nouns =
      for adj <- adjectives yield adj + " Fish"

    assertEquals(nouns, List("One Fish", "Two Fish", "Red Fish", "Blue Fish"))
  }

  test("flat map") {
    var nums = List(1,2,3)
    var res = nums.flatMap(s => List(s, s+1))
    assertEquals(res, List(1, 2, 2, 3, 3, 4))
  }

  test("filter") {
    var nums = List(1,2,3)
    var res = nums.filter(s => s > 1)
    assertEquals(res, List(2, 3))

    //shorthand
    var res2 = nums.filter(_ > 1)
    assertEquals(res2, List(2, 3))
  }

  test("find evens") {
    var nums = List(1,2,3)
    var isEven = (n: Int) => n % 2 == 0

    var res = nums.filter(isEven)
    assertEquals(res, List(2))
  }
}
