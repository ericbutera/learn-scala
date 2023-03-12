class LikeUnderscore extends munit.FunSuite {
  test("_.map") {
    // _.map([1,2,3]), function(num){ return num * 3; })
    val r = List(1, 2, 3).map(_ * 3)
    assertEquals(r, List(3, 6, 9))
  }

  test("_.reduce") {
    // _.reduce([1,2,3]), function(memo, num){ return memo + num; }, 0)
    val r = List(1, 2, 3).reduce(_ + _)
    assertEquals(r, 6)

    // alternatively, use foldLeft
    // The Big Big difference between Reduce/Fold and FoldLeft is that the former can be implemented in parallel but foldLeft cannot be implemented in parallel (as the order of execution is fixed). As a result, reduce/fold only accepts an operation that is both commutative and associative. As a result, it is common to see reduce functions in MapReduce paradigms like Scalding and also in Spark.
    // https://www.weak-learner.com/blog/2016/09/18/reduce-fold-foldleft/
  }

  test("_.find") {
    // _.find([1,2,3,4]), function(num){ return num % 2 == 0; })
    val r = List(1, 2, 3, 4).find(_ % 2 == 0)
    assertEquals(r, Some(2))
  }

  test("_.filter") {
    // _.filter([1,2,3]), function(num){ return num % 2 == 0; })
    val r = List(1, 2, 3, 4).filter(_ % 2 == 0)
    assertEquals(r, List(2, 4))
  }

  test("_.pluck") {
    // _.pluck([{name: "moe", age: 30}, {name: "curly", age: 50}], "name")
    val r = List(
      Map("name" -> "moe", "age" -> 30),
      Map("name" -> "curly", "age" -> 50)
    ).map(_("name")) // note: parens used in favor of square brackets from other langs: map["name"]
    assertEquals(r, List("moe", "curly"))
  }

  test("_.find") {
    // _.find({one: 1, two: 2, three: 3}, function(num){ return num % 2 == 0; })
    val r = Map("one" -> 1, "two" -> 2, "three" -> 3).find(_._2 % 2 == 0)
    assertEquals(r, Some("two" -> 2))
  }

  test("_.contains") {
    // _.contains([1,2,3], 3)
    val r = List(1, 2, 3).contains(3)
    assertEquals(r, true)
  }
}