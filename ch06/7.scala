/**
  * Created by vonzhou on 2018/12/22.
  */
object Suits extends Enumeration {
  type Suits = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")

  def isRed(card: Suits) = card == Heart || card == Diamond
}

println(for (s <- Suits.values) yield (s, Suits.isRed(s)))
