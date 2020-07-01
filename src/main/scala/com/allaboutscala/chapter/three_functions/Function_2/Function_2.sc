println("Step 1: How to define and use a function which has no parameters and has a return type")
def favoriteDonut(): String = {
  "Glazed Donut"
}

val myFavoriteDonut = favoriteDonut()
println(s"My favorite donut is $myFavoriteDonut")

println("\nStep 2: How to define and use a function with no parenthesis")
def leastFavoriteDonut = "Plain Donut"
println(s"My least favorite donut is $leastFavoriteDonut")

println("\nStep 3: How to define and use a function with no return type")
def printDonutSalesReport(): Unit = {
  // lookup sales data in database and create some report
  println("Printing donut sales report... done!")
}
printDonutSalesReport()

