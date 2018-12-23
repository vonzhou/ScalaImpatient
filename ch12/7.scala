def adjustToPair(x: ((Int, Int)) => (Int)) = (in: (Int, Int)) => x(in)
def fn(x: (Int, Int)) = x._1 + x._2

def pairs = (1 to 10) zip (11 to 20)
def res = pairs.map(fn(_));
println(pairs + "\n" + res)