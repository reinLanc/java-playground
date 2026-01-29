/*
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para almacenar 
las parejas de palabras. El programa pedirá una palabra en español y dará la correspondiente traducción
en inglés.
 */
package ejerciciolibro10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos el HashMap para el diccionario
        // Clave: palabra en español, Valor: traducción en inglés
        HashMap<String, String> diccionario = new HashMap<>();

        // Añadimos al menos 20 palabras al diccionario
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("trabajo", "work");
        diccionario.put("escuela", "school");
        diccionario.put("ordenador", "computer");
        diccionario.put("teléfono", "phone");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("árbol", "tree");
        diccionario.put("flor", "flower");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("mar", "sea");
        diccionario.put("montaña", "mountain");

        System.out.println("=== MINI-DICCIONARIO ESPAÑOL-INGLÉS ===");
        System.out.println("El diccionario contiene " + diccionario.size() + " palabras.\n");

        String respuesta;

        do {
            // Pedimos una palabra en español
            System.out.print("Introduce una palabra en español (o 'salir' para terminar): ");
            String palabraEspañol = teclado.nextLine().toLowerCase().trim();

            // Comprobamos si el usuario quiere salir
            if (palabraEspañol.equals("salir")) {
                System.out.println("\n¡Hasta luego!");
                break;
            }

            // Buscamos la traducción en el diccionario
            if (diccionario.containsKey(palabraEspañol)) {
                String traduccion = diccionario.get(palabraEspañol);
                System.out.println("? Traducción: " + traduccion + "\n");
            } else {
                System.out.println("? Palabra no encontrada en el diccionario.\n");
            }

        } while (true);

    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO:
 * 
 * 1. Estructura de datos:
 *    - Usamos HashMap<String, String>
 *    - Clave: palabra en español
 *    - Valor: traducción en inglés
 * 
 * 2. Ventajas de usar HashMap para un diccionario:
 *    - Búsqueda muy rápida (tiempo constante O(1))
 *    - No importa cuántas palabras tenga el diccionario
 *    - Fácil de añadir, modificar o eliminar palabras
 * 
 * 3. Métodos importantes:
 *    - put(clave, valor): añade una entrada al diccionario
 *    - containsKey(clave): verifica si existe una palabra
 *    - get(clave): obtiene la traducción
 *    - size(): cuenta las palabras del diccionario
 * 
 * 4. Normalización de entrada:
 *    - Usamos toLowerCase() para ignorar mayúsculas/minúsculas
 *    - Usamos trim() para eliminar espacios al inicio/final
 *    - Esto hace el diccionario más robusto
 * 
 * MEJORAS POSIBLES:
 * - Permitir añadir palabras durante la ejecución
 * - Mostrar todas las palabras disponibles
 * - Guardar el diccionario en un archivo
 * - Búsqueda bidireccional (inglés ? español)
 * - Sugerencias de palabras similares si no se encuentra
 */
