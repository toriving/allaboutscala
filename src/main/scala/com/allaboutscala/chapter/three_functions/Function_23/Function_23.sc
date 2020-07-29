// Scala Tutorial - Learn How To Create Nested Function

// Overview
//In this tutorial, we will learn how to create Nested Functions which as the name implies are functions that are defined inside other functions.
//In Functional Programming, you should try to break your logic into other smaller functions. But sometimes you have logic that is tightly coupled with a particular function and Scala provides you with the ability to nest functions so that you can still benefit from functional style of coding.

println("Step 1: How to define a function")
def checkDonutAvailability(donutName: String): Boolean = {
  // retrieve donut list that is currently in stock
  val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  val iDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutsFromStock contains donutName)

  iDonutInStock
}

println("\nStep 2: How to call a function")
println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailability("Vanilla Donut")}")

println("\nStep 3: How to define a Nested Function")
def checkDonutAvailabilityWithNestedFunction(donutName: String): Boolean = {
  // retrieve donut list that is currently in stock
  val listDonutsFromStock = List[String]("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  // validate the donutName parameter by some business logic
  val validate = (name: String) => {
    name.nonEmpty && name.length > 0
  }

  // first run validate and then check if we have a matching donut from our list
  val isDonutInStock = validate(donutName) && (listDonutsFromStock contains donutName)

  isDonutInStock
}

println("\nStep 4: How to call a Nested Function")
println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${checkDonutAvailabilityWithNestedFunction("Vanilla Donut")}")

