/*
Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe 
ordenar palabras en lugar de números.
 */
package ejerciciolibro4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos el ArrayList para almacenar las palabras
        ArrayList<String> palabras = new ArrayList<>();

        // Pedimos 10 palabras al usuario
        System.out.println("Introduce 10 palabras:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Palabra " + i + ": ");
            String palabra = teclado.nextLine();
            palabras.add(palabra);
        }

        // Mostramos la lista original
        System.out.println("\nLista original:");
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        // Ordenamos la lista alfabéticamente
        // Collections.sort() ordena Strings alfabéticamente por defecto
        Collections.sort(palabras);

        // Mostramos la lista ordenada
        System.out.println("\nLista ordenada alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

    }

}
