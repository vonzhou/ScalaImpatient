/**
  * Created by vonzhou on 2018/12/22.
  */
def lteqgt(values: Array[Int], v: Int) = {
  val lt = values.filter(_ < v).size
  val eq = values.filter(_ == v).size
  val gt = values.filter(_ > v).size
  (lt, eq, gt)
}
val ex09d = Array(1, 2, 4, 0, 3, 8, 7, -1)
val ex09 = lteqgt(ex09d, 2)
println(s"(${ex09d.mkString(", ")}) -> ${ex09}")
