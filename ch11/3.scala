class Fraction(num: Int, den: Int) {
  private val n = if (den == 0) 1 else num * sign(den) / gcd(num, den)
  private val d = if (den == 0) 0 else den * sign(den) / gcd(n, den)

  def +(f: Fraction) = Fraction(n * f.d + d * f.n, d * f.d)

  def -(f: Fraction) = Fraction(n * f.d - d * f.n, d * f.d)

  def *(f: Fraction) = Fraction(n * f.n, d * f.d)

  def /(f: Fraction) = Fraction(n * f.d, d * f.n)

  private def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

  private def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

  override def toString = s"${n}/${d}"
}

object Fraction {
  def apply(n: Int, d: Int) = {
    new Fraction(n, d)
  }
}

val ex03a = Fraction(1, 2)
val ex03b = Fraction(2, 4)
println(s"${ex03a} + ${ex03b} = ${ex03a + ex03b}")
println(s"${ex03a} - ${ex03b} = ${ex03a - ex03b}")
println(s"${ex03a} * ${ex03b} = ${ex03a * ex03b}")
println(s"${ex03a} / ${ex03b} = ${ex03a / ex03b}")