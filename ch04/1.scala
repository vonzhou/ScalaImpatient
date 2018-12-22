/**
  * Created by vonzhou on 2018/12/22.
  */
val originMap = Map("Thing A" -> 10, "Thing B" -> 50, "Thing C" -> 10000)
val res1 = for ((k, v) <- originMap) yield {
  k -> v * 0.9
}
println(s"${originMap} -> ${res1}")

val res2 = for ((k, v) <- originMap) yield (k, v * 0.9)
println(s"${res2}")
