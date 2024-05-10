package types

abstract class AType(val name: String) extends Type {
  protected val BASIC = 1.0
  protected val BOOST = 1.5
  protected val NO_EFFECT = 0.0
  protected val INEFFECTIVE = 0.5
  protected val SUPEREFFECTIVE = 2.0


  def bonusFire(): Double = BASIC
  def bonusWater(): Double = BASIC
  def bonusGrass(): Double = BASIC

  def effectFire(): Double = BASIC
  def effectWater(): Double = BASIC
  def effectGrass(): Double = BASIC

  override def toString(): String = name
}
