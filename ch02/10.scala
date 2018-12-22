/**
  * Created by vonzhou on 2018/12/22.
  */
def xPowerN(x: Double, n: Int): Double = {
  import scala.math.pow
  if (n > 0) {
    if (n % 2 == 0) pow(xPowerN(x, n / 2), 2) //even
    else x * xPowerN(x, n - 1) //odd
  }
  else if (n == 0) 1
  else 1 / xPowerN(x, -n)
}
printf("(2.0, 2) = %5f\n", xPowerN(2.0, 2))
printf("(2.0, 3) = %5f\n", xPowerN(2.0, 3))
printf("(2.0, 0) = %5f\n", xPowerN(2.0, 0))
printf("(2.0,-2) = %5f\n", xPowerN(2.0, -2))
