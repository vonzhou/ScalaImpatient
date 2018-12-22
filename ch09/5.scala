import java.io.PrintWriter

val ex05out = new PrintWriter("ex05.out")
for (i <- 0 to 20) {
  val s = "%2d\t\t%10.9f".format(i, 1.0 / math.pow(2, i))
  ex05out.println(s)
}
ex05out.close()
