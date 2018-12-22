import scala.io.Source

val ex04 = Source.fromFile("ex04.in").getLines().toArray.map(_.toDouble)
val ex04sum = ex04.sum
val ex04avg = ex04sum / ex04.size
val ex04min = ex04.min
val ex04max = ex04.max
println(s"sum = ${ex04sum}   avg = ${ex04avg} min=${ex04min} max=${ex04max}")
