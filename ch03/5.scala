/**
  * Created by vonzhou on 2018/12/22.
  */
def avg(d: Array[Double]) = {
  if (d.length == 0) 0
  else d.sum / d.length
}

val arr = Array(1.2, 2.4, 3.6, 4.8)
val res = avg(arr)
printf("Average of (%s) = %s\n", arr.mkString(", "), res)
