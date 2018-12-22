/**
  * Created by vonzhou on 2018/12/22.
  */
val ex10 = "abcdefg"

val ex10_take = ex10.take(2)
printf("     take(2) from '%s' = %s\n", ex10, ex10_take)

val ex10_drop = ex10.drop(2)
printf("     Drop(2) from '%s' = %s\n", ex10, ex10_drop)

val ex10_takeRight = ex10.takeRight(2)
printf("takeRight(2) from '%s' = %s\n", ex10, ex10_takeRight)

val ex10_dropRight = ex10.dropRight(2)
printf("dropRight(2) from '%s' = %s\n", ex10, ex10_dropRight)
