/**
  * Created by vonzhou on 2018/12/22.
  */
val arr = Array(1, 6, 3, 8, 9, 3)
val arrSorted = arr.sortWith {
  _ < _
}
printf("(%s) Sorted Array  = (%s)\n", arr.mkString(", "), arrSorted.mkString(", "))

import scala.collection.mutable.ArrayBuffer

val arrBuffer = ArrayBuffer(1, 6, 3, 8, 9, 3)
val arrBufferSorted = arrBuffer.sortWith {
  _ < _
}
printf("(%s) Sorted Buffer = (%s)\n", arrBuffer.mkString(", "), arrBufferSorted.mkString(", "))
