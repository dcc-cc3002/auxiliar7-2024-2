package creatures

import excepcions.NotLearnMovement
import types.Type
import movements.Movement

import scala.collection.mutable.ArrayBuffer


abstract class ACreature(val name: String, val maxHp: Double, val typ: Type) extends Creature {
  private var hp_ = maxHp
  protected var allowMovements = new ArrayBuffer[Movement]()

  def hp: Double = hp_

  def damage(amount: Double): Unit = hp_ = Math.max(hp - amount, 0)

  def attack(mov: Movement, target: Creature): Unit = {
    checkMovement(mov)
    val cMult = typ.bonus(mov.typ)
    val mMult = mov.typ.effect(target.typ)
    target.damage(mov.power * cMult * mMult)
  }

  private def checkMovement(mov: Movement): Unit = {
    var isAllow = false
    for (m <- allowMovements) {
      isAllow ||= mov == m
    }
    if (!isAllow) throw new NotLearnMovement(mov, this)
  }

  override def toString(): String = s"$name of type $typ ($hp/$maxHp)"
}
