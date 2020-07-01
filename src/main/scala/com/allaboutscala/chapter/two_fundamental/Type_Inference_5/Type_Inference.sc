println("Step 1: Immutable variable")
val donutsToBuy: Int = 5

val donutsBought = 5

println("\nStep 2: Scala Types")
val donutsBoughtToday = 5
val bigNumberOfDonuts = 100000000L
val smallNumberOfDonuts = 1
val priceOfDonut = 2.50
val donutPrice = 2.50f
val donutStoreName = "Allaboutscala Donut Store"
val donutByte = 0xa
val donutFirstLetter = 'D'
val nothing = ()

println("\nStep 3: Using Scala compiler to convert from one data type to another")
val numberOfDonuts: Short = 1
val minimumDonutsToBuy: Int = numberOfDonuts

println("\nStep 4: User driven conversion from one data type to another ")
// NB: You cannot convert from an Int to a String
// val minimumDonutsToSell: String = numberOfDonuts
val minimumDonutsToSell: String = numberOfDonuts.toString

