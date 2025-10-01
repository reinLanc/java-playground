/*
 * Programa que lee dos cadenas de caracteres del teclado y las muestra concatenadas.
 */
package ud3_practica2_4;

import java.util.*;

public class UD3_Practica2_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena1 = teclado.nextLine();
        System.out.print("Introduce otra cadena: ");
        String cadena2 = teclado.nextLine();
        
//        String cadenaTotal = cadena1 + cadena2;
//        System.out.println("Cadenas concatenadas: " + cadenaTotal);
        System.out.println("Cadenas concatenadas: " + cadena1 + cadena2);
    }
    
}
