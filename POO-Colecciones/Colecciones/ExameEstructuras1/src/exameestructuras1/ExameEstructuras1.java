/*
Programa que genere una matriz 4x4 con números enteros aleatorios en el rango [1, 100], sin que se repitan.
El programa debe mostrar la matriz por pantalla y finalizar su ejecución.
 */
package exameestructuras1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author Reinaldo Gil
 */
public class ExameEstructuras1 {

    public static void main(String[] args) {
        System.out.println("=== PROGRAMA CON MATRIZ 4x4 ===\n");

        // Crear matriz 4x4 con números enteros aleatorios en el rango [1,100] SIN REPETIR
        int[][] matriz = new int[4][4];
        HashSet<Integer> numerosUsados = new HashSet<>();

        System.out.println("Generando matriz 4x4 con números aleatorios (sin repetir):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int numero;
                // Generar número hasta que sea único
                do {
                    numero = (int) (Math.random() * 100) + 1;
                } while (numerosUsados.contains(numero));

                matriz[i][j] = numero;
                numerosUsados.add(numero);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Introducir las expresiones puedas usar el ArrayList y pilas
        // Usaremos una pila para almacenar números y un ArrayList para almacenar resultados
        Stack<Integer> pila = new Stack<>();
        ArrayList<String> resultados = new ArrayList<>();

        System.out.println("\n=== PROCESANDO CON PILA Y ARRAYLIST ===\n");

        // Insertar todos los elementos de la matriz en la pila
        System.out.println("Insertando elementos en la pila...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                pila.push(matriz[i][j]);
            }
        }
        System.out.println("Elementos insertados en la pila: " + pila.size());

        // Mostrar y extraer elementos de la pila (último en entrar, primero en salir)
        System.out.println("\nExtrayendo elementos de la pila (LIFO):");
        int contador = 1;
        while (!pila.isEmpty()) {
            int valor = pila.pop();
            String info = "Elemento " + contador + ": " + valor;
            System.out.println(info);
            resultados.add(info);
            contador++;
        }

        // Mostrar el ArrayList con todos los resultados
        System.out.println("\n=== CONTENIDO DEL ARRAYLIST ===");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }

        System.out.println("\nTotal de elementos procesados: " + resultados.size());
    }
}
