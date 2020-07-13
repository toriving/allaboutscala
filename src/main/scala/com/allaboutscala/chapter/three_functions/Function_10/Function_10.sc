// Scala Tutorial - Learn How To Create Variable Argument Function - varargs :_ *

// In this tutorial, we will learn how to create functions which take variable arguments or varargs. In addition, you will learn how to pass-through Scala collection such as List or Sequence or even an Array to variable argument function using the syntax :_ *.

def printReport(names: String*) {
  println(s"""Donut Report = ${names.mkString(" - ")}""")
}

println("\nStep 2: How to call function which takes variable number of String arguments")
printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
printReport("Chocolate Donut")

println("\nStep 3: How to pass a List to a function with variable number of arguments")
val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
// printReport(listDonuts)
printReport(listDonuts: _*)

println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
//printReport(listDonuts)
printReport(listDonuts: _*)

println("\nStep 5: How to pass an Array to a function with variable number of arguments")
val arrDonuts: Array[String] = Array("Coconut Donut")
//printReport(arrDonuts)
printReport(arrDonuts: _*)


val o: Option[Int] = Some(2)

o match {
  case Some(x) => println(x)
  case None =>
}


o match {
  case x @ Some(_) => println(x)
  case None =>
}

o match {
  case Some(_) => println(o)
  case None =>
}


val d@(c@Some(a), Some(b)) = (Some(1), Some(2))

(Some(1), Some(2)) match { case d@(c@Some(a), Some(b)) => println(a, b, c, d) }

for (x@Some(y) <- Seq(None, Some(1))) println(x, y)

val List(x, xs @ _*) = List(1, 2, 3)