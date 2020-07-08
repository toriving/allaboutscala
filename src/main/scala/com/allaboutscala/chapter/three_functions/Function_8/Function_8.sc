// Scala Tutorial - Learn How To Create Typed Function
// In this tutorial, we will learn how to create typed functions which will allow you to specify the types of the parameters when calling the function.

println("Step 1: How to define a function which takes a String parameter")
def applyDiscount(couponCode: String) {
  println(s"Lookup percentage discount in database for $couponCode")
}

println("\nStep 2: How to define a function which takes a parameter of type Double")
def applyDiscount(percentageDiscount: Double) {
  println(s"$percentageDiscount discount will be applied")
}

println("\nStep 3: Calling applyDiscount function with String or Double parameter types")
//applyDiscount("COUPON_1234")
applyDiscount(10)

println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")
def applyDiscount[T](discount: T) {
  discount match {
    case d: String =>
      println(s"Lookup percentage discount in database for $d")

    case d: Double =>
      println(s"$d discount will be applied")

    case _ =>
      println("Unsupported discount type")
  }
}

println("\nStep 5: How to call a function which has typed parameters")
applyDiscount[String]("COUPON_123")
applyDiscount[Double](10)
