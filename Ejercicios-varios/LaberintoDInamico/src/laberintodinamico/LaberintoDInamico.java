/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberintodinamico;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Reinaldo Gil
 */
public class LaberintoDInamico {

// Clase interna para representar una posición
    static class Posicion {

        int fila, columna;

        Posicion(int f, int c) {
            this.fila = f;
            this.columna = c;
        }
    }

    /**
     * Encuentra el camino más corto en el laberinto usando BFS (Breadth-First
     * Search / Búsqueda en Anchura)
     *
     * BFS es el mejor algoritmo para encontrar el camino MÁS CORTO porque
     * explora nivel por nivel, garantizando la distancia mínima.
     */
    static int encontrarCaminoMasCorto(char[][] laberinto) {

        int n = laberinto.length;
        Posicion inicio = null, fin = null;

        // PASO 1: Encontrar las posiciones de S y F
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (laberinto[i][j] == 'S') {
                    inicio = new Posicion(i, j);
                }
                if (laberinto[i][j] == 'F') {
                    fin = new Posicion(i, j);
                }
            }
        }

        // Si no encontramos inicio o fin, es imposible
        if (inicio == null || fin == null) {
            return -1;
        }

        // PASO 2: Configurar BFS
        // Queue: estructura FIFO (First In, First Out) perfecta para BFS
        Queue<Posicion> cola = new LinkedList<>();
        boolean[][] visitado = new boolean[n][n];

        // Array para contar distancias
        int[][] distancia = new int[n][n];

        // Inicializar
        cola.add(inicio);
        visitado[inicio.fila][inicio.columna] = true;
        distancia[inicio.fila][inicio.columna] = 0;

        // PASO 3: Direcciones de movimiento (arriba, abajo, izquierda, derecha)
        int[] df = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // PASO 4: BFS
        while (!cola.isEmpty()) {
            Posicion actual = cola.poll();

            // Si llegamos al fin, retornar la distancia
            if (actual.fila == fin.fila && actual.columna == fin.columna) {
                return distancia[actual.fila][actual.columna];
            }

            // Explorar los 4 vecinos (arriba, abajo, izquierda, derecha)
            for (int i = 0; i < 4; i++) {
                int nuevaFila = actual.fila + df[i];
                int nuevaColumna = actual.columna + dc[i];

                // Verificar que está dentro de los límites
                if (nuevaFila >= 0 && nuevaFila < n
                        && nuevaColumna >= 0 && nuevaColumna < n) {

                    // Verificar que no es pared y no está visitado
                    if (laberinto[nuevaFila][nuevaColumna] != '#'
                            && !visitado[nuevaFila][nuevaColumna]) {

                        visitado[nuevaFila][nuevaColumna] = true;
                        distancia[nuevaFila][nuevaColumna]
                                = distancia[actual.fila][actual.columna] + 1;
                        cola.add(new Posicion(nuevaFila, nuevaColumna));
                    }
                }
            }
        }

        // Si llegamos aquí, no hay camino posible
        return -1;
    }

    /**
     * Convierte un string de entrada a una matriz de caracteres
     */
    static char[][] leerMatriz(String[] filas) {
        int n = filas.length;
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            String fila = filas[i].replaceAll("\\s+", "");
            for (int j = 0; j < fila.length(); j++) {
                matriz[i][j] = fila.charAt(j);
            }
        }

        return matriz;
    }

    public static void main(String[] args) {
        // EJEMPLO 1: Laberinto simple 5×5
        System.out.println("=== EJEMPLO 1: Laberinto 5×5 ===\n");

        String[] ejemplo1 = {
            "S . . # .",
            "# . # . .",
            ". . . . #",
            "# # . # F",
            ". . . . ."
        };

        char[][] laberinto1 = leerMatriz(ejemplo1);
        System.out.println("Laberinto:");
        for (String fila : ejemplo1) {
            System.out.println(fila);
        }

        int resultado1 = encontrarCaminoMasCorto(laberinto1);
        System.out.println("\nResultado: " + resultado1 + " movimientos\n");

        // EJEMPLO 2: Laberinto imposible
        System.out.println("=== EJEMPLO 2: Laberinto Imposible ===\n");

        String[] ejemplo2 = {
            "S . # . .",
            ". . # . .",
            "# # # # #",
            ". . # . .",
            ". . # . F"
        };

        char[][] laberinto2 = leerMatriz(ejemplo2);
        System.out.println("Laberinto:");
        for (String fila : ejemplo2) {
            System.out.println(fila);
        }

        int resultado2 = encontrarCaminoMasCorto(laberinto2);
        System.out.println("\nResultado: " + resultado2 + " (imposible llegar)\n");

        // EJEMPLO 3: Laberinto sin obstáculos
        System.out.println("=== EJEMPLO 3: Laberinto Sin Obstáculos ===\n");

        String[] ejemplo3 = {
            "S . . . .",
            ". . . . .",
            ". . . . .",
            ". . . . .",
            ". . . . F"
        };

        char[][] laberinto3 = leerMatriz(ejemplo3);
        System.out.println("Laberinto:");
        for (String fila : ejemplo3) {
            System.out.println(fila);
        }

        int resultado3 = encontrarCaminoMasCorto(laberinto3);
        System.out.println("\nResultado: " + resultado3 + " movimientos");
        System.out.println("(Camino directo en diagonal: 4 derechas + 4 abajo = 8)\n");
    }
}
