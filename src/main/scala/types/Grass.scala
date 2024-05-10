package types

class Grass extends AType("Grass") {
  def effect(other: Type): Double = other.effectGrass()
  def bonus(other: Type): Double = other.bonusGrass()

  override def bonusGrass(): Double = BOOST
  override def effectFire(): Double = SUPEREFFECTIVE
  override def effectWater(): Double = INEFFECTIVE

  override def equals(other: Any): Boolean = other match {
    case g: Grass => true
    case _ => false
  }
}
