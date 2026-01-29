/*
Escribe un programa que ordene 10 números enteros introducidos por teclado 
y almacenados en un objeto de la clase ArrayList.
 */
package ejerciciolibro3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos el ArrayList para almacenar los números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Pedimos 10 números al usuario
        System.out.println("Introduce 10 números enteros:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Número " + i + ": ");
            int numero = teclado.nextInt();
            numeros.add(numero);
        }

        // Mostramos la lista original
        System.out.println("\nLista original:");
        System.out.println(numeros);

        // Ordenamos la lista usando Collections.sort()
        // Este método ordena de menor a mayor
        Collections.sort(numeros);

        // Mostramos la lista ordenada
        System.out.println("\nLista ordenada:");
        System.out.println(numeros);

    }

}
