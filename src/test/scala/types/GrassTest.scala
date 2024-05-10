package types

class GrassTest extends munit.FunSuite {
  var gMov: Grass = _
  var fCreat: Fire = _
  var wCreat: Water = _
  var gCreat: Grass = _

  override def beforeEach(context: BeforeEach) = {
    gMov = new Grass()
    fCreat = new Fire()
    wCreat = new Water()
    gCreat = new Grass()
  }

  test("A Grass attack of a Fire creature do not have a bonus") {
    assertEquals(fCreat.bonus(gMov), 1.0)
  }

  test("A Grass attack of a Grass creature should have a bonus") {
    assertEquals(gCreat.bonus(gMov), 1.5)
  }

  test("A Grass attack of a Water creature do not have a bonus") {
    assertEquals(wCreat.bonus(gMov), 1.0)
  }

  test("A Grass attack should be ineffective against Fire") {
    assertEquals(gMov.effect(fCreat), 0.5)
  }

  test("A Grass attack should be effective against Grass") {
    assertEquals(gMov.effect(gCreat), 1.0)
  }

  test("A Grass attack should be supereffective against Water") {
    assertEquals(gMov.effect(wCreat), 2.0)
  }
}
