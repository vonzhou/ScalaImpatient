/**
  * Created by vonzhou on 2018/12/22.
  */
val str = "Hello"
val product = (1L /: str)(_*_)
printf("%s = %sL\n", str, product)
