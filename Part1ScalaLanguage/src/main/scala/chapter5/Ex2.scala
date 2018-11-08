package chapter5

object Ex2 {
  def main(agrs: Array[String]): Unit = {
    dropship(people(5))
  }
  def dropship(n: => Int) = {
    println("드랍십 준비합니다")
    println(n + "명 탑승했습니다")
  }
  def people(n: Int) = {
    println("탑승수속 시작합니다")
    n
  }
}
