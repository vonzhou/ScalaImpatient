import java.io.PrintWriter

import scala.io.Source

val ex01 = Source.fromFile("ex01.in")
val ex01b = ex01.toBuffer.reverse
val ex01out = new PrintWriter("ex01.out")
for (s <- ex01b) {
  ex01out.print(s)
}
ex01out.close()
