package creatures

import types.*
import movements.*

class CreatureTest extends munit.FunSuite {

  var fc: Fuecoco = _
  var rl: Rowlet = _
  var mk: Mudkip = _

  override def beforeEach(context: BeforeEach): Unit = {
    fc = new Fuecoco()
    rl = new Rowlet()
    mk = new Mudkip()
  }

  test("A creature should have a name") {
    assertEquals(fc.name, "Fuecoco")
    assertEquals(rl.name, "Rowlet")
    assertEquals(mk.name, "Mudkip")
  }

  test("A creature should have a type") {
    assertEquals(fc.typ, new Fire())
    assertEquals(rl.typ, new Grass())
    assertEquals(mk.typ, new Water())
  }

  test("A creature should have a hp and maxHp") {
    assertEquals(fc.maxHp, 268.0)
    assert(fc.hp == fc.maxHp)
    assertEquals(rl.maxHp, 272.0)
    assert(rl.hp == rl.maxHp)
    assertEquals(mk.maxHp, 200.0)
    assert(mk.hp == mk.maxHp)
  }

  test("A creature could get damaged") {
    rl.damage(40)
    assertEquals(rl.hp, rl.maxHp - 40)
  }

  test("A creature can't have less than 0 hp") {
    mk.damage(mk.maxHp*2)
    assertEquals(mk.hp, 0.0)
  }
   
  test("A creature's maxHp shouldn't change") {
    val lastHp = fc.maxHp
    fc.damage(40)
    assertEquals(fc.maxHp, lastHp)
  }
}
