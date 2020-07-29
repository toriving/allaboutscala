// Scala Tutorial - Learn Function Composition Using AndThen

// Overview
//In this tutorial, we will learn how to create value functions which are defined using the val keyword as opposed to using the def keyword.



println("Step 1: Assume a pre-calculated total cost amount")
val totalCost: Double = 10

println("\nStep 2: How to define a val function to apply discount to total cost")
val applyDiscountValFunction = (amount: Double) => {
  println("Apply discount function")
  val discount = 2 // fetch discount from database
  amount - discount
}

println("\nStep 3: How to call a val function")
println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

println("\nStep 4: How to define a val function to apply tax to total cost")
val applyTaxValFunction = (amount: Double) => {
  println("Apply tax function")
  val tax = 2 // fetch tax from database
  amount * tax
}

println("\nStep 5: How to call andThen on a val function")
println(s"Total cost of 5 donuts = ${ (applyDiscountValFunction andThen applyTaxValFunction)(totalCost) }")

// 첫번째에서 나온 값을 다음 함수의 인자로 사용함
// Ordering using andThen: f(x) andThen g(x) = g(f(x))

