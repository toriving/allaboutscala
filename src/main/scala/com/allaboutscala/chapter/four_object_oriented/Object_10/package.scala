package com.allaboutscala.chapter.four_object_oriented

package object Object_10 {
  println("Step 2: How to define a case class to represent a Donut object in a package object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)
}

