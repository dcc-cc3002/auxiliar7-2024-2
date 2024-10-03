package movements

import types.Grass


class RazorLeaf extends AMovement("Razor Leaf", 55, new Grass()) {

  override def equals(other: Any): Boolean = other match {
    case e: RazorLeaf => true
    case _ => false
  }
}
