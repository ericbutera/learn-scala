// lesson 12 p.97

trait Animal {
  def name: String
  def age: Int
  def speak(): String
  def eat(food: String): String
}

trait Nameable {
  def name: String
}

trait Nameable2(name: String) // Scala3 sugar syntax