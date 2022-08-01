object Question1 {
  def interest(deposit: Float) : Float = deposit match {
    case deposite if deposite <= 20000.00f => deposite * 0.02f
    case deposite if deposite <= 200000.00f => deposite * 0.04f
    case deposite if deposite <= 2000000.00f => deposite * 0.035f
    case deposite if deposite >= 2000000.00f => deposite * 0.065f
  }

  def main(args: Array[String]): Unit = {
    println(interest(15000))
    println(interest(150000))
    println(interest(1500000))
    println(interest(15000000))
  }


}
