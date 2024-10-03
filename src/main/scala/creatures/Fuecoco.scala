package creatures

import movements.{Ember, Movement, Round, Tackle}
import types.Fire

import scala.collection.mutable.ArrayBuffer

class Fuecoco extends ACreature("Fuecoco", 268.0, new Fire()) {
  allowMovements = ArrayBuffer(Tackle(),Round(),Ember())
}
