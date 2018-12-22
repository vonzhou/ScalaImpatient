/**
  * Created by vonzhou on 2018/12/22.
  */


var counter = new scala.collection.immutable.HashMap[String, Int]
val input = new java.util.Scanner(new java.io.File("data.txt"))
while (input.hasNext()) {
  val currWord = input.next()
  counter = counter + (currWord -> (counter.getOrElse(currWord, 0) + 1))
}
println(s"${counter}")