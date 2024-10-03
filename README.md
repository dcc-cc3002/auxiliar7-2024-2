# Auxiliar 7: Scalamon

Esta es un programa sencillo para simular una batalla entre criaturas, imitando el famoso juego P*kemon.

## Contexto
Felicidades! Usted ha sido escogido para formar parte del equipo P*kemon dentro de GainFrick. Ahora mismo se
encuentran desarrollando un nuevo juego, pero tiene dificultades para implementar la tabla de tipos.

La idea es que cada criatura y movimiento tiene un tipo elemental asociado y dependiendo de el tipo de
la criatura que ataca, el tipo del movimiento utilizado y el tipo de la criatura que defiende, se calcula el daño

Se le pide hacer esto para el tipo Planta, Fuego y Agua.

## P1: STAB

_STAB_ o _Same type attack bonus_ es una bonificación de daño del 50% que recibe un ataque cuando el tipo del
usuario y el del movimiento coincide.

Implemente esta mecánica, para ello en el `trait` _Type_ cree *al menos* un método que permita obtener el *multiplicador de daño*
del ataque en base al tipo del movimiento y del atacante (1.0 o 1.5)

_HINT:_ Puede guiarse por el test del tipo Fuego incluido en la repo.

## P2: Tabla de tipos

La mecánica principal del juego son los tipos elementales y sus interacciones. Fíjese en la siguiente tabla
que muestra dicha relación:

| Movimiento | vs. Agua | vs. Fuego | vs. Planta |
| - | :-: | :-: | :-: |
| Agua | E | S | I |
| Fuego | I  | E | S |
| Planta | S | I | E |

Donde S es superefectivo, E es efectivo y I es ineficaz.

Cree un método que permite obtener el *multiplicador de daño* del ataque en base al tipo del movimiento y el del objetivo (2.0, 1.0 o 0.5).

## P3: Ataque

Ahora que tiene los métodos necesarios para calcular el daño, implemente un método de ataque entre criaturas. Para el calculo del daño
real use simplemente la potencia del movimiento y luego quite la vida correspondiente.

*IMPORTANTE* Recuerde usar siempre TDD!

## P4 --- Nuevas cosas
Ya que han habido rumores que el auxiliar recicla las clases. Se decidió por añadir nuevas cosas a esta clase!

Añada 3 nuevos movimientos:

1. Tackle con 40 de potencia y de tipo Normal
2. Round con 60 de potencia y de tipo Normal
3. Razor Leaf con 55 de potencia y de tipo Planta

Usted también debe agregar el tipo Normal, el cual no posee interacciones con los otros tipos (es decir, que recibe y hace daño normal)

## P5: Excepciones
Con tantos movimientos nuevos, el auxiliar piensa que es injusto que todos los criaturas puedan usar todos los movimientos,
añada excepciones para evitar que una criatura use un movimiento que no sabe/puede usar.

Las criaturas pueden usar los siguientes movimientos:
- Fuecoco: puede usar Tackle, Round y Ember
- Mudkip: puede usar Tackle y Water Gun
- Rowlet: puede usar Tackle, Leafage y Razor Leaf

_HINT:_ No se deje engatusar por double dispatch, no existe algo que sirva para todo!
_HINT 2:_ Implemente el método `equals` para los movimientos, use abstracción, arreglos y una nueva excepción

## P6: PP (Propuesto)
Dentro del juego cada movimiento posee una cantidad de usos limitadas, las cuales
se registrar en los PP del movimiento o puntos de poder. Cada movimiento tiene
sus PP particulares y cuando llegan a 0 no se puede volver a usar el movimiento.

Use sus conocimientos para modelar esta situación.

