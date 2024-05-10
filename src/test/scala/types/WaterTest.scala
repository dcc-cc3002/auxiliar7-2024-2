package types

class WaterTest extends munit.FunSuite {
  var wMov: Water = _
  var fCreat: Fire = _
  var wCreat: Water = _
  var gCreat: Grass = _

  override def beforeEach(context: BeforeEach) = {
    wMov = new Water()
    fCreat = new Fire()
    wCreat = new Water()
    gCreat = new Grass()
  }

  test("A Water attack of a Fire creature do not have a bonus") {
    assertEquals(fCreat.bonus(wMov), 1.0)
  }

  test("A Water attack of a Grass creature do not have a bonus") {
    assertEquals(gCreat.bonus(wMov), 1.0)
  }

  test("A Water attack of a Water creature should have a bonus") {
    assertEquals(wCreat.bonus(wMov), 1.5)
  }

  test("A Water attack should be supereffective against Fire") {
    assertEquals(wMov.effect(fCreat), 2.0)
  }

  test("A Water attack should be ineffective against Grass") {
    assertEquals(wMov.effect(gCreat), 0.5)
  }

  test("A Water attack should be effective against Water") {
    assertEquals(wMov.effect(wCreat), 1.0)
  }
}

