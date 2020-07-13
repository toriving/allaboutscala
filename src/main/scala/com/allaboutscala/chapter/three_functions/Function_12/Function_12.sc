// Scala Tutorial - Learn How To Create Function Currying With Parameter Groups

// Overview
// In this tutorial, we will learn how to create functions whose parameters are organized into parameter groups - also known as Function Currying.

println("Step 1: How to define function with curried parameter groups")
def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
  println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
  val totalCost = 2.50 * quantity
  totalCost - (totalCost * discount)
}

println("\nStep 2: How to call a function with curried parameter groups")
println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

println("\nStep 3: How to create a partially applied function from a function with curried parameter groups")
val totalCostForGlazedDonuts = totalCost("Glazed Donut") _

println("\nStep 4: How to call a partially applied function")
println(s"\nTotal cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.1)}")

