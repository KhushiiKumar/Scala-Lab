
object Calculator {
  
  def main(args: Array[String])
  {
      println("Enter n1:")
      var n1:Int = scala.io.StdIn.readInt()
      println("Enter n2:")
      var n2:Int = scala.io.StdIn.readInt()
      
      def myfun(fun:(Int, Int)=> Int) = fun(n1,n2)
      
      println("Addition: "+ myfun(_+_))
      println("Subtraction: " +myfun(_-_))
      println("Multiplication: " +myfun(_*_))
      println("Division: " +myfun(_/_))
      
  }
  
}