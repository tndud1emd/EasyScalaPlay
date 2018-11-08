package chapter5

object Ex3 {
  def main(agrs: Array[String]): Unit = {
    val thisYear = 2016
    val fVF = go(thisYear, _:String)

    fVF("test1")
    fVF("test2")
    fVF("test3")
  }
  def go (thisYear: Int, string:String) = {
    println(string + ":" + thisYear)
  }
}
