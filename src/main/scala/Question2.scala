import scala.io.StdIn.readInt

object Question2 {
  def matchingNumber(number: Int): Unit = number match {
    case number if number <= 0 => println("Negative/Zero")
    case number if number % 2 == 0 => println("Even number")
    case number if number % 2 == 1 => println("Odd number")
  }

  def main(args: Array[String]): Unit ={
    print("Enter a number: ")
    val Number = readInt()
    matchingNumber(Number)
  }

}
