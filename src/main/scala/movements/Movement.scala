package movements

import types.Type

trait Movement {
  val typ: Type
  val power: Double
  val name: String
}
