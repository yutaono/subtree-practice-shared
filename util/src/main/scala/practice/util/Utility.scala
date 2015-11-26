package practice.util

object Utility {

  def double(x: Int): Int = x * 2

  def triple(x: Int): Int = x * 3

  def half(x: Int): Int = (x / 2).toInt

  implicit class int(value: Int) {
    def `++`: Int = value + 1
    def `--`: Int = value - 1
    def `**`(x: Double): Double = Math.pow(value, x)
    def isPrime: Boolean = primes.contains(value)
    def isOddNumber: Boolean = { value % 2 != 0 }
    lazy val primes: Set[Int] = {
      val r = (2 to value).toSet
      r.foldLeft(r)((ps, x) => if (ps(x)) ps -- (x * x to value by x) else ps)
    }
    def isPerfectNumber: Boolean = value == divisors.sum
    lazy val divisors: List[Int] = (value / 2 to 1 by -1).foldLeft[List[Int]](Nil)((ns, n) => if (value % n == 0) n :: ns else ns)

    def abs: Int = Math.abs(value)
    
    def isNoOne: Boolean = value == 1

  }

}
