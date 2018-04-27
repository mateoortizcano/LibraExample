package LibraExample
import libra._, libra.ops.base._

object catan {
  type Stone
  type Wood
  type Wheat
  type Sheep
  type Time

  type Rock = UnitOfMeasure[Stone]
  type Log = UnitOfMeasure[Wood]
  type Bushel = UnitOfMeasure[Wheat]
  type Flock = UnitOfMeasure[Sheep]
  type Turn = UnitOfMeasure[Time]


  //we ought to provide shows
  implicit def stoneShow: Show[Stone] = Show[Stone]("S")
  implicit def woodShow: Show[Wood] = Show[Wood]("W")
  implicit def wheatShow: Show[Wheat] = Show[Wheat]("F")
  implicit def sheepShow: Show[Sheep] = Show[Sheep]("B")
  implicit def timeShow: Show[Time] = Show[Time]("T")

  implicit def rockShow: Show[Rock] = Show[Rock]("Rock")
  implicit def logShow: Show[Log] = Show[Log]("Log")
  implicit def bushelShow: Show[Bushel] = Show[Bushel]("Bushel")
  implicit def flockShow: Show[Flock] = Show[Flock]("Flock")
  implicit def turnShow: Show[Turn] = Show[Turn]("Turn")


  //implicit conversions would be useful too
  implicit final class CatanOps[A](val a: A) extends AnyVal {
    def logs: QuantityOf[A, Wood, Log] = Quantity(a)
    def rocks: QuantityOf[A, Stone, Rock] = Quantity(a)
    def flocks: QuantityOf[A, Sheep, Flock] = Quantity(a)
    def turns: QuantityOf[A, Time, Turn] = Quantity(a)
  }
}

import catan._
object principal extends App {

  val tradingRate = 4.0.logs / 1.0.flocks

  val flocks = 8.0.flocks * tradingRate

  println(flocks.show)
  // res0: String = 32.0 Log [W]

}
