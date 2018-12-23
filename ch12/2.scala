val arr = Array(1, 6, 2, 4, 7, 5)
val max = arr.reduceLeft(math.max(_, _));
println(s"max of [${arr.mkString(",")}] is ${max}")