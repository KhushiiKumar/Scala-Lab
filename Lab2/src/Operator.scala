

object Operator {
  
  //main function
  def main(args: Array[String])
  {
    //variable declaration
    var a=3;
    var b=2;
    var c=true;
    var d=false;
    var ans=0;
    var f=1.0;
    
    //arithematic op
    println("a+b= "+ (a+b) );
    println("a-b= "+ (a-b) );
    println("a*b= "+ (a*b) );
    println("a/b= "+ (a/b) );
    println("a/f= "+ (a/f) );
    
    //relational op
    if(a>b)
      println("a is greater than b");
    else if(a<b)
      println("a is less than b");
    else
      println("a is equal to b");
    
    //logical op
    println( (c && d) || (c || d) ); 
    
    //bitwise op
    println("Bitwise AND -> " + (a&b)); 
    println("Bitwise OR-> " + (a|b));
    
    println("XOR -> " + (a^b));
    
    //assignment op
    ans=a+b;
    ans+=a;
    println(ans);
    
  }
}





