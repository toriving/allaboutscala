// Scala Tutorial - Learn How To Use Implicit Class - Extension Methods

// Overview
//In this tutorial, we will learn how use Implicit Class to add methods to an object without modifying the source code of the object - also commonly known as extension methods.
//
//
//
//Using Implicit Class to extend functionality of an object can be quite handy especially when you do have have access to modify the source object.

println("Step 1: How to define a case class to represent a Donut object")
case class Donut(name: String, price: Double, productCode: Option[Long] = None)

println("\nStep 2: How to create instances or objects for the Donut case class")
val vanillaDonut: Donut = Donut("Vanilla", 1.50)
println(s"Vanilla donut name = ${vanillaDonut.name}")
println(s"Vanilla donut price = ${vanillaDonut.price}")
println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")

println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
object DonutImplicits {
  implicit class AugmentedDonut(donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }
}

println("\nStep 4: How to import and use the implicit class AugmentedDonut from Step 3")
import DonutImplicits._
println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

val vanillaDonut2: Donut = Donut("Vanilla2", 1.502)
println(s"Vanilla2 donut uuid = ${vanillaDonut2.uuid}")

// 클래스의 기본생성자를 암묵적으로 호출 -> 인자로 들어가는 타입이 클래스