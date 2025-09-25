/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_4_1;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numJugador1 = 0;
        int numJugador2 = 0;
        int intentos = 5;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca numero de Jugador 1");
        numJugador1 = teclado.nextInt();
        while (numJugador1 < 1 || numJugador1 > 50) {
            System.out.println("Introduzca numero de Jugador 1 \n Debe estar entre 1 y 50");
            numJugador1 = teclado.nextInt();

        }
        System.out.println("Introduzca numero de Jugador 2");
        numJugador2 = teclado.nextInt();
        while (numJugador2 < 1 || numJugador2 > 50) {
            System.out.println("Introduzca numero de Jugador 2  \n Debe estar entre 1 y 50");
            numJugador2 = teclado.nextInt();
        }
        do {
            if (numJugador2 == numJugador1) {
                System.out.println("ENHORABUENA!!\n GANASTE!!");
                break;
            }
            if (numJugador2 > numJugador1) {
                System.out.println("Incorrecto. Te has excedido");
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            } else {
                System.out.println("Incorrecto. Te has quedado corto");
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }
            if (intentos < 1) {
                System.out.println("Intentos agotados \n ¡Game Over!");
                break;
            }
            System.out.println("Introduzca numero de Jugador 2");
            numJugador2 = teclado.nextInt();
        } while (intentos >= 1);

    }
}
