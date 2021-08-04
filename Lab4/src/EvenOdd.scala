

object EvenOdd 
{  
    def main(args: Array[String])
    {
      println("Enter the value of n:")
      val n=scala.io.StdIn.readInt()
        
      evenodd(n)
       
    }
  def evenodd(n:Int)=
  {
      def check(n:Int):String=
      {
        if(n%2==0)
          n + " is even\n"
        else
          n + " is odd\n"
      }
           
       println(check(n))
  }
  
}