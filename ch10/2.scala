class OrderedPoint(x: Int, y: Int) extends java.awt.Point(x, y) with scala.math.Ordered[java.awt.Point] {
  def compare(p: java.awt.Point) = {
    if (x == p.x && y == p.y) 0
    else if ((x < p.x) || ((x == p.x) && (y < p.y))) -1
    else 1
  }
}

val ex02a = new OrderedPoint(2, 2)
val ex02b = new OrderedPoint(3, 3)
val ex02c = new OrderedPoint(2, 2)
println(s"${ex02a.compare(ex02b)}")
println(s"${ex02b.compare(ex02a)}")
println(s"${ex02a.compare(ex02c)}")