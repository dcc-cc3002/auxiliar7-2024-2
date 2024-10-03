package movements

import types.Grass

class Leafage extends AMovement("Leafage", 40, new Grass()) {

  override def equals(other: Any): Boolean = other match {
    case e: Leafage => true
    case _ => false
  }
}
