package LibraExample

import libra.ops.base.Show
import libra.{Quantity, QuantityOf, UnitOfMeasure, ops}
import libra.si.MetricUnit
import singleton.ops._

object InformationUnitExample {
  type Information

  /* EN LAS UNIDADES DEL SISTEMA INTERNACIONAL LOS DEFINEN ASÍ Y NO LES GENERA ERRORES
  * type Length
  type Mass
  type Time
  type Current
  type Temperature
  type Amount
  type Intensity

  type Kilometre = MetricUnit[3, Length]
  type Metre = MetricUnit[0, Length]
  type Decimetre = MetricUnit[-1, Length]
  type Centimetre = MetricUnit[-2, Length]
  type Millimetre = MetricUnit[-3, Length]
  type Micrometre = MetricUnit[-6, Length]
  type Nanometre = MetricUnit[-9, Length]
  type Picometre = MetricUnit[-12, Length]
  type Femtometre = MetricUnit[-15, Length]
  type Attometre = MetricUnit[-18, Length]*/


  //MIENTRAS QUE A MÍ SÍ ¿POR QUE?
  type Byte = MetricUnit[0, Information]
  type KiloByte = MetricUnit[3, Information]
  type MegaByte = MetricUnit[6, Information]
  type GigaByte = MetricUnit[9, Information]
  type TeraByte = MetricUnit[12, Information]

  //LA UNICA SOLUCIÓN QUE DESCUBRÍ ERA PONER EL TIPO XInt en lugar del número
  //type Byte = MetricUnit[XInt, Information]
  //si hago eso el problema se resuelve pero se origina otro problema al realizar la operacion
  // show como mas delante expico

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

  //quiero mostrar esto, pero cuando defino mas de un metodo SHOW (lineas 46 y 47) ya el
  //programa no sabe cual elegir ¿como lo podría hacer?. Necesitaria muchos mas si los defino
  //para cada uno de los multiplos de Byte.

  println(variable.show)
  val variable2 = 3.KB
  //println(variable2.show)
}
