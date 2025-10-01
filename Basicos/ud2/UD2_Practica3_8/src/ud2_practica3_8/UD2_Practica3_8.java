/*
 * Programa que permite introducir 15 números enteros por teclado y calcula y
 * visualiza la suma de los pares y la resta de los impares (inicializando en 0).
 */
package ud2_practica3_8;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Practica3_8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Variable que almacenará el resultado total de realizar la suma de los
        //pares y la resta de los impares
        int total = 0;
        
        // Leemos 15 números enteros por teclado y vamos sumando los pares y
        // restando los impares
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduce número entero " + i + ": ");
            int numero = teclado.nextInt();
            
            if (numero % 2 == 0) {
                total += numero;
            } else {
                total -= numero;
            }
        }
        
        // Mostramos la suma y la resta
        System.out.println("Total: " + total);
    }
    
}
