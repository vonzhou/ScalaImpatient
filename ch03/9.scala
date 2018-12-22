/**
  * Created by vonzhou on 2018/12/22.
  */
def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val zones = java.util.TimeZone.getAvailableIDs

val american = zones.filter(_.startsWith("America/")).map(_.drop("America/".size))

prn(american)
