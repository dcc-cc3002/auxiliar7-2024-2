package types

class Fire extends AType("Fire") {
  def bonus(other: Type): Double = {
    other.bonusFire()
  }

  def effect(other: Type): Double = {
    other.effectFire()
  }

  override def bonusFire(): Double = BOOST
  override def bonusWater(): Double = SUPEREFFECTIVE
}
