import scala.io.Source

for (s <- Source.fromFile("ex03.in").getLines()) {
  if (s.size >= 12) println(s)
}

