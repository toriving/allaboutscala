// Scala Tutorial - Learn How To Create Tail Recursive Function - scala.util.control.TailCalls._

// Overview
//In this tutorial, we will learn how to create tail recursive function by making use of utilities that Scala provides for tail recursions in the package scala.util.control.TailCalls._
//As a reminder from the previous tutorial on Tail Recursive Function, tail recursive function will help prevent overflow in your call stack because the evaluation of your looping construct happens at each step.
//If this does not make any sense at the moment, don't worry we will see an example below.

import scala.util.control.TailCalls._

println("\nStep 1: Review how to define a tail recursive function")
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

println("\nStep 2: Review how to call a tail recursive function")
val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
val found = search("Glazed Donut", arrayDonuts, 0)
println(s"Find Glazed Donut = $found")


println("\nStep 3: How to define a tail recursive function using scala.util.control.TailCalls._")
def tailSearch(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
  if(donuts.length == index) {
    done(None) // NOTE: done is imported from scala.util.control.TailCalls._
  } else if(donuts(index) == donutName) {
    done(Some(true))
  } else {
    val nextIndex = index + 1
    tailcall(tailSearch(donutName, donuts, nextIndex)) // NOTE: tailcall is imported from  scala.util.control.TailCalls._
  }
}


println("\nStep 4: How to call tail recursive function using scala.util.control.TailCalls._")
val tailFound = tailcall(tailSearch("Glazed Donut", arrayDonuts, 0))
println(s"Find Glazed Donut using TailCall = ${tailFound.result}") // NOTE: our returned value is wrapped so we need to get it by calling result

val tailNotFound = tailcall(tailSearch("Chocolate Donut", arrayDonuts, 0))
println(s"Find Chocolate Donut using TailCall = ${tailNotFound.result}")

