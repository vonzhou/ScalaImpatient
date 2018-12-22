/**
  * Created by vonzhou on 2018/12/22.
  */
def randArray(n: Int) = {
  import scala.util.Random
  for (i <- 0 to n) yield Random.nextInt(n) // [)
}
val ex01 = randArray(15)
println(ex01)
