

object Convert {
  def main(args: Array[String])
  {
      println("Enter temperature in fahrenheit:")
      var t:Int = scala.io.StdIn.readInt()
      println("Temperature in Celcius: " + (t-32)*0.5556 + "\n") 
      
      println("Enter length in Inches:")
      var i:Int = scala.io.StdIn.readInt()
      println("Length in Meter: " + i*0.0254 + "\n") 
      
      println("Enter duration in Years:")
      var y:Int = scala.io.StdIn.readInt()
      println("Duration in Days: " + y*365 + "\n")
      
  }
}