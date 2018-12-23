def values(fn: (Int) => Int, lo: Int, hi: Int) = {
  for (i <- lo to hi) yield (i, fn(i))
}
def ex01 = values(x => x * x, 0, 10);
println(ex01)