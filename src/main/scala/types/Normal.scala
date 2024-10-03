package types

class Normal extends AType("Normal") {
  def bonus(other: Type): Double = other.bonusNormal()
  def effect(other: Type): Double = other.effectNormal()

  override def bonusNormal(): Double = BOOST

  override def equals(other: Any): Boolean = other match {
    case n: Normal => true
    case _ => false
  }
}
