/*
 * Programa que lee números enteros y los visualiza hasta que lee el número 999.
 */
package ud2_practica2_4;

import java.util.*;

public class UD2_Practica2_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce un número (999 para salir): ");
        int numero = teclado.nextInt();
        while (numero != 999) {
            System.out.println("Número introducido: " + numero + "\n");
            System.out.print("Introduce un número (999 para salir): ");
            numero = teclado.nextInt();
        }
    }

}
