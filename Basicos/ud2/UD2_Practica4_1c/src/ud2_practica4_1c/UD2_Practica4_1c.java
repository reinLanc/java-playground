/*
 * Un primer jugador teclea un número entre 1 y 50 (debe comprobarse que sea correcto). 
 *El segundo jugador intentará adivinarlo. Para ello tendrá como máximo 5 intentos
 * y el programa irá sacando mensajes indicando si el número a adivinar es mayor
 * o menor al número introducido por el jugador 2. Al final se indicará si el 
 * jugador ganó o perdió. Si se adivina el número antes de que finalicen los 5 
 *intentos el programa finaliza.
 *
 *El programa utiliza dos condiciones en el bucle, de forma que las instrucciones
 * que forman parte del bucle se repitan mientras se cumplan ambas
 * condiciones.
 */
package ud2_practica4_1c;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Practica4_1c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // El jugador 1 introduce un número entre 1 y 50
        System.out.print("JUGADOR 1: Escribe un número entre 1 y 50: ");
        int numJugador1 = teclado.nextInt();
        while (numJugador1 < 1 || numJugador1 > 50) {
            System.out.print("ERROR. JUGADOR 1: Escribe un número entre 1 y 50: ");
            numJugador1 = teclado.nextInt();
        }

        // El jugador 2 trata de adivinar el número. El programa le va informando
        // de si el número es mayor o menor
        System.out.println("\nJUGADOR 2: Tienes 5 intentos para adivinar el número"
                + " de JUGADOR 1.");

        int intentos = 5;
        int numJugador2 = -1;

        while (intentos > 0 && numJugador1 != numJugador2) {
            System.out.print("JUGADOR 2: Escribe un número entre 1 y 50: ");
            numJugador2 = teclado.nextInt();
            while (numJugador2 < 1 || numJugador2 > 50) {
                System.out.print("ERROR. JUGADOR 2: Escribe un número entre 1 y 50: ");
                numJugador2 = teclado.nextInt();
            }

            //Si el numero del jugador 2 es distinto del de jugador 1 le decimos
            // al jugador 2 si su número es mayor o menor que el número a adivinar
            if (numJugador1 != numJugador2) {
                if (numJugador1 > numJugador2) {
                    System.out.print("JUGADOR 2: El número a adivinar es mayor.");
                } else {
                    System.out.print("JUGADOR 2: El número a adivinar es menor.");
                }
                intentos--;
                System.out.println(" Te quedan " + intentos + " intentos\n");
            }
        }

        if (numJugador1 == numJugador2) {
            System.out.println("JUGADOR 2: ENHORABUENA. Has acertado el número");
        } else {
            System.out.println("JUGADOR 2: LO SIENTO."
                    + " Se te han acabado los intentos.");
        }
    }

}
