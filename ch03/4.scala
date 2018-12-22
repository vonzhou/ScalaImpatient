/**
  * Created by vonzhou on 2018/12/22.
  */
def positiveNegative(a: Array[Int]) = {
  a.filter(_ > 0) ++ a.filter(_ <= 0)
}

val test = Array(10, 7, -5, 11, -44, 0, 22, -22, -100, 77, -5);
val res = positiveNegative(test)

println(test.mkString("Array(", ", ", ")"))
println(res.mkString("Array(", ", ", ")"))


println("================")

val ex04 = Array(-4, -2, -1, 0, 5, 4, 3, 2, 1)
val (postPart, other) = ex04 partition {
  _ > 0
}
val ex04a = postPart ++ other
printf("%s\n", ex04a.mkString(", "))