import spire.implicits._

import libra._, libra.implicits._
//La idea es que muestren en qué principios se basa para lograr lo que hace y
// dar ejemplos de cómo se usa.

object Usage  extends App {
  println(7.km.show())
  println((3.m + 2.m).show)
  println((3.m * 2.m).show)
  println((r"1/3".m + r"2/3".m).show)
  println((3.0.m / 2.0.kg).show)
  println((3.0.m^(3)).show)
  println(3.0.m.invert.show)
  println((3.m :* 3).show)
  println((3 *: 3.m).show)
  println(3.km.value)
  println((3.0.km / 1.0.s).to[Centimetre].to[Millisecond].show)
  println((1.0.km.to[Metre] + 2.0.m + 3.0.mm.to[Metre]).show)
  println((3.0.s.to[Millisecond] / 3.0.ms).show)
  val distance = 3.0.m
  val time = 2.0.s
  println((distance / time).show)
  println((distance.to[Kilometre] / time.to[Kilosecond]).show)
}
