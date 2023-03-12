class LearnClasses extends munit.FunSuite {

  class Robot(name: String) {
    def sayHi(): String = s"Hi, I'm $name"
  }

  class ItalianRobot(name: String) extends Robot(name) {
    override def sayHi(): String = s"Ciao, sono $name"
  }

  test("robot class") {
    assertEquals(Robot("Eric").sayHi(), "Hi, I'm Eric")
  }

  test("subclass") {
    assertEquals(ItalianRobot("Eric").sayHi(), "Ciao, sono Eric")
  }

  test("apply is a static function to create class instances") {
    // lesson 11 - singleton objects
    case class Person(name: String, age: Int) // case class adds getters

    object Person {
      def apply(name: String, age: Int): Person =
        new Person(name.capitalize, age)

      def apply(name: String): Person =
        new Person(name.capitalize, 0)

      def apply(age: Int): Person =
        new Person("Unknown", age)
    }

    assertEquals(Person("eric", 111).name, "Eric")
    assertEquals(Person("eric").age, 0)
  }

  test("object class means singleton") {
    object Eric {
      private var _age = 0
      def add(): Unit = _age += 1
      def age(): Int = _age
    }

    Eric.add()
    assertEquals(Eric.age(), 1)
  }

  test("compantion to singleton") {
    case class Person(name: String, age: Int):
      def appendToName(suffix: String): Person =
        Person(s"$name$suffix", age)

    object Person {
      // Ensure non-empty name is capitalized
      def apply(name: String, age: Int): Person =
        val capitalizedName =
          if !name.isEmpty then
            val firstChar = name.charAt(0).toUpper
            val restOfName = name.substring(1)
            s"$firstChar$restOfName"
          else throw new IllegalArgumentException("Empty name")
        new Person(capitalizedName, age)
    }

    assertEquals(Person("eric", 111).name, "Eric")

    val e = Person("eric", 10)
    assertEquals(e.appendToName("Esq"), Person("EricEsq", 10))
  }

  test("case class") {
    case class Person(name: String, age: Int)
    val p = Person("Eric", 111)
    assertEquals(p.name, "Eric")
    assertEquals(p.age, 111)
  }

  test("class public field") {
    class Adder {
      var sum = 0
    }

    val acc = new Adder
    acc.sum = 3
    assertEquals(acc.sum, 3)
  }

  test("class private field") {
    class Adder {
      private var total = 0
      def add(num: Int): Unit = total += num
      def sum(): Int = total
    }

    val acc = new Adder
    acc.add(1)
    assertEquals(acc.sum(), 1)
  }

}
