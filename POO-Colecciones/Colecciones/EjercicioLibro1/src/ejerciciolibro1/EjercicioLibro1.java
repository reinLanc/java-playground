/*
Ejercicio 1 Crea un ArrayList con los nombres de 6 compañeros de clase.
A continuación, muestra esos nombres por pantalla.
Utiliza para ello un bucle for que recorra todo el ArrayList sin usar ningún índice.
 */
package ejerciciolibro1;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro1 {

    public static void main(String[] args) {
        // Creamos el ArrayList de tipo String para almacenar nombres
        ArrayList<String> compañeros = new ArrayList<>();

        // Añadimos 6 nombres de compañeros
        compañeros.add("Ana");
        compañeros.add("Carlos");
        compañeros.add("María");
        compañeros.add("Pedro");
        compañeros.add("Laura");
        compañeros.add("Juan");

        // Recorremos el ArrayList con un for-each (sin índices)
        // Esta es la forma más elegante de recorrer una colección
        System.out.println("Lista de compañeros:");
        for (String nombre : compañeros) {
            System.out.println("- " + nombre);
        }
    }

}
