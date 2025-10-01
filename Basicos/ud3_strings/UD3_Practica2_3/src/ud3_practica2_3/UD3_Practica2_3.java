/*
 * Programa que lee del teclado una cadena de caracteres y la escribe al revés.
 */
package ud3_practica2_3;

import java.util.*;

public class UD3_Practica2_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();
        
        System.out.print("Cadena al revés: ");
        for (int i = cadena.length()-1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println("");
    }
    
}
