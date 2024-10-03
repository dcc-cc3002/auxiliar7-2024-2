package movements

import types.Normal


class Round extends AMovement("Round", 60, new Normal()) {
  override def equals(other: Any): Boolean = other match {
    case e: Round => true
    case _ => false
  }

}
