// Scala Tutorial - Learn How To Create Trampoline Tail Recursive Function Using scala.util.control.TailCalls._

// Overview
//In this tutorial, we will learn how to create trampoline tail recursive function by making use of utilities that Scala provides for tail recursions in the package scala.util.control.TailCalls._
//Say you had two tail recursive functions F(A) and F(B) and that F(A) calls F(B) but in turn F(B) also calls F(A).
//Then F(A) is said to be a trampoline tail recursive function because the call stack jumps back and forth between the two functions F(A) and F(B) - hence the name trampoline.
//As a reminder from the previous tutorial on Tail Recursive Function, tail recursive function will help prevent overflow in your call stack because the evaluation of your looping construct happens at each step.
//This tutorial will also make use of TailRec which we have seen from the previous tutorial on How to Create Tail Recursive Function using scala.util.control.TailCalls.

import scala.util.control.TailCalls._

println("Step 1: How to define a trampoline function using scala.util.control.TailCalls")
def verySweetDonut(donutList: List[String]): TailRec[Boolean] = {
  println(s"verySweetDonut function: donut list = $donutList")
  if (donutList.isEmpty) {
    println("verySweetDonut function: donut list isEmpty, returning false")
    done(false)
  } else {
    if(Set(donutList.head).subsetOf(Set("Vanilla Donut","Strawberry Donut","Glazed Donut"))) {
      println(s"verySweetDonut function: found donut list's head = ${donutList.head} to be VERY sweet, returning true")
      done(true)
    } else {
      println(s"verySweetDonut function: donut list's head = ${donutList.head} is NOT VERY sweet, forwarding donut list's to notSweetDonut function")
      tailcall(notSweetDonut(donutList))
    }
  }
}



println("\nStep 2: How to define a trampoline function using scala.util.control.TailCalls")
def notSweetDonut(donutList: List[String]): TailRec[Boolean] = {
  println(s"notSweetDonut function: with donut list = $donutList")
  if (donutList.isEmpty) {
    println("notSweetDonut function: donut list isEmpty, returning false")
    done(false)
  } else {
    println(s"notSweetDonut function: donut list's head = ${donutList.head} is NOT sweet, forwarding donut list's tail to verySweetDonut function")
    tailcall(verySweetDonut(donutList.tail))
  }
}



println("\nStep 3: How to call a trampoline tail recursive function")
val donutList: List[String] = List("Plain Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
val foundVerySweetDonut = tailcall(verySweetDonut(donutList)).result
println(s"Found very sweet donut = $foundVerySweetDonut")