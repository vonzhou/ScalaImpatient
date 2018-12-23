trait RectangleLike {
  def translate(x: Double, y: Double) {
    move(x, y)
  }

  def grow(x: Double, y: Double) {
    expand(x, y)
  }

  protected def move(x: Double, y: Double)

  protected def expand(w: Double, h: Double)
}

def printEllipse(e: java.awt.geom.Ellipse2D.Double) {
  println(s"(x, y, w, h) = (${e.x}, ${e.y}, ${e.width}, ${e.height})")
}

val ex01 = new java.awt.geom.Ellipse2D.Double(0, 0, 10, 20) with RectangleLike {
  def move(dx: Double, dy: Double) {
    x += dx
    y += dy
  }

  def expand(w: Double, h: Double) {
    width += w
    height += h
  }
}
printEllipse(ex01)
ex01.translate(10, -10)
printEllipse(ex01)
ex01.grow(10, 20)
printEllipse(ex01)