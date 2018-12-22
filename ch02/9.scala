/**
  * Created by vonzhou on 2018/12/22.
  */
def recursiveProd(s: String): Long = {
  if (s.length == 0) 1
  else s.head * recursiveProd(s.tail)
}
val ex09_str = "Hello"
def ex09 = recursiveProd(ex09_str)
printf("%s = %s\n", ex09_str, ex09)
