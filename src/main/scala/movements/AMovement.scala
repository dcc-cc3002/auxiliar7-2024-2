package movements

import types.Type

class AMovement(val name: String, val power: Double, val typ: Type) extends Movement {
  override def toString() = s"$name of $typ ($power)"
}
