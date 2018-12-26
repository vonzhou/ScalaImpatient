val arr = Array(0, 1, 2, 3)

val res = arr match {
  case Array(0) => "0"
  case Array(x, y) => x + " " + y
  case Array(0, _*) => "0..."
  case _ => "sth else"
}

println(res)