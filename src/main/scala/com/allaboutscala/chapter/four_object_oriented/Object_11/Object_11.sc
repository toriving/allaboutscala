// Scala Tutorial - Learn How To Extend Class - Class Inheritance

// Overview
//In this tutorial, we will learn the basics of Class Inheritance in Scala by creating an abstract class and then extending it to create other sub-classes.
//
//
//
//If you recall from the tutorial on What is Scala programming language, Scala is both an Object Oriented and Functional programming language. As a result of its Object Oriented nature, it has full support of object hierarchies through the use of class inheritance.

println("Step 1: How to define an abstract class called Donut")
abstract class Donut(name: String) {

  def printName: Unit

}

println("\nStep 2: How to extend abstract class Donut and define a sub-class of Donut called VanillaDonut")
class VanillaDonut(name: String) extends Donut(name) {

  override def printName: Unit = println(name)

}

object VanillaDonut {

  def apply(name: String): Donut = {
    new VanillaDonut(name)
  }

}

println("\nStep 3: How to extend abstract class Donut and define another sub-class of Donut called GlazedDonut")
class GlazedDonut(name: String) extends Donut(name) {

  override def printName: Unit = println(name)

}

object GlazedDonut {

  def apply(name: String): Donut = {
    new GlazedDonut(name)
  }

}

println("\nStep 4: How to instantiate Donut objects")
val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
vanillaDonut.printName

val glazedDonut: Donut = GlazedDonut("Glazed Donut")
glazedDonut.printName