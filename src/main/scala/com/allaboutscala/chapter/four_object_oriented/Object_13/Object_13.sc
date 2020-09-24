// Scala Tutorial - Learn How To Create Typed Class

// Overview
//In this tutorial, we will continue from what we've learned from the previous tutorials on Class Inheritance and Case Class Inheritance in Scala.
//
//
//
//The examples in this tutorial will be a review of inheritance in Scala with classes and case classes which extend an abstract class. In addition, we will also define a class which expects a given type.

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

println("\nStep 5: How to define a ShoppingCart typed class which expects Donut types")
class ShoppingCart[D <: Donut](donuts: Seq[D]) {

  def printCartItems: Unit = donuts.foreach(_.printName)

}

println("\nStep 6: How to create instances or objects of ShoppingCart class")
val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
shoppingCart.printCartItems