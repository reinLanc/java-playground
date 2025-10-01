/*
 * Programa que solicita al usuario la introducción de un número entre 1 y 10.
 * En caso de que no sea válido, lo vuelve a pedir.
 */
package validarnumero;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class ValidarNumero {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Pedimos número
        System.out.print("Escribe un número entre 1 y 10: ");
        int n = teclado.nextInt();
        
        // Repetimos la petición hasta que el número sea válido
        while (n < 1 || n > 10) {
            System.out.print("NÚMERO NO VÁLIDO.Escribe un número entre 1 y 10: ");
            n = teclado.nextInt();
        }
        
        // Mostramos el número
        System.out.println("Número escrito: " + n);
        
 
    }

}
