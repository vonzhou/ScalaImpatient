trait Logger {
  def log(msg: String)
}


class ConsoleLogger extends Logger {
  def log(msg: String): Unit = {
    println(msg)
  }
}


new ConsoleLogger().log("hello")