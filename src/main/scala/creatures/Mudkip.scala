package creatures

import movements.{Tackle, WaterGun}
import types.Water

import scala.collection.mutable.ArrayBuffer

class Mudkip extends ACreature("Mudkip", 200.0, new Water()) {
  allowMovements = ArrayBuffer(Tackle(), WaterGun())
}
