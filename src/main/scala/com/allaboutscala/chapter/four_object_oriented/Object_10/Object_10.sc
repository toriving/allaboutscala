// Scala Tutorial - Learn How To Use Package Object

// Overview
//In this tutorial, we will learn how use Package Objects to store and encapsulate common Objects and Implicit conversions.
//
//
//
//Objects and Implicit conversions declared inside Package Objects, as the name implies, will be accessible to any classes or traits in the given package. In addition, Package Objects make it easy to inject these Objects and Implicit conversions into other scopes within your application.

//println("\nStep 1: How to add JodaTime dependency in build.sbt")
//libraryDependencies ++= Seq(
//  "joda-time" % "joda-time" % "2.9.3",
//  "org.joda" % "joda-convert" % "1.8"
//)

//package object four {
//
//  println("Step 2: How to define a case class to represent a Donut object in a package object")
//  case class Donut(name: String, price: Double, productCode: Option[Long] = None)
//
//}
//

println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
implicit class AugmentedDonut(donut: Donut) {
  def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
}

println("\nStep 4: How to alias JodaTime to a DateTime type")
type DateTime = org.joda.time.DateTime

object PackageObject_Tutorial extends App {

  println("\nStep 5: How to create instances or objects for the Donut case class from package object")
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${vanillaDonut.name}")
  println(s"Vanilla donut price = ${vanillaDonut.price}")
  println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")
  println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

  println("\nStep 6: How to create new JodaTime instance using DateTime alias from package object")
  val today = new DateTime()
  println(s"today = $today, datetime class = ${today.getClass}")