package NumberBaseballGame

object BaseballGame {
  def convertInputs(input: String): Option[Seq[Int]] = {
    val REGEX = "([0-9])([0-9])([0-9])".r
    input match {
      case REGEX(n1, n2, n3) =>
        if (n1 != n2 && n2 != n3 && n1 != n3)
          Some(Seq(n1.toInt, n2.toInt, n3.toInt))
        else
          None
      case _ => None
    }
  }
}
