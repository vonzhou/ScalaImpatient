def fact(n: Int) = (1 to n).foldLeft(1)(_ * _)
val ex04 = fact(5);
println(s"fact(5) = ${ex04}")