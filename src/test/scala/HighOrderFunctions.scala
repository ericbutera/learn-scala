class LearnHighOrderFunctions extends munit.FunSuite
{
  def size(s: String): Int = s.length

  def countLetters(s: String): Int = s.count(_.isLetter)

  def countDigits(s: String): Int = s.count(_.isDigit)

  def stats(s: String, predicate: Char => Boolean): Int =
    s.count(predicate)



}