package chapter5

object Ex5 {
  def main(args: Array[String]): Unit = {
    val result = calc(x => x + x, 2, 5)
    println(result)
  }

  def calc(f: Int => Int, start: Int, end: Int) = {
    def loop(index: Int, sum: Int): Int = {
      if (index > end) sum
      else loop(index + 1, f(index) + sum)
    }
    loop(start, 0)
  }
}
