package creatures

import movements.{Ember, Leafage, Tackle}
import types.Grass

import scala.collection.mutable.ArrayBuffer

class Rowlet extends ACreature("Rowlet", 272.0, new Grass()) {
  allowMovements = ArrayBuffer(Tackle(),Leafage(),Ember())
}
