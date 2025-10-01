/*
 * Programa que pida una frase por teclado y dice cuántas palabras tiene. Se supone que
 * las palabras están separadas por un espacio en blanco y que una frase no se empieza nunca con
 * un espacio.
 */
package ud3_practica2_7;

import java.util.*;

public class UD3_Practica2_7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String cadena = teclado.nextLine();

        int palabras = 0;
        if (cadena.length() != 0) {
            palabras++;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ') {
                    palabras++;
                }
            }
        }

        System.out.println("La frase tiene " + palabras + " palabras.");
    }

}
