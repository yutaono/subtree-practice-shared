package practice.util

object Utility {

  def double(x: Int): Int = x * 2

  def triple(x: Int): Int = x * 3

  implicit class int(value: Int) {
    def `++`: Int = value + 1
  }
  
}
