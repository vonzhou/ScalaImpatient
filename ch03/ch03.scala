val ch = "Ch03"
println(ch)

println("\nEx01")



println("\nEx02")



println("\nEx03")



println("\nEx04")
val ex04 = Array(-4,-2, -1, 0, 5,4,3,2,1)
val (ex04_pos, ex04_neg) = ex04 partition { _ > 0 }
val ex04a = ex04_pos ++ ex04_neg
printf("%s\n", ex04a.mkString(", "))


println("\nEx05")
def ex05AvgFn(d: Array[Double]) = {
	if (d.length == 0) 	0
	else 				d.sum / d.length
}
def ex05Data = Array(1.2, 2.4, 3.6, 4.8)
def ex05Avg = ex05AvgFn(ex05Data)
printf("Average of (%s) = %s\n", ex05Data.mkString(", "), ex05Avg)



println("\nEx06")
val ex06Array = Array(1,6,3,8,9,3)
val sortedEx06Array = ex06Array.sortWith{ _ < _}
printf("(%s) Sorted Array  = (%s)\n", ex06Array.mkString(", "), sortedEx06Array.mkString(", ")) 

import scala.collection.mutable.ArrayBuffer
val ex06ArrayBuffer = ArrayBuffer(1,6,3,8,9,3)
val sortedEx06ArrayBuffer = ex06ArrayBuffer.sortWith{ _ < _}
printf("(%s) Sorted Buffer = (%s)\n", ex06ArrayBuffer.mkString(", "), sortedEx06ArrayBuffer.mkString(", ")) 



println("\nEx07")
val ex07 = Array(1,6,3,8,9,3,1)
val ex07s = ex07.toSet.toArray
printf("%s set->array %s\n", ex07.mkString(", "), ex07s.mkString(", "))
//Should have used Array.distinct
val ex07a = ex07.distinct
printf("%s distinct %s\n", ex07.mkString(", "), ex07a.mkString(", "))





println("\nEx08")



println("\nEx09")



println("\nEx10")



println(ch + " Done.")