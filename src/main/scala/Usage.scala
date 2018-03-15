import spire.implicits._

import libra._, libra.si._
//La idea es que muestren en qué principios se basa para lograr lo que hace y
// dar ejemplos de cómo se usa.

object Usage  extends App {

  println((3.m + 2.m).show)
  println((3.m * 2.m).show)
  println((1.0.km.to[Metre] + 2.0.m + 3.0.mm.to[Metre]).show)
  println((3.0.s.to[Millisecond] / 3.0.ms).show)
  val distance = 3.0.m
  val time = 2.0.s
  println((distance / time).show)
  println((distance.to[Kilometre] / time.to[Kilosecond]).show)
}
