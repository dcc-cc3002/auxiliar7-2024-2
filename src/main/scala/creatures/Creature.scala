package creatures

import movements.Movement
import types.Type

trait Creature{
  val name: String
  val typ: Type
  val maxHp: Double
  def hp: Double
  def attack(m: Movement, t: Creature): Unit
  def damage(amount: Double): Unit
}
