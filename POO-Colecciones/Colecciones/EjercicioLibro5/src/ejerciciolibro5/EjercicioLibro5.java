/*
Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez una lista para almacenar
la información sobre los discos en lugar de un array convencional. Comprobarás que el código se
simplifica notablemente ¿Cuánto ocupa el programa original hecho con un array? 
¿Cuánto ocupa este nuevo programa hecho con una lista?
 */
package ejerciciolibro5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro5 {
    // ArrayList que almacena todos los discos

    private static ArrayList<Disco> coleccion = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiamos el buffer

            switch (opcion) {
                case 1:
                    añadirDisco();
                    break;
                case 2:
                    mostrarColeccion();
                    break;
                case 3:
                    buscarPorArtista();
                    break;
                case 4:
                    eliminarDisco();
                    break;
                case 5:
                    System.out.println("\n¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción no válida.");
            }
        } while (opcion != 5);

    }

    /**
     * Muestra el menú principal
     */
    private static void mostrarMenu() {
        System.out.println("\n=== COLECCIÓN DE DISCOS ===");
        System.out.println("1. Añadir disco");
        System.out.println("2. Mostrar colección");
        System.out.println("3. Buscar por artista");
        System.out.println("4. Eliminar disco");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    /**
     * Añade un nuevo disco a la colección
     */
    private static void añadirDisco() {
        System.out.println("\n--- Añadir nuevo disco ---");

        System.out.print("Título: ");
        String titulo = teclado.nextLine();

        System.out.print("Artista: ");
        String artista = teclado.nextLine();

        System.out.print("Género: ");
        String genero = teclado.nextLine();

        // Creamos el disco y lo añadimos a la colección
        // ¡No necesitamos comprobar si hay espacio!
        Disco nuevoDisco = new Disco(titulo, artista, genero);
        coleccion.add(nuevoDisco);

        System.out.println("\n? Disco añadido correctamente.");
        System.out.println("Total de discos en la colección: " + coleccion.size());
    }

    /**
     * Muestra todos los discos de la colección
     */
    private static void mostrarColeccion() {
        System.out.println("\n--- Colección completa ---");

        if (coleccion.isEmpty()) {
            System.out.println("La colección está vacía.");
        } else {
            for (int i = 0; i < coleccion.size(); i++) {
                System.out.println((i + 1) + ". " + coleccion.get(i));
            }
            System.out.println("\nTotal: " + coleccion.size() + " discos");
        }
    }

    /**
     * Busca discos por nombre de artista
     */
    private static void buscarPorArtista() {
        System.out.print("\nIntroduce el nombre del artista: ");
        String artistaBuscado = teclado.nextLine();

        System.out.println("\n--- Resultados de búsqueda ---");
        boolean encontrado = false;

        for (Disco disco : coleccion) {
            // Comparación sin distinguir mayúsculas/minúsculas
            if (disco.getArtista().equalsIgnoreCase(artistaBuscado)) {
                System.out.println(disco);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron discos de ese artista.");
        }
    }

    /**
     * Elimina un disco de la colección
     */
    private static void eliminarDisco() {
        if (coleccion.isEmpty()) {
            System.out.println("\nLa colección está vacía.");
            return;
        }

        mostrarColeccion();
        System.out.print("\n¿Qué disco quieres eliminar? (número): ");
        int posicion = teclado.nextInt();
        teclado.nextLine(); // Limpiamos buffer

        // Validamos la posición
        if (posicion > 0 && posicion <= coleccion.size()) {
            Disco eliminado = coleccion.remove(posicion - 1);
            System.out.println("\n Disco eliminado: " + eliminado.getTitulo());
        } else {
            System.out.println("\n Posición no válida.");
        }
    }
}

/*
 * VENTAJAS DE USAR ARRAYLIST EN LUGAR DE ARRAY:
 * 
 * 1. No necesitamos definir un tamaño máximo inicial
 * 2. La lista crece automáticamente según añadimos elementos
 * 3. Métodos útiles: add(), remove(), size(), isEmpty(), etc.
 * 4. Código más limpio y fácil de mantener
 * 5. No hay espacios "vacíos" que gestionar
 * 6. Podemos eliminar elementos fácilmente sin reorganizar
 * 
 * El código es considerablemente más corto y simple que con arrays.
 */
