package types

class Fire extends AType("Fire") {
  def bonus(other: Type): Double = {
    other.bonusFire()
  }

  def effect(other: Type): Double = {
    other.effectFire()
  }

  override def bonusFire(): Double = BOOST
  override def effectWater(): Double = SUPEREFFECTIVE
  override def effectGrass(): Double = INEFFECTIVE

  override def equals(other: Any): Boolean = other match {
    case f: Fire => true
    case _ => false
  }
}
