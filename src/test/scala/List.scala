class LearnLists extends munit.FunSuite {
  val thrill = "Will" :: "fill" :: "until" :: Nil

  test("list concat") {
    val oneTwoThree = List(1, 2, 3)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwoThree ::: threeFour
    assertEquals(oneTwoThreeFour, List(1, 2, 3, 3, 4))
  }

  test("map") {
    var ie = thrill.map(s => s + "ie")
    assertEquals(ie, List("Willie", "fillie", "untilie"))
  }

  test("empty") {
    assertEquals(List.empty, List())
  }

  test("literal") {
    var list = 1 :: 2 :: 3 :: Nil
    assertEquals(list, List(1, 2, 3))
  }

  test("index access") {
    assertEquals(thrill(2), "until")
  }

  test("count") {
    assertEquals(thrill.count(s => s.length == 4), 2)
  }

  test("drop") {
    assertEquals(thrill.drop(2), List("until"))
  }

  test("drop right") {
    assertEquals(thrill.dropRight(2), List("Will"))
  }

  test("forall") {
    // do all elements end with l?
    assertEquals(thrill.forall(s => s.endsWith("l")), true)
  }
}
