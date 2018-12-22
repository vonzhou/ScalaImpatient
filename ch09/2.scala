import java.io.PrintWriter

import scala.io.Source

val ex02 = Source.fromFile("ex02.in").mkString

def ex02replaceFn(s: String, n: Int) = {
  val ex02pattern = """\t""".r
  ex02pattern.replaceAllIn(s, " " * n)
}
val ex02out = new PrintWriter("ex02.out")
ex02out.print(ex02replaceFn(ex02, 5))
ex02out.close()
