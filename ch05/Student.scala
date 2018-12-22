/**
  * Created by vonzhou on 2018/12/22.
  */

// ex5
import scala.beans.BeanProperty

class Student(@BeanProperty var name: String, @BeanProperty var id: Long)

/**
  * #scalac 5.scala
  * #javap - private Student
  */

