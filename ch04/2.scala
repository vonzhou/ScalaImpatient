/**
  * Created by vonzhou on 2018/12/22.
  */

import scala.collection.mutable.Map

val ex02 = new scala.collection.mutable.HashMap[String, Int]
val ex02in = new java.util.Scanner(new java.io.File("data.txt"))
while (ex02in.hasNext()) {
  val currWord = ex02in.next()
  val currCount = ex02.getOrElse(currWord, 0)
  ex02(currWord) = currCount + 1
}
println(s"${ex02}")
