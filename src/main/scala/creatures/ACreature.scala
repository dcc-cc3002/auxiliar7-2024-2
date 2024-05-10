package creatures

import types.Type
import movements.Movement

abstract class ACreature(val name: String, val maxHp: Double, val typ: Type) extends Creature {
  private var hp_ = maxHp

  def hp: Double = hp_

  def damage(amount: Double): Unit = hp_ = Math.max(hp - amount, 0)

  def attack(mov: Movement, target: Creature): Unit = {
    val cMult = typ.bonus(mov.typ)
    val mMult = mov.typ.effect(target.typ)
    target.damage(mov.power * cMult * mMult)
  }

  override def toString(): String = s"$name of type $typ ($hp/$maxHp)"
}
