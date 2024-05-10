package types

class Water extends Type {
  val name: String = "Water"
  override def equals(other: Any): Boolean = other match {
    case w: Water => true
    case _ => false
  }
}
