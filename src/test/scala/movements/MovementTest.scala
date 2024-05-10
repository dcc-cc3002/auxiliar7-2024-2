package movements

import types.*

class MovementTest extends munit.FunSuite {
  var e: Ember = _
  var wg: WaterGun = _
  var l: Leafage = _

  override def beforeEach(context: BeforeEach): Unit = {
    e = new Ember()
    wg = new WaterGun()
    l = new Leafage()
  }

  test("A movement should have name") {
    assertEquals(e.name, "Ember")
    assertEquals(wg.name, "Water Gun")
    assertEquals(l.name, "Leafage")
  }

  test("A movement should have a power") {
    assertEquals(e.power, 40.0)
    assertEquals(wg.power, 40.0)
    assertEquals(l.power, 40.0)
  }

  test("A movement should have a type") {
    assertEquals(e.typ, new Fire())
    assertEquals(wg.typ, new Water())
    assertEquals(l.typ, new Grass())
  }
}
