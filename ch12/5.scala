def largest(fn: (Int) => Int, in: Seq[Int]) = {
  in.map(fn).max
}
val ex05a = Array(9, 1, 6, 2, 4, 7, 5, 3, 8)
val ex05 = largest(x => 10 * x - x * x, ex05a);
println(s"max of fn<--[${ex05a.mkString(",")}] is ${ex05}")