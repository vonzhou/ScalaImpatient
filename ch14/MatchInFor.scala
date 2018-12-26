import scala.collection.JavaConversions.propertiesAsScalaMap;

for((k, v) <- System.getProperties){
  println(k + " -> " + v)
}