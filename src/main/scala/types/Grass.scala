package types

class Grass extends Type {
  val name: String = "Grass"
  override def equals(other: Any): Boolean = other match {
    case g: Grass => true
    case _ => false
  }
}
