object Quesion3 {
  def toUpper(text: String): String = text.toUpperCase()
  def toLower(text: String): String = text.toLowerCase()


  def formatNames(name: String)(function: String => String)(indices: Int*): String = {
    if(!indices.isEmpty)
    {
      var temp = ""
      var i = 0
      while(i < name.length())
      {
        if(indices.contains(i)) {
          temp = temp + function(name.charAt(i).toString)
        }
        else
        {
          temp = temp + name.charAt(i).toString
        }
        i= i + 1
      }
      temp
    }
    else
      {
        function(name)
      }
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper)())
    println(formatNames("Niroshan")(toUpper)(0,1))
    println(formatNames("Saman")(toLower)())
    println(formatNames("Kumara")(toUpper)(5))
  }
}
