import spire.implicits._
// import spire.implicits._

import libra._, libra.si._
// import libra._
// import libra.si._

import scala.util.{Try, Success, Failure}


object Usage  extends App {

  println((3.m + 2.m).show)
  // res0: String = 5 m [L]

  println((3.m * 2.m).show)
  // res1: String = 6 m^2 [L^2]

  println((1.0.km.to[Metre] + 2.0.m + 3.0.mm.to[Metre]).show)
  // res2: String = 1002.003 m [L]

  println((3.0.s.to[Millisecond] / 3.0.ms).show)
  // res3: String = 1000.0  []   ^

  //println(Try(3.m + 2.kg)) // This should fail
  // <console>:22: error: These quantities can't be added!
  // Most likely they have different dimensions.  If not, make sure that there's an implicit AdditiveSemigroup in scope.
  // Left: libra.Quantity[Int,libra.Term[libra.si.package.Length,libra.si.package.Metre,libra.Fraction[Int(1),Int(1)]] :: shapeless.HNil]
  // Right: libra.Quantity[Int,libra.Term[libra.si.package.Mass,libra.si.package.Kilogram,libra.Fraction[Int(1),Int(1)]] :: shapeless.HNil]
  //        3.m + 2.kg // This should fail
  //            ^

  val distance = 3.0.m
  // distance: libra.QuantityOf[Double,libra.si.package.Length,libra.si.package.Metre] = Quantity(3.0)

  val time = 2.0.s
  // time: libra.QuantityOf[Double,libra.si.package.Time,libra.si.package.Second] = Quantity(2.0)

  //println(Try( distance + time ))
  // <console>:33: error: These quantities can't be added!
  // Most likely they have different dimensions.  If not, make sure that there's an implicit AdditiveSemigroup in scope.
  // Left: libra.Quantity[Double,libra.Term[libra.si.package.Length,libra.si.package.Metre,libra.Fraction[Int(1),Int(1)]] :: shapeless.HNil]
  // Right: libra.Quantity[Double,libra.Term[libra.si.package.Time,libra.si.package.Second,libra.Fraction[Int(1),Int(1)]] :: shapeless.HNil]
  //        distance + time
  //                 ^

  println((distance / time).show) // Yay!
  println((distance.to[Kilometre] / time.to[Kilosecond]).show) // Yay!
  // res6: String = 1.5 m s^-1 [L T^-1]

}
