class LearnConditionals extends munit.FunSuite {
  test("day of week") {
    def categorizeDayOfWeek(n: Int) = {
      if (n == 1 || n == 7) "weekend"
      else if (n > 1 && n < 7) "weekday"
      else "invalid day"
    }

    assertEquals(categorizeDayOfWeek(1), "weekend")
    assertEquals(categorizeDayOfWeek(2), "weekday")
    assertEquals(categorizeDayOfWeek(0), "invalid day")
    assertEquals(categorizeDayOfWeek(0), "invalid day")
  }
}