/**
  * Created by vonzhou on 2018/12/22.
  */
class Person(val name: String) {
  val firstName = name.split("\\s+")(0)
  val lastName = name.split("\\s+")(1)

  override def toString = "Person(" + firstName + ", " + lastName + ")"
}

val p = new Person("John Smith")
println(p)
