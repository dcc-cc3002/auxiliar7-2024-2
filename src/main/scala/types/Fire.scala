package types

class Fire extends Type {
  val name: String = "Fire"
  override def equals(other: Any): Boolean = other match {
    case f: Fire => true
    case _ => false
  }
}
