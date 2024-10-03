package types

trait Type {
  val name: String

  def bonus(other: Type): Double

  def effect(other: Type): Double

  def bonusGrass(): Double
  def bonusFire(): Double
  def bonusWater(): Double
  def bonusNormal(): Double


  def effectGrass(): Double
  def effectFire(): Double
  def effectWater(): Double
  def effectNormal(): Double
}
