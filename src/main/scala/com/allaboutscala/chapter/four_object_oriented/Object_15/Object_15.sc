// Scala Tutorial - Learn How To Create Contra-Variance Type Class

// Overview
//In this tutorial, we will continue from what we've learned from the previous tutorials on Class Inheritance, Case Class Inheritance, Type Class and Covariance Type Parameter in Scala.
//
//
//
//The examples in this tutorial will be a review of inheritance in Scala with classes and case classes which extend an abstract class. In addition, we will also define a class which expects a given type - type class.
//
//
//
//To follow on from the previous tutorials on Type Class and Covariance Type Parameter, we will show example of enforcing type hierarchies through the use of variance - in particular contra-variance.
//
//
//
//If you recall from the tutorial on What is Scala programming language, Scala is both an Object Oriented and Functional programming language. As a result of its Object Oriented nature, it has full support of object hierarchies through the use of class inheritance.


println("Step 1: How to define an abstract class called Donut")
abstract class Donut(name: String) {

  def printName: Unit

}

println("\nStep 2: How to extend abstract class Donut and define a case cla called VanillaDonut")
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


println("\nStep 5: How to define a ShoppingCart type class which expects Donut types")
class ShoppingCart[D <: Donut](donuts: Seq[D]) {

  def printCartItems: Unit = donuts.foreach(_.printName)

}

println("\nStep 6: How to create instances or objects of ShoppingCart class")
val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
shoppingCart.printCartItems


//val shoppingCart: ShoppingCart[VanillaDonut] = new ShoppingCart[Donut](Seq(glazedDonut))

println(s"\nStep 7: How to enable contra-variance on ShoppingCart")
//class ShoppingCart2[-D <: Donut](donuts: Seq[D]) {
//
//  def printCartItems: Unit = donuts.foreach(_.printName)
//
//}

//val shoppingCart2: ShoppingCart2[VanillaDonut] = new ShoppingCart2[Donut](Seq(glazedDonut))
//shoppingCart2.printCartItems

println(s"\nStep 7: How to enable contra-variance on ShoppingCart")
class ShoppingCart2[-D <: Donut](donuts: Seq[D]) {

  def printCartItems: Unit = donuts.foreach(_.printName)

}

val shoppingCart2: ShoppingCart2[VanillaDonut] = new ShoppingCart2[Donut](Seq(glazedDonut))
shoppingCart2.printCartItems


