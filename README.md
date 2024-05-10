# Scalamon

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

Implemente esta mecánica, para ello creo el `trait` _Type_ y *al menos* un método que permita obtener el *multiplicador de daño*
del ataque en base al tipo del movimiento y del atacante (1.0 o 1.5)


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

