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
    val ajectives = List("One", "Two", "Red", "Blue")
    val nouns =
      for adj <- ajectives yield adj + " Fish"
  }
}
