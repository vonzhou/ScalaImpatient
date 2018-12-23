trait Logger {
  //trait Logged removed in 2.10
  def log(msg: String) {}
}

trait CryptoLogger extends Logger {
  override def log(msg: String) {
    println(encrypt(msg, 3))
  }

  def encrypt(s: String, key: Int) = {
    var ns = new StringBuilder
    for (c <- s) {
      ns += (c.toInt + key).toChar
    }
    ns.mkString
  }
}

class LoggedMessage(msg: String) extends Logger {
  def logIt() {
    log(msg)
  }
}

val ex04 = new LoggedMessage("Secret Message") with CryptoLogger
ex04.logIt()