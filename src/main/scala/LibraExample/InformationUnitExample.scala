package LibraExample

import libra.ops.base.Show
import libra.units.MetricUnit
import libra.{Quantity, QuantityOf}
/*
object InformationUnitExample {
  type Information

  type Byte = MetricUnit[0, Information]
  type KiloByte = MetricUnit[3, Information]

  implicit def InfoShow: Show[Information] = Show[Information]("Info")

  implicit def ByteShow: Show[Byte] = Show[Byte]("B")
  implicit def KiloByteShow: Show[KiloByte] = Show[KiloByte]("KB")

  implicit final class OwnUnitOps[A](val a: A) extends AnyVal {
    def B: QuantityOf[A, Information, Byte] = Quantity(a)
    def KB: QuantityOf[A, Information, KiloByte] = Quantity(a)
  }

}
import InformationUnitExample._
object principal2 extends App {

  val variable = 3.B

  //quiero mostrar esto, pero cuando defino mas de un metodo SHOW (lineas 46 y 47) ya el
  //programa no sabe cual elegir ¿como lo podría hacer?. Necesitaria muchos mas si los defino
  //para cada uno de los multiplos de Byte.

  println(variable.show)
  val variable2 = 3.KB
  //println(variable2.show)
}
*/