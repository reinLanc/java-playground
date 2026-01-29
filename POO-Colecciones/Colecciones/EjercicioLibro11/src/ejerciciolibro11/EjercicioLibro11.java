/*
Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior.
El programa irá pidiendo que el usuario teclee la traducción al inglés de cada una de las palabras y
comprobará si son correctas. Al final, el programa deberá mostrar cuántas respuestas son válidas
y cuántas erróneas.
 */
package ejerciciolibro11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos el diccionario español-inglés
        HashMap<String, String> diccionario = new HashMap<>();

        // Añadimos palabras al diccionario
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

        // Convertimos las claves del HashMap a ArrayList para poder seleccionar aleatoriamente
        ArrayList<String> todasLasPalabras = new ArrayList<>(diccionario.keySet());

        // Seleccionamos 5 palabras aleatorias sin repetir
        ArrayList<String> palabrasSeleccionadas = new ArrayList<>();

        while (palabrasSeleccionadas.size() < 5) {
            int indiceAleatorio = (int) (Math.random() * todasLasPalabras.size());
            String palabraAleatoria = todasLasPalabras.get(indiceAleatorio);

            // Solo añadimos si no está ya seleccionada
            if (!palabrasSeleccionadas.contains(palabraAleatoria)) {
                palabrasSeleccionadas.add(palabraAleatoria);
            }
        }

        // Variables para contar respuestas
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("=== QUIZ DE TRADUCCIÓN ESPAÑOL-INGLÉS ===");
        System.out.println("Traduce las siguientes 5 palabras al inglés:\n");

        // Hacemos las preguntas
        for (int i = 0; i < palabrasSeleccionadas.size(); i++) {
            String palabraEspañol = palabrasSeleccionadas.get(i);
            String traduccionCorrecta = diccionario.get(palabraEspañol);

            System.out.print("Pregunta " + (i + 1) + " - ¿Cómo se dice '" + palabraEspañol + "' en inglés? ");
            String respuestaUsuario = teclado.nextLine().toLowerCase().trim();

            // Comparamos la respuesta con la traducción correcta
            if (respuestaUsuario.equals(traduccionCorrecta)) {
                System.out.println("? ¡Correcto!\n");
                respuestasCorrectas++;
            } else {
                System.out.println("? Incorrecto. La respuesta correcta es: " + traduccionCorrecta + "\n");
                respuestasIncorrectas++;
            }
        }

        // Mostramos el resumen final
        System.out.println("=== RESULTADOS ===");
        System.out.println("Respuestas correctas:   " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        // Calculamos la nota
        double nota = (respuestasCorrectas * 10.0) / 5;
        System.out.println("Nota final: " + String.format("%.1f", nota) + "/10");

        // Mensaje según el resultado
        if (respuestasCorrectas == 5) {
            System.out.println("\n¡Excelente! ¡Perfecto!");
        } else if (respuestasCorrectas >= 3) {
            System.out.println("\n¡Bien! Sigue practicando.");
        } else {
            System.out.println("\nNecesitas estudiar más. ¡Ánimo!");
        }
    }
}

/*
 * PUNTOS CLAVE DEL EJERCICIO:
 * 
 * 1. Conversión de HashMap a ArrayList:
 *    - diccionario.keySet() devuelve un Set con todas las claves
 *    - new ArrayList<>(diccionario.keySet()) convierte el Set en ArrayList
 *    - Esto nos permite acceder por índice y seleccionar aleatoriamente
 * 
 * 2. Selección aleatoria sin repetir:
 *    - Generamos índices aleatorios
 *    - Usamos contains() para verificar que no esté repetida
 *    - Continuamos hasta tener 5 palabras únicas
 * 
 * 3. Validación de respuestas:
 *    - toLowerCase() para ignorar mayúsculas/minúsculas
 *    - trim() para eliminar espacios extra
 *    - equals() para comparación exacta
 * 
 * 4. Retroalimentación al usuario:
 *    - Indicamos si cada respuesta es correcta o incorrecta
 *    - Mostramos la respuesta correcta cuando falla
 *    - Damos un resumen final con nota y mensaje personalizado
 * 
 * POSIBLES MEJORAS:
 * - Permitir sinónimos o respuestas alternativas
 * - Dar pistas después del primer intento fallido
 * - Mostrar tiempo de respuesta
 * - Guardar récords de usuarios
 * - Diferentes niveles de dificultad
 */
