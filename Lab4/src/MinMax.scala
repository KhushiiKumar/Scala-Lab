

object MinMax {
  
    def main(args: Array[String])
    {
      println("Enter the value for n1:")
      val n1=scala.io.StdIn.readInt()
      println("Enter the value for n2:")
      val n2=scala.io.StdIn.readInt()
        
      minmax(n1,n2)
       
    }
  def minmax(n1:Int, n2:Int)=
  {
      def minval(n1:Int, n2:Int):Int=
      {
        if(n1<n2)
          n1
        else
          n2
      }
      
       def maxval(n1:Int, n2:Int):Int=
      {
        if(n1>n2)
          n1
        else
          n2
      }
       
       printf("Min value: %d\n", minval(n1,n2))
       printf("Max value: %d", maxval(n1,n2))
  }
  
}