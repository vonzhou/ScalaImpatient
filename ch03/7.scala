/**
  * Created by vonzhou on 2018/12/22.
  */
val ex07 = Array(1, 6, 3, 8, 9, 3, 1)
val ex07s = ex07.toSet.toArray
printf("%s set->array %s\n", ex07.mkString(", "), ex07s.mkString(", "))
//Should have used Array.distinct
val ex07a = ex07.distinct
printf("%s distinct %s\n", ex07.mkString(", "), ex07a.mkString(", "))
