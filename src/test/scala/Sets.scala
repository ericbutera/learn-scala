class LearnSets extends munit.FunSuite {
  test("contains") {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear" // shorthand for jetSet = jetSet + "Lear"
    assert(jetSet.contains("Cessna") == false)
  }
}
