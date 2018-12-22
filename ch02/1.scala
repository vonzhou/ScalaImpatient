/**
  * Created by vonzhou on 2018/12/22.
  */
def signum(n: Int) = {
  if (n > 0) 1
  else if (n == 0) 0
  else -1
}

printf("signum(%2d) = %2d\n", 5, signum(5))
printf("signum(%2d) = %2d\n", 0, signum(0))
printf("signum(%2d) = %2d\n", -5, signum(-5))
