/**
  * Created by vonzhou on 2018/12/22.
  */

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.Map

val ex05: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
val ex05in = new java.util.Scanner(new java.io.File("data.txt"))
while (ex05in.hasNext()) {
  val currWord = ex05in.next()
  val currCount = ex05.getOrElse(currWord, 0)
  ex05(currWord) = currCount + 1
}
println(s"${ex05}")
