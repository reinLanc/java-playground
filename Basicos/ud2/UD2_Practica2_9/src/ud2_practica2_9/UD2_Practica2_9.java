/*
 * Programa que de un conjunto de N numeros (N se introducira por teclado), determina:
 * . Cuantos son menores que 15.
 * . Cuantos estan entre 15 e 50 (ambos inclusive).
 * . Cuantos son mayores de 50.
 */
package ud2_practica2_9;

import java.util.*;

public class UD2_Practica2_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, contadorMenor15=0, contadorEntre15y50=0, contadorMayor50=0;

        System.out.print("Indica cuántos números vas a introducir: ");
        n = teclado.nextInt();
         // Leo hasta n números por teclado y voy incrementando los contadores
        // correspondientes
        for (; n>0; n--) {
            System.out.print("Introduce número: ");
            int numero = teclado.nextInt();

            if (numero < 15) {
                contadorMenor15++;
            } else if (numero > 50) {
                contadorMayor50++;
            } else {
                contadorEntre15y50++;
            }
        }
        // Muestro los resultados de los contadores
        System.out.println(contadorMenor15 + " menores de 15");
        System.out.println(contadorEntre15y50 + " entre 15 y 50");
        System.out.println(contadorMayor50 + " mayores de 50");
    }
}
