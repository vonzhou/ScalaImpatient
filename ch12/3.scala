def fact(n: Int) = {
  if (n < 1) 0
  else (1 to n).reduceLeft(_ * _)
}
val ex03 = fact(5);
println(s"fact(5) = ${ex03}")