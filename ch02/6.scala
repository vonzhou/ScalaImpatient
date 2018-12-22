/**
  * Created by vonzhou on 2018/12/22.
  */
val str = "Hello"
var product: Int = 1
for (c <- str) {
  product *= c.toInt
}
printf("%s = %s\n", str, product)
