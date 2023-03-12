class LearnRange extends munit.FunSuite {

  test("1 to 10") {
    val r = 1.to(3).mkString(",")
    assertEquals(r, "1,2,3")
  }
}