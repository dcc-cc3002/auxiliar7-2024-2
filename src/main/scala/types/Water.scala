package types

class Water extends AType("Water") {
  def bonus(other: Type): Double = other.bonusWater()
  def effect(other: Type): Double = other.effectWater()

  override def bonusWater(): Double = BOOST
  override def effectGrass(): Double = SUPEREFFECTIVE
  override def effectFire(): Double = INEFFECTIVE


  override def equals(other: Any): Boolean = other match {
    case w: Water => true
    case _ => false
  }
}
