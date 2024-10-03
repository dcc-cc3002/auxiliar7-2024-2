package movements

import types.Water

class WaterGun extends AMovement("Water Gun", 40, new Water()) {
  override def equals(other: Any): Boolean = other match {
    case e: WaterGun => true
    case _ => false
  }

}
