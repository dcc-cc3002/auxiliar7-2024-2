package creatures

import excepcions.NotLearnMovement
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

  test("A creature should deal damage with an attack") {
    val lastHp = rl.hp
    fc.attack(new Ember(), rl)
    assert(rl.hp < lastHp)
  }

  test("A creature attack should apply all multipliers") {
    var lastHp = rl.hp
    fc.attack(new Ember(), rl)
    // 40 (power) * 1.5 (bonus) * 2.0 (effect)
    // = 120
    assertEquals(lastHp - rl.hp, 120.0)

    lastHp = mk.hp
    fc.attack(new Tackle(), mk)
    // 40 (power) * 1.0 (bonus) * 1.0 (effect)
    // = 40
    assertEquals(lastHp - mk.hp, 40.0)


    lastHp = fc.hp
    rl.attack(new Leafage(), fc)
    // 40 (power) * 1.5 (bonus) * 0.5 (effect)
    // = 30
    assertEquals(lastHp - fc.hp, 30.0)
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

  test("A creature should not use a Movement that doesn't know") {
    intercept[NotLearnMovement]({
      fc.attack(new WaterGun(), rl)
    })
  }
}

