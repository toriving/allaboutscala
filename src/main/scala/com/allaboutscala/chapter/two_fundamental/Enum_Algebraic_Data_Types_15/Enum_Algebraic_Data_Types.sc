// Define a new enumeration with a type alias and work with the full set of enumerated values
object WeekDay extends Enumeration {
  type WeekDay = Value
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}
import WeekDay._

def isWorkingDay(d: WeekDay) = ! (d == Sat || d == Sun)

WeekDay.values filter isWorkingDay foreach println

// output:
// Mon
// Tue
// Wed
// Thu
// Fri

// Example of adding attributes to an enumeration by extending the Enumeration.Val class
object Planet extends Enumeration {
  protected case class Val(mass: Double, radius: Double) extends super.Val {
    def surfaceGravity: Double = Planet.G * mass / (radius * radius)
    def surfaceWeight(otherMass: Double): Double = otherMass * surfaceGravity
  }
  import scala.language.implicitConversions
  implicit def valueToPlanetVal(x: Value): Val = x.asInstanceOf[Val]

  val G: Double = 6.67300E-11
  val Mercury = Val(3.303e+23, 2.4397e6)
  val Venus   = Val(4.869e+24, 6.0518e6)
  val Earth   = Val(5.976e+24, 6.37814e6)
  val Mars    = Val(6.421e+23, 3.3972e6)
  val Jupiter = Val(1.9e+27, 7.1492e7)
  val Saturn  = Val(5.688e+26, 6.0268e7)
  val Uranus  = Val(8.686e+25, 2.5559e7)
  val Neptune = Val(1.024e+26, 2.4746e7)
}

println(Planet.values.filter(_.radius > 7.0e6))
// output:
// Planet.ValueSet(Jupiter, Saturn, Uranus, Neptune)

println("Step 1: How to create an enumeration")
object Donut extends Enumeration {
  type Donut = Value

  val Glazed      = Value("Glazed")
  val Strawberry  = Value("Strawberry")
  val Plain       = Value("Plain")
  val Vanilla     = Value("Vanilla")
}

println(s"Vanilla Donut string value = ${Donut.Vanilla}")
println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")

println("\nStep2: Defining Algebraic Data Types using sealed traits")
sealed trait BakingEvents
final case object BakeDonut extends BakingEvents
final case object AddTopping extends BakingEvents
final case object StopBaking extends BakingEvents

def prettyPrintBakingEvent(bakingEvent: BakingEvents): Unit = bakingEvent match{
  case BakeDonut => println("BakeDonut event was used in Pattern Matching")
  case AddTopping => println("AddTopping event was used in Pattern Matching")
  case StopBaking => println("StopBaking event was used in Pattern Matching")
}
