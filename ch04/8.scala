/**
  * Created by vonzhou on 2018/12/22.
  */
def minmax(values: Array[Int]) = {
  var minVal = Int.MaxValue
  var maxVal = Int.MinValue
  for (v <- values) {
    minVal = minVal min v
    maxVal = maxVal max v
  }
  (minVal, maxVal)
}
val in = Array(-4, 10, 3, 9, 7)
val res = minmax(in)
println(s"(min,max) of (${in.mkString(", ")}) is ${res}")
