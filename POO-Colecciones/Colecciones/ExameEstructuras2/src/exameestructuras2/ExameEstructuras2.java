/*
Programa que lea cadenas de caracteres por teclado y las inserte en un ArrayList.
Cuando el usuario introduzca una cadena vacía, el programa debe mostrar todas las cadenas
almacenadas en el ArrayList y finalizar.
 */
package exameestructuras2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class ExameEstructuras2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.print("Introduce una cadena: ");
            String texto = teclado.nextLine();

            if (texto.isEmpty()) {
                break;
            }

            lista.add(texto);
        }

        System.out.println("\nCadenas introducidas:");
        for (String s : lista) {
            System.out.println(s);
        }
    }
}
