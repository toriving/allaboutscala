// Scala Tutorial - Learn How To Create Classes And Objects In Scala

// Overview
//In this tutorial, we will learn how to create classes with input parameters and functions. In turn, we will show how to instantiate these classes into objects.

// "Step 1: How to define a simple class to represent a Donut object")
class Donut(name: String, productCode: Long) {

  def print = println(s"Donut name = $name, productCode = $productCode")

}

println("\nStep 2: How to create instances of Donut class")
val glazedDonut = new Donut("Glazed Donut", 1111)
val vanillaDonut = new Donut("Vanilla Donut", 2222)

println("\nStep 3: How to call the print function for each of the donut object")
glazedDonut.print
vanillaDonut.print

println("\nStep 4: How to access the properties of class Donut")
glazedDonut.name
glazedDonut.productCode

