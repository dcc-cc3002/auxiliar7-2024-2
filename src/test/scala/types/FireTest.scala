package types

class FireTest extends munit.FunSuite {

  var fMov: Fire = _
  var fCreat: Fire = _
  var wCreat: Water = _
  var gCreat: Grass = _

  override def beforeEach(context: BeforeEach) = {
    fMov = new Fire()
    fCreat = new Fire()
    wCreat = new Water()
    gCreat = new Grass()
  }

  test("A Fire attack of a Fire creature should have a bonus") {
  }

  test("A Fire attack of a Grass creature do not hava a bonus") {
  }

  test("A Fire attack of a Water creature do not hava a bonus") {
  }

  test("A Fire attack should be effective against Fire") {
  }

  test("A Fire attack should be supereffective against Grass") {
  }

  test("A Fire attack should be ineffective against Water") {
  }
}
