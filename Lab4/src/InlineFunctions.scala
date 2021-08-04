

object InlineFunctions 
{
  def main(args: Array[String])
  {
    print("Enter a number: ")
    var n=scala.io.StdIn.readInt()
    
    //Function 1
    var add1 = (n:Int) => n+1
    println(add1(n))
    
    //Function 2
    var check0 = (n:Int) => if(n==0) "yes" else "no"
    println(check0(n))
    
    //Function 3
    println("Enter the value for n1:")
    val n1=scala.io.StdIn.readInt()
    println("Enter the value for n2:")
    val n2=scala.io.StdIn.readInt()
    
    var add = (n1:Int,n2:Int) => n1+n2
    var multiply = (n1:Int,n2:Int) => n1*n2
    println(add(n1,n2))
    println(multiply(n1,n2))
    
  }
}