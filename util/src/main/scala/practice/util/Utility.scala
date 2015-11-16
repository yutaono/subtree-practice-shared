package practice.util

object Utility {

  def double(x: Int): Int = x * 2

  def triple(x: Int): Int = x * 3

  def half(x: Int): Int = (x / 2).toInt

  implicit class int(value: Int) {
    def `++`: Int = value + 1
    def `--`: Int = value - 1
    def `**`(x: Double): Double = Math.pow(value, x)
  }
  
}
