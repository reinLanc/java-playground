/*
 * Programa que lee una cadena de caracteres del teclado y muestra sus siglas. 
 * Por ejemplo: tren articulado ligero goicoechea oriol → TALGO
 */
package ud3_practica2_8;

import java.util.*;

public class UD3_Practica2_8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        System.out.print("Siglas de la cadena: ");
        if (cadena.length() != 0) {
            // Convertimos la cadena a mayúsculas
            cadena = cadena.toUpperCase();
            // Mostramos la primera letra de la primera palabra
            System.out.print(cadena.charAt(0));
            // Recorremos la cadena y, al encontrar un espacio, mostramos la
            // siguiente letra
            for (int i = 1; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ') {
                    System.out.print(cadena.charAt(i + 1));
                }
            }
        }
        System.out.println("");
    }

}
