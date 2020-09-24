// Scala Tutorial - Learn How To Extend Case Class - Case Class Inheritance

// Overview
//In this tutorial, we will continue from what we've learned from the previous tutorial on Class Inheritance in Scala.  The examples in this tutorial will be focused on case classes which will extend an abstract class - case class inheritance.
//
//
//
//If you recall from the tutorial on What is Scala programming language, Scala is both an Object Oriented and Functional programming language. As a result of its Object Oriented nature, it has full support of object hierarchies through the use of class inheritance.

println("Step 1: How to define an abstract class called Donut")
abstract class Donut(name: String) {

  def printName: Unit

}


println("\nStep 2: How to extend abstract class Donut and define a case class called VanillaDonut")
case class VanillaDonut(name: String) extends Donut(name) {

  override def printName: Unit = println(name)

}


println("\nStep 3: How to extend abstract class Donut and define another case class called GlazedDonut")
case class GlazedDonut(name: String) extends Donut(name) {

  override def printName: Unit = println(name)

}

println("\nStep 4: How to instantiate Donut objects")
val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
vanillaDonut.printName

val glazedDonut: Donut = GlazedDonut("Glazed Donut")
glazedDonut.printName

