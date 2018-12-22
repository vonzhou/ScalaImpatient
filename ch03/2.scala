/**
  * Created by vonzhou on 2018/12/22.
  */

var arr = Array(1, 2, 3, 4, 5)
for (i <- 0 to arr.length - 1 by 2) {
  if (i + 1 < arr.length) {
    val t = arr(i + 1)
    arr(i + 1) = arr(i)
    arr(i) = t
  }
}

for (i <- 0 to arr.length - 1)
  printf("%s\n", arr(i))



