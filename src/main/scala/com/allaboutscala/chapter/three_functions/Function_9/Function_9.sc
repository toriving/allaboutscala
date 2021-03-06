// Scala Tutorial - Learn How To Create Polymorphic Function With Generic Return Type

// In this tutorial, we will learn how to create polymorphic functions which will allow you to specify the types of the parameters as well as the return type of the function.

println("\nStep 1: Review how to define a generic typed function which will specify the type of its parameter")
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

println("\nStep 2: Review how to call a function which has typed parameters")
applyDiscount[String]("COUPON_123")
applyDiscount[Double](10)

println("\nStep 3: How to define a generic typed function which also has a generic return type")
def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
  discount match {
    case d: String =>
      println(s"Lookup percentage discount in database for $d")
      Seq[T](discount)

    case d: Double =>
      println(s"$d discount will be applied")
      Seq[T](discount)

    case d @ _ =>
      println("Unsupported discount type")
      Seq[T](discount)
  }
}

println("\nStep 4: How to call a generic typed function which also has a generic return type")
println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")

println()
println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")

println()
println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")

