def ex06LargestsInput(fn: (Int) => Int, in: Seq[Int]) = {
  val seqWithIndex = in.zipWithIndex
  val seqFn = for (i <- seqWithIndex) yield (fn(i._1), i._1)
  seqFn.maxBy(_._1)._2
}
val ex06a = Array(9, 1, 6, 2, 4, 7, 5, 3, 8)
val ex06 = ex06LargestsInput(x => 10 * x - x * x, ex06a);
println(s"max of fn<--[${ex06a.mkString(",")}] is ${ex06}")