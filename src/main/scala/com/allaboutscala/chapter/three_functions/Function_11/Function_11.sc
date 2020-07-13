// Scala Tutorial - Learn How To Create Functions As Symbols

// Overview
// In this tutorial, we will learn how to create functions which are named using just symbols as opposed to alphabets. This feature of Scala is a great building block when you have to create Domain Specific Language syntax.

class DonutCostCalculator {

  // We are hard-coding the totalCost value for simplicity.
  val totalCost = 100

  def minusDiscount(discount: Double): Double = {
    totalCost - discount
  }

  // Step 3: How to define function whose name is just the symbol minus -
  def -(discount: Double): Double = {
    totalCost - discount
  }

  def +++(taxAmount: Double): Double = {
    totalCost + taxAmount
  }
}


println("Step 1: How to create and instantiate a class")
val donutCostCalculator = new DonutCostCalculator()

println("\nStep 2: How to call a function from an instantiated class")
println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")

println("\nStep 4: How to call function whose name is just the symbol -")
println(s"Calling function - = ${donutCostCalculator.-(10.5)}")

println("\nStep 5: How to call a function using the operator style notation")
println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")

println(s"Calling function +++ with operator style notation = ${donutCostCalculator.+++(10.5)}")
println(s"Calling function +++ with operator style notation = ${donutCostCalculator +++ 10.5}")
