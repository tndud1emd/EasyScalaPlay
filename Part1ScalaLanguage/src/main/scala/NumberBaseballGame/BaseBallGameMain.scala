package NumberBaseballGame

import scala.io.StdIn.readLine
import scala.util.Random

object BaseBallGameMain {
  def main(args: Array[String]): Unit = {
    println("숫자야구 게임 시작합니다")
    val ballList = Random.shuffle(0 to 9).drop(7)

    while (true) {
      println("숫자를 입력하세요(000 ~ 999)")
      val inputList = convertInputs(readLine)

      if (inputList != None) {
        val ballCount = calcBallCountSeq(ballList, inputList.get)

        ballCount match {
          case BallCount(0, 0, 0) =>
            println("아웃입니다")
          case BallCount(3, 0, 0) =>
            println("3스트라이크입니다. 프로그램을 종료합니다"); System.exit(0)
          case BallCount(strikes, 0, 0) =>
            println(s"$strikes 스트라이크!")
          case BallCount(0, balls, 0) =>
            println (s"$balls 볼!")
          case BallCount(strikes, balls, 0) =>
            println(s"$strikes 스트라이크! $balls 볼!")
          case _ =>
            println("처리 불가")
          }
        }
      else println("제대로 된 값을 입력하세요")
    }
  }
}
