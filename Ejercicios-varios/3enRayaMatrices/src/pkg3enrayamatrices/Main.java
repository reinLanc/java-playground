/**
 * EJERCICIO 7 — Tres en raya completo
 * Implementación de un juego de 3 en raya para dos jugadores (X y O).
 * El tablero es una matriz 3x3 de caracteres.
 *
 * Reglas:
 *   - Los jugadores se turnan introduciendo fila y columna (0, 1 o 2).
 *   - Gana el primero que coloque 3 fichas seguidas en fila, columna o diagonal.
 *   - Si se llenan las 9 casillas sin ganador, es empate.
 *
 * Conceptos que trabaja:
 *   - Matriz de char con estado del juego
 *   - Metodos auxiliares para modularizar (mostrar, comprobar ganador, turno valido)
 *   - Bucle de juego con condicion de parada multiple
 *   - Uso de colecciones: ArrayList para registrar el historial de jugadas
 */
package pkg3enrayamatrices;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class Main {

    // Tamanio fijo del tablero
    static final int N = 3;

    // Lista que guarda el historial de jugadas para mostrarlo al final
    // Cada entrada es un String del tipo "X jugo en (1,2)"
    static ArrayList<String> historial = new ArrayList<String>();

    /**
     * Imprime el tablero actual con bordes para que sea legible. Ejemplo:
     * +---+---+---+ | X | O | | +---+---+---+ | | X | | +---+---+---+ | | | O |
     * +---+---+---+
     */
    static void mostrarTablero(char[][] tablero) {
        System.out.println("+---+---+---+");
        for (int i = 0; i < N; i++) {
            System.out.print("|");
            for (int j = 0; j < N; j++) {
                System.out.print(" " + tablero[i][j] + " |");
            }
            System.out.println();
            System.out.println("+---+---+---+");
        }
    }

    /**
     * Comprueba si el jugador con la ficha indicada ('X' u 'O') ha ganado. Hay
     * 8 combinaciones ganadoras: 3 filas + 3 columnas + 2 diagonales.
     *
     * @param tablero el estado actual del tablero
     * @param ficha la ficha del jugador a comprobar ('X' u 'O')
     * @return true si ese jugador ha ganado, false en caso contrario
     */
    static boolean hayGanador(char[][] tablero, char ficha) {

        // Comprobar las 3 FILAS: las tres celdas de la fila tienen la misma ficha
        for (int i = 0; i < N; i++) {
            if (tablero[i][0] == ficha && tablero[i][1] == ficha && tablero[i][2] == ficha) {
                return true;
            }
        }

        // Comprobar las 3 COLUMNAS: las tres celdas de la columna tienen la misma ficha
        for (int j = 0; j < N; j++) {
            if (tablero[0][j] == ficha && tablero[1][j] == ficha && tablero[2][j] == ficha) {
                return true;
            }
        }

        // Comprobar DIAGONAL PRINCIPAL (arriba-izquierda a abajo-derecha)
        if (tablero[0][0] == ficha && tablero[1][1] == ficha && tablero[2][2] == ficha) {
            return true;
        }

        // Comprobar DIAGONAL SECUNDARIA (arriba-derecha a abajo-izquierda)
        if (tablero[0][2] == ficha && tablero[1][1] == ficha && tablero[2][0] == ficha) {
            return true;
        }

        return false; // ninguna combinacion ganadora encontrada
    }

    /**
     * Comprueba si el tablero esta completamente lleno (empate). Recorre todas
     * las celdas buscando alguna que siga siendo ' ' (vacia).
     */
    static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // hay al menos una celda vacia, no esta lleno
                }
            }
        }
        return true; // no queda ninguna celda vacia
    }

    /**
     * Lee y valida la jugada de un jugador. Pide fila y columna hasta que
     * introduzca una posicion libre y dentro del tablero.
     *
     * @param teclado el Scanner compartido
     * @param tablero el tablero actual
     * @param jugador caracter del jugador ('X' u 'O')
     * @return array int[2] con {fila, columna} de la jugada valida
     */
    static int[] pedirJugada(Scanner teclado, char[][] tablero, char jugador) {
        int fila, col;

        while (true) {
            System.out.print("Jugador " + jugador + " - Fila (0-2): ");
            fila = teclado.nextInt();

            System.out.print("Jugador " + jugador + " - Columna (0-2): ");
            col = teclado.nextInt();

            // Validar que la posicion este dentro del tablero
            if (fila < 0 || fila >= N || col < 0 || col >= N) {
                System.out.println("Posicion fuera del tablero. Intenta de nuevo.");
                continue;
            }

            // Validar que la casilla este libre
            if (tablero[fila][col] != ' ') {
                System.out.println("Esa casilla ya esta ocupada. Intenta de nuevo.");
                continue;
            }

            // La jugada es valida, salimos del bucle
            break;
        }

        return new int[]{fila, col};
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Inicializamos el tablero con espacios en blanco (casillas vacias)
        char[][] tablero = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tablero[i][j] = ' ';
            }
        }

        System.out.println("=== TRES EN RAYA ===");
        System.out.println("Jugador 1: X  |  Jugador 2: O");
        System.out.println("Coordenadas: fila y columna del 0 al 2");
        System.out.println();

        char jugadorActual = 'X'; // X siempre empieza
        boolean juegoTerminado = false;

        // Bucle principal del juego: se repite mientras no haya ganador ni empate
        while (!juegoTerminado) {

            // Mostramos el estado actual del tablero antes de cada turno
            mostrarTablero(tablero);

            // Pedimos y validamos la jugada del jugador actual
            int[] jugada = pedirJugada(teclado, tablero, jugadorActual);
            int fila = jugada[0];
            int col = jugada[1];

            // Colocamos la ficha en el tablero
            tablero[fila][col] = jugadorActual;

            // Registramos la jugada en el historial
            historial.add("Jugador " + jugadorActual + " jugo en (" + fila + "," + col + ")");

            // Comprobamos si este jugador ha ganado tras su jugada
            if (hayGanador(tablero, jugadorActual)) {
                mostrarTablero(tablero);
                System.out.println("¡Jugador " + jugadorActual + " gana!");
                juegoTerminado = true;

                // Comprobamos si el tablero esta lleno sin ganador (empate)
            } else if (tableroLleno(tablero)) {
                mostrarTablero(tablero);
                System.out.println("¡Empate! El tablero esta lleno sin ganador.");
                juegoTerminado = true;

            } else {
                // Si el juego continua, cambiamos de jugador
                // El operador ternario alterna entre 'X' y 'O'
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        // Mostramos el historial completo de jugadas usando el ArrayList
        System.out.println("\n--- Historial de jugadas ---");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }

        teclado.close();
    }

}
