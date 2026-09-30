/*
Se dice que una matriz cuadrada, es decir que tiene el mismo número de filas que de columnas, es
triangular cuando todos los valores que están por encima o por debajo de la diagonal principal son cero.
También son triangulares aquellas matrices que cumplen estas dos condiciones a la vez.
Realiza un programa que diga si una matriz cuadrada dada es o no triangular.
Entrada
La entrada consta de una serie de casos de prueba. 
Cada caso comienza con un número que representa el número de filas, mayor que cero y menor o 
igual que 50, de la matriz cuadrada. A continuación se dan los elementos que forman la matriz.
La entrada terminará con una matriz de 0 filas.
Salida
Para cada caso de prueba se indicará SI si la matriz es triangular y NO en caso contrario.
Entrada de ejemplo
3
1 2 3
0 6 4
0 0 5
3
1 0 0
2 3 0
4 5 6
3
1 1 1
1 1 1
0 0 1
0
Salida de ejemplo
SI
SI
NO
 */
package matriz.triangular;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizTriangular {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leemos casos de prueba hasta encontrar n = 0
        while (teclado.hasNextInt()) {
            int n = teclado.nextInt();
            if (n == 0) {
                break; // Fin de entrada
            }
            // ?? 1. LEER LA MATRIZ
            int[][] matriz = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = teclado.nextInt();
                }
            }

            // ?? 2. COMPROBAR SI ES TRIANGULAR
            // Basta con que sea triangular superior O inferior (o ambas)
            if (esTriangularSuperior(matriz, n) || esTriangularInferior(matriz, n)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        teclado.close();
    }

    /**
     * Comprueba si la matriz es TRIANGULAR SUPERIOR. En una triangular superior
     * todos los elementos POR DEBAJO de la diagonal principal deben ser 0. Es
     * decir, todos los elementos donde (fila > columna) ? deben ser 0.
     *
     * Ejemplo: 1 2 3 0 6 4 ? el 0 en (1,0) cumple: fila(1) > col(0) ? debe ser
     * 0 ? 0 0 5 ? los 0 en (2,0) y (2,1) también cumplen ?
     */
    static boolean esTriangularSuperior(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Zona por DEBAJO de la diagonal: fila > columna
                if (i > j && matriz[i][j] != 0) {
                    return false; // Encontramos un elemento que no es 0 => no es triangular superior
                }
            }
        }
        return true; // Todos los elementos bajo la diagonal son 0
    }

    /**
     * Comprueba si la matriz es TRIANGULAR INFERIOR. En una triangular inferior
     * todos los elementos POR ENCIMA de la diagonal principal deben ser 0. Es
     * decir, todos los elementos donde (columna > fila) => deben ser 0.
     *
     * Ejemplo: 1 0 0 ? los 0 en (0,1) y (0,2) cumplen: col => fila => 0 ? 2 3 0 ?
     * el 0 en (1,2) cumple  4 5 6
     */
    static boolean esTriangularInferior(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Zona por ENCIMA de la diagonal: columna > fila
                if (j > i && matriz[i][j] != 0) {
                    return false; // Encontramos un elemento que no es 0 ? no es triangular inferior
                }
            }
        }
        return true; // Todos los elementos sobre la diagonal son 0
    }

}
