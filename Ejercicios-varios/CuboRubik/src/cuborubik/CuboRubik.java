/*
l programa deberá leer varios casos de prueba de la entrada estándar.
Cada caso de prueba estará compuesto de múltiples líneas. La primera indica el número n de cuadrados de
ancho y alto del cuadrado de Rubik simulado, 1 ? n ? 50. A continuación vendrá la situación inicial del
cuadrado de Rubik a través de n líneas, conteniendo exactamente n letras del alfabeto inglés. Cada letra 
representa el color de un cuadro interior del cuadrado de Rubik, y puede ser tanto en mayúsculas 
como minúsculas, considerándose diferentes.
Tras la configuración del cuadrado, vendrá una línea con las operaciones realizadas sobre él, separadas 
por espacios. Una operación está compuesta de dos partes: una letra indicando si el movimiento es sobre
una fila ("f") o una columna ("c"), y un número v, cuyo valor absoluto 1 ? |v| ? n indica la fila o la columna 
sobre la que se realiza la operación. La fila 1 se corresponde con la primera línea de la descripción;
la columna 1 se corresponde con la primera letra de cada línea. Si el número v es positivo, el desplazamiento 
será hacia la derecha (filas) o hacia abajo (columnas). Si es negativo será hacia la izquierda o hacia arriba. 
La lista de operaciones acaba con una "x".
La entrada acaba con un cuadrado de tamaño 0.
Salida
Para cada caso de prueba el programa escribirá, en la salida estándar, la configuración final del cuadrado
de Rubik en el mismo formato que en la entrada.
Además, deberá escribir una línea con tres guiones ("---") después de cada caso de prueba.
Entrada de ejemplo
3
abc
abc
abc
f 1 f -2 x
3
aaa
bbb
ccc
c 1 c -2 x
0
Salida de ejemplo
cab
bca
abc
---
cba
acb
bac
---
 */
package cuborubik;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class CuboRubik {

    /**
     * Cuadrado de Rubik - Simulador de rotaciones en una matriz 2D
     *
     * Conceptos clave para el examen: - Matrices bidimensionales (char[][]) -
     * Rotación circular (el extremo "sale" y aparece al otro lado) - Parsing de
     * entrada con múltiples casos de prueba
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        // Leemos casos de prueba hasta encontrar n = 0
        while (teclado.hasNextInt()) {
            int n = teclado.nextInt();
            if (n == 0) {
                break; // Condición de fin de entrada
            }
            // ?? 1. LEER EL CUADRADO ??????????????????????????????????????????
            // Usamos char[][] para representar la cuadrícula n×n
            char[][] grid = new char[n][n];
            for (int i = 0; i < n; i++) {
                String linea = teclado.next(); // lee una palabra (sin espacios)
                for (int j = 0; j < n; j++) {
                    grid[i][j] = linea.charAt(j);
                }
            }

            // ?? 2. LEER Y PROCESAR OPERACIONES ??????????????????????????????
            // Formato: "f v" o "c v" o "x"
            // 'f' = fila, 'c' = columna
            // v > 0 ? derecha/abajo ; v < 0 ? izquierda/arriba
            String tipo;
            while (!(tipo = teclado.next()).equals("x")) {
                int v = teclado.nextInt();

                // Convertimos a índice 0-based: la fila/columna 1 ? índice 0
                int indice = Math.abs(v) - 1;

                if (tipo.equals("f")) {
                    // Operación sobre una FILA
                    if (v > 0) {
                        rotarFilaDerecha(grid, indice);   
                    } else {
                        rotarFilaIzquierda(grid, indice); 
                    }
                } else { // tipo.equals("c")
                    // Operación sobre una COLUMNA
                    if (v > 0) {
                        rotarColumnaAbajo(grid, indice, n);  
                    } else {
                        rotarColumnaArriba(grid, indice, n); 
                    }
                }
            }

            // 3. IMPRIMIR RESULTADO 
            for (int i = 0; i < n; i++) {
                // new String(char[]) convierte la fila entera a String
                System.out.println(new String(grid[i]));
            }
            System.out.println("---"); // Separador obligatorio tras cada caso
        }
    }

    //  MÉTODOS DE ROTACIÓN 
    /**
     * Rotación de fila hacia la DERECHA El último elemento "sale" por la
     * derecha y "entra" por la izquierda. Ejemplo: [a, b, c] ? [c, a, b]
     */
    static void rotarFilaDerecha(char[][] grid, int fila) {
        int n = grid[fila].length;
        char ultimo = grid[fila][n - 1]; // Guardamos el que "sale"
        // Desplazamos todos los elementos una posición a la derecha
        for (int j = n - 1; j > 0; j--) {
            grid[fila][j] = grid[fila][j - 1];
        }
        grid[fila][0] = ultimo; // El que salió por la derecha entra por la izquierda
    }

    /**
     * Rotación de fila hacia la IZQUIERDA (?) El primer elemento "sale" por la
     * izquierda y "entra" por la derecha. Ejemplo: [a, b, c] ? [b, c, a]
     */
    static void rotarFilaIzquierda(char[][] grid, int fila) {
        int n = grid[fila].length;
        char primero = grid[fila][0]; // Guardamos el que "sale"
        // Desplazamos todos los elementos una posición a la izquierda
        for (int j = 0; j < n - 1; j++) {
            grid[fila][j] = grid[fila][j + 1];
        }
        grid[fila][n - 1] = primero; // El que salió por la izquierda entra por la derecha
    }

    /**
     * Rotación de columna hacia ABAJO (?) El último elemento "sale" por abajo y
     * "entra" por arriba. Ejemplo columna: [a, b, c] ? [c, a, b]
     */
    static void rotarColumnaAbajo(char[][] grid, int col, int n) {
        char ultimo = grid[n - 1][col]; // Guardamos el que "sale"
        // Desplazamos todos los elementos una posición hacia abajo
        for (int i = n - 1; i > 0; i--) {
            grid[i][col] = grid[i - 1][col];
        }
        grid[0][col] = ultimo; // El que salió por abajo entra por arriba
    }

    /**
     * Rotación de columna hacia ARRIBA (?) El primer elemento "sale" por arriba
     * y "entra" por abajo. Ejemplo columna: [a, b, c] ? [b, c, a]
     */
    static void rotarColumnaArriba(char[][] grid, int col, int n) {
        char primero = grid[0][col]; // Guardamos el que "sale"
        // Desplazamos todos los elementos una posición hacia arriba
        for (int i = 0; i < n - 1; i++) {
            grid[i][col] = grid[i + 1][col];
        }
        grid[n - 1][col] = primero; // El que salió por arriba entra por abajo
    }
}
