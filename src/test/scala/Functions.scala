class LearnFunctions extends munit.FunSuite {
  test("function args") {
    def add(a: Int, b: Int): Int = {
      a + b
    }
    assertEquals(add(1, 2), 3)
  }

  test("list map") {
    var x = List(1, 2, 3)

    var res = x.map(s => s + 1)
    assertEquals(res, List(2, 3, 4))

    // shorthand equivalent
    var res2 = x.map(_ + 1)
    assertEquals(res2, List(2, 3, 4))
  }

  test("list map block with implicit return") {
    var x = List(1, 2, 3)
    var res = x.map(s => {
      s + 1
    })
    assertEquals(res, List(2, 3, 4))
  }

  test("valid return syntax") {
    def myFunc1(a: Int): Int = ???
    def myFunc2(a: Int): Int = a + 1
    def myFunc3(a: Int): Int = {
      a + 1
    }
    assertEquals(myFunc3(1), 2)
  }
}