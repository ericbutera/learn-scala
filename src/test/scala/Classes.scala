class LearnClasses extends munit.FunSuite {
  test("class public field") {
    class ChecksumAccumulator {
      var sum = 0
    }

    val acc = new ChecksumAccumulator
    acc.sum = 3
    assertEquals(acc.sum, 3)
  }

  test("class private field") {
    class ChecksumAccumulator {
      private var sum = 0
      def add(b: Byte): Unit = sum += b
      def checksum(): Int =
        ~(sum & 0xff) + 1
    }

    val acc = new ChecksumAccumulator
    // acc.sum = 3 cannot access
    acc.add(1)
    assertEquals(acc.checksum(), -2)
  }
}
