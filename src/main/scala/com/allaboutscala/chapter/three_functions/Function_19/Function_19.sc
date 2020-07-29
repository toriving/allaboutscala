// Scala Tutorial - Learn How To Create Tail Recursive Function - @annotation.tailrec

//Overview
//In this tutorial, we will learn how to create tail recursive function and also make use of the annotation @annotation.tailrec which will instruct the compiler to apply any further optimisation.
//Tail recursive function will help prevent overflow in your call stack because the evaluation of your looping construct happens at each step.
//If this does not make any sense at the moment, don't worry we will see an example below.

println("Step 1: How to define an Array of type String")
val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

println("\nStep 2: How to define a tail recursive function")
@annotation.tailrec
def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
  if(donuts.length == index) {
    None
  } else if(donuts(index) == donutName) {
    Some(true)
  } else {
    val nextIndex = index + 1
    search(donutName, donuts, nextIndex)
  }
}

println("\nStep 3: How to call a tail recursive function")
val found = search("Glazed Donut", arrayDonuts, 0)
println(s"Find Glazed Donut = $found")

val notFound = search("Chocolate Donut", arrayDonuts, 0)
println(s"Find Chocolate Donut = $notFound")



