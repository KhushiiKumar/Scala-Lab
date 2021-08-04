class KW
{
  def printFunc()
  {
    println("In a function")
  }
}

object Keywords {
  def main(args: Array[String])
  {
    val a:Int=10
    val b:Int=20
    println(a+b)
    
    var x1=true;
    var x2=false;
    println(x1 && x2)
    
    var c:Double=5.1234
    var d:Double=6.12345
    println(c*d)
    
    if(a<c)
    {
      print("A is greater")
    }
    else
    {
      print("C is greater")
    }
    
    println()
    
    while(x1)
    {
      print("True")
      x1=false;
    }
    
    println()
    
    var obj=new KW
    obj.printFunc()
    
  }
}


