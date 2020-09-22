// Scala Tutorial - Learn How To Declare And Use Singleton Object

// Overview
//In this tutorial, we will learn how to declare Singleton Object which you can use to store global fields and utility functions or methods.
//
//
//
//What is a Singleton Object?
//
//As per Wikipedia, the Singleton Pattern is a a fairly common design pattern when you need exactly one instance of an object.
//
//
//
//The Singleton Pattern is so commonly used that Scala has made it very easy to create single instances of an object. All you need to do is to make use of the keyword object as we will show in the steps below.


println("Step 1: How to declare a Singleton Object")
object DonutShoppingCartCalculator {

}

println("Step 1: How to declare a Singleton Object")
object DonutShoppingCartCalculator {

  println("\nStep 2: How to define a global field")
  val discount: Double = 0.01
}

println("Step 1: How to declare a Singleton Object")
object DonutShoppingCartCalculator {

  println("\nStep 2: How to define a global field")
  val discount: Double = 0.01

  println("\nStep 3: How to define utility function called calculateTotalCost")
  def calculateTotalCost(donuts: List[String]): Double = {
    // calculate the cost of donuts
    return 1
  }
}

println("\nStep 4: How to call global discount field from Step 2")
println(s"Global discount = ${DonutShoppingCartCalculator.discount}")

println("\nStep 5: How to call the utility function calculateTotalCost from Step 3")
println(s"Call to calculateTotalCost function = ${DonutShoppingCartCalculator.calculateTotalCost(List())}")

val a = DonutShoppingCartCalculator
println(a.discount)