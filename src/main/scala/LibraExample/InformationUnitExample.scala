package LibraExample

import libra.ops.base.Show
import libra.{Quantity, QuantityOf, UnitOfMeasure, ops}
import libra.si.MetricUnit
import singleton.ops._

object InformationUnitExample {
  type Information

  type oth = UnitOfMeasure[Information]

  type KiloByte = MetricUnit[XInt, Information]
  type MegaByte = MetricUnit[XInt, Information]
  type GigaByte = MetricUnit[XInt, Information]
  type TeraByte = MetricUnit[XInt, Information]

  implicit def InfoShow: Show[Information] = Show[Information]("Info")

  implicit def ByteShow: Show[Byte] = Show[Byte]("B")
  implicit def KiloByteShow: Show[KiloByte] = Show[KiloByte]("KB")

  //implicit conversions would be useful too
  implicit final class OwnUnitOps[A](val a: A) extends AnyVal {
    def B: QuantityOf[A, Information, Byte] = Quantity(a)
    def KB: QuantityOf[A, Information, KiloByte] = Quantity(a)
  }

}
import InformationUnitExample._
object principal2 extends App {

  val variable = 3.B
  //println(variable.show)
  val variable2 = 3.KB
  //println(variable2.show)
  val a = variable2.to[KiloByte].show()
  print(a)
}
