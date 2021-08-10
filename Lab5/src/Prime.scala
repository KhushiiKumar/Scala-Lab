

object Prime {
  
  def main(args: Array[String])
  {
    println("Enter n:")
    var n:Int = scala.io.StdIn.readInt()
    
    def isPrime(n: Int): Boolean = ! ((2 to n-1) exists (n % _ == 0))
    
    if(isPrime(n))
      println("Prime")
    else
      println("Not Prime")
  }
}