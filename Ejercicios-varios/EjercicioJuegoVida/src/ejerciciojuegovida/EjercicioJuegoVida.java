/**
 * EJERCICIO 10 — El Juego de la Vida de Conway
 *
 * El Juego de la Vida es un automata celular inventado por el matematico
 * John Conway en 1970. Es uno de los ejemplos mas famosos de como reglas
 * simples pueden generar comportamientos complejos.
 *
 * El tablero es una matriz de 0s (celula MUERTA) y 1s (celula VIVA).
 * En cada generacion, todas las celdas se actualizan SIMULTANEAMENTE
 * segun estas 4 reglas basadas en los 8 vecinos de cada celda:
 *
 *   Regla 1 (Soledad):    celula VIVA con < 2 vecinos vivos -> MUERE Regla 2
 * (Equilibrio): celula VIVA con 2 o 3 vecinos vivos -> SOBREVIVE Regla 3
 * (Superpoblacion): celula VIVA con > 3 vecinos vivos -> MUERE Regla 4
 * (Reproduccion): celula MUERTA con exactamente 3 vecinos vivos -> NACE
 *
 * CLAVE: no podemos modificar la matriz mientras la leemos. Necesitamos
 * calcular la siguiente generacion en una matriz auxiliar y luego copiarla
 * sobre la original.
 *
 * Ademas usamos un ArrayList para guardar el historial de poblaciones (cuantas
 * celulas vivas habia en cada generacion).
 */
package ejerciciojuegovida;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioJuegoVida {

    /**
     * Cuenta cuantos vecinos vivos tiene la celda (fila, col). Cada celda tiene
     * hasta 8 vecinos (horizontal, vertical y diagonal). Las celdas del borde
     * tienen menos vecinos (no salimos del tablero).
     *
     * Usamos dos bucles que van de -1 a +1 para cubrir las 8 direcciones.
     * Saltamos la posicion (0,0) porque esa es la propia celda, no un vecino.
     */
    static int contarVecinos(int[][] tablero, int fila, int col, int filas, int cols) {
        int vecinos = 0;

        // df y dc representan el desplazamiento respecto a la celda central
        // Combinaciones: (-1,-1), (-1,0), (-1,1), (0,-1), (0,1), (1,-1), (1,0), (1,1)
        for (int df = -1; df <= 1; df++) {
            for (int dc = -1; dc <= 1; dc++) {

                // Saltamos la propia celda (desplazamiento 0,0)
                if (df == 0 && dc == 0) {
                    continue;
                }

                int nuevaFila = fila + df;
                int nuevaCol = col + dc;

                // Solo contamos si el vecino esta dentro de los limites del tablero
                if (nuevaFila >= 0 && nuevaFila < filas && nuevaCol >= 0 && nuevaCol < cols) {
                    vecinos += tablero[nuevaFila][nuevaCol]; // suma 1 si esta viva, 0 si muerta
                }
            }
        }
        return vecinos;
    }

    /**
     * Cuenta el total de celulas vivas en el tablero actual. Sirve para
     * registrar la poblacion de cada generacion.
     */
    static int contarVivas(int[][] tablero, int filas, int cols) {
        int total = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                total += tablero[i][j]; // suma 1 si viva, 0 si muerta
            }
        }
        return total;
    }

    /**
     * Imprime el tablero usando '#' para celulas vivas y '.' para muertas. Es
     * mas visual que usar 1s y 0s.
     */
    static void mostrarTablero(int[][] tablero, int filas, int cols) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(tablero[i][j] == 1 ? "#" : ".");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Leemos las dimensiones del tablero
        System.out.print("Filas del tablero: ");
        int filas = teclado.nextInt();

        System.out.print("Columnas del tablero: ");
        int cols = teclado.nextInt();

        System.out.print("Numero de generaciones a simular: ");
        int generaciones = teclado.nextInt();

        // Leemos el estado inicial del tablero (0=muerta, 1=viva)
        int[][] tablero = new int[filas][cols];
        System.out.println("Introduce el tablero inicial (0=muerta, 1=viva):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                tablero[i][j] = teclado.nextInt();
            }
        }

        // ArrayList para guardar la poblacion (numero de vivas) en cada generacion
        ArrayList<Integer> historialPoblacion = new ArrayList<Integer>();
        historialPoblacion.add(contarVivas(tablero, filas, cols)); // generacion 0

        System.out.println("\n--- Generacion 0 (inicial) ---");
        mostrarTablero(tablero, filas, cols);
        System.out.println("Celulas vivas: " + historialPoblacion.get(0));

        // ---------------------------------------------------------------
        // BUCLE PRINCIPAL: calculamos cada generacion
        // ---------------------------------------------------------------
        for (int gen = 1; gen <= generaciones; gen++) {

            // Creamos la matriz auxiliar donde calcularemos la siguiente generacion
            // NO modificamos 'tablero' hasta haber calculado todos los nuevos valores
            int[][] siguiente = new int[filas][cols];

            // Aplicamos las 4 reglas a cada celda
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < cols; j++) {
                    int vecinos = contarVecinos(tablero, i, j, filas, cols);

                    if (tablero[i][j] == 1) {
                        // Celula VIVA: sobrevive solo con 2 o 3 vecinos
                        if (vecinos == 2 || vecinos == 3) {
                            siguiente[i][j] = 1; // sobrevive (Regla 2)
                        } else {
                            siguiente[i][j] = 0; // muere por soledad o superpoblacion
                        }
                    } else {
                        // Celula MUERTA: nace solo si tiene exactamente 3 vecinos vivos
                        if (vecinos == 3) {
                            siguiente[i][j] = 1; // nace (Regla 4)
                        } else {
                            siguiente[i][j] = 0; // sigue muerta
                        }
                    }
                }
            }

            // Copiamos la matriz 'siguiente' sobre 'tablero'
            // Ahora si podemos actualizar tablero porque ya terminamos de leerlo
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < cols; j++) {
                    tablero[i][j] = siguiente[i][j];
                }
            }

            // Registramos la poblacion de esta generacion en el historial
            int vivas = contarVivas(tablero, filas, cols);
            historialPoblacion.add(vivas);

            System.out.println("\n--- Generacion " + gen + " ---");
            mostrarTablero(tablero, filas, cols);
            System.out.println("Celulas vivas: " + vivas);
        }

        // ---------------------------------------------------------------
        // RESUMEN FINAL usando el ArrayList de historial
        // ---------------------------------------------------------------
        System.out.println("\n--- Resumen de poblacion ---");
        int maxPoblacion = historialPoblacion.get(0);
        int minPoblacion = historialPoblacion.get(0);
        int genMaxima = 0;

        for (int g = 0; g < historialPoblacion.size(); g++) {
            int pob = historialPoblacion.get(g);
            System.out.println("Generacion " + g + ": " + pob + " vivas");
            if (pob > maxPoblacion) {
                maxPoblacion = pob;
                genMaxima = g;
            }
            if (pob < minPoblacion) {
                minPoblacion = pob;
            }
        }

        System.out.println("Maxima poblacion: " + maxPoblacion + " (generacion " + genMaxima + ")");
        System.out.println("Minima poblacion: " + minPoblacion);

    }
}
