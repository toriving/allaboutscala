// Scala Tutorial - Learn How To Create Implicit Function
// In this tutorial, we will learn how to create implicit function which will allow you to provide extension methods or functions to pretty much any type or class.

println("Step 1: How to create a wrapper String class which will extend the String type")
class DonutString(s: String) {

  def isFavoriteDonut: Boolean = s == "Glazed Donut"

}

class DonutNum(s: Int) {
  def isOne: Boolean = s == 100
}

println("\nStep 2: How to create an implicit function to convert a String to the wrapper String class")
object DonutConverstions {
  implicit def stringToDonutString(s: String) = new DonutString(s)
  implicit def intToDonutNum(s: Int) = new DonutNum(s)
}

println("\nStep 3: How to import the String conversion so that it is in scope")
import DonutConverstions._

println("\nStep 4: How to create String values")
val glazedDonut = "Glazed Donut"
val vanillaDonut = "Vanilla Donut"
val test = 123

println("\nStep 5: How to access the custom String function called isFavaoriteDonut")
println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")
println(s"${test.toString.isFavoriteDonut}")
println(s"${test.isOne}")
