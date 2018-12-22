/**
  * Created by vonzhou on 2018/12/22.
  */
def countdown(n: Int) {
  for (i <- n to 0 by -1) {
    print(i + " ")
  }
  println("")
}
countdown(10)
