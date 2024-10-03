package movements

import types.Normal


class Tackle extends AMovement("Tackle", 40, new Normal()) {
  override def equals(other: Any): Boolean = other match {
    case e: Tackle => true
    case _ => false
  }

}
