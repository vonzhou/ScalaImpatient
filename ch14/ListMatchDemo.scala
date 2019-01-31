val lst = List(0, 1, 2, 3)

val res = lst match {
  case 0 :: Nil => "0"
  case x :: y :: Nil => x + " " + y
  case 0 :: _ => "0..."
  case _ => "sth else"
}

println(res)