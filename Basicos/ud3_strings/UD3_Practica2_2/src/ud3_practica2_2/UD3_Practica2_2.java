/*
 * Programa que lee del teclado una cadena de caracteres y muestra cuantas veces aparece
 * la letra 'a' en dicha cadena.
 */
package ud3_practica2_2;

import java.util.*;

public class UD3_Practica2_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();
        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                contador++;
            }
        }
        System.out.println("Número de veces que aparece la letra 'a': " + contador);
        
    }
    
}
