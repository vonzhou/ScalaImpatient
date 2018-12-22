/**
  * Created by vonzhou on 2018/12/22.
  */
def product(s: String) = {
  (1L /: s) (_ * _)
}
val ex08_str = "Hello"
def ex08 = product(ex08_str)
printf("%s = %sL\n", ex08_str, ex08)
