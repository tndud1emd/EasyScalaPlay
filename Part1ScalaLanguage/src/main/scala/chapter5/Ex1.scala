package chapter5

object Ex1 {
  def main(args: Array[String]){
    val result = sum(1,2)
    println(result)
  }
  def sum(a: Int, b: Int): Int = a + b
}
