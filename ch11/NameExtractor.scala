//p147

object Name {
  def unapplySeq(input: String): Option[Seq[String]] =
    if (input.trim == "") None else Some(input.trim.split("\\s+"))
}

var author = "van der a b"

author match {
  case Name(first, last) => "aaaa"
  case Name(first, middle, last) => "bbbb"
  case _ => "__________"
}