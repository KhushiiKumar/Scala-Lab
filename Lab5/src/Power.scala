

object Power {
  def main(args: Array[String])
  {
      println("Enter n:")
      var n:Int = scala.io.StdIn.readInt()
      
      println("Square: " + scala.math.pow(n,2))
      println("Cube: " + scala.math.pow(n,3))
      println("Fourth Power: " + scala.math.pow(n,4))
  }
}