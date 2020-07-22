println("\nStep 1: How to define a higher order function which takes another function as parameter")
def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
  println(s"Calculating total cost for $quantity $donutType")
  val totalCost = 2.50 * quantity
  f(totalCost)
}

println("\nStep 2: How to define and pass a def function to a higher order function")
def applyDiscount(totalCost: Double): Double = {
  val discount = 2 // assume you fetch discount from database
  totalCost - discount
}
println(s"Total cost of 5 Glazed Donuts with discount def function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount)}")

println("\nStep 3: How to define and pass a val function to a higher order function")
val applyDiscountValueFunction = (totalCost: Double) => {
  val discount = 2 // assume you fetch discount from database
  totalCost - discount
}
println(s"Total cost of 5 Glazed Donuts with discount val function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscountValueFunction)}")

