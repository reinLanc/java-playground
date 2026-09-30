/*
Se dice que una matriz es identidad cuando todos sus elementos son cero a excepción de la
diagonal principal, que se encuentra rellena de unos. (Solo numero 1)s
Para que una matriz sea identidad debe de ser cuadrada, es decir, tener el mismo número 
de filas que de columnas.
Entrada
La entrada consta de una serie de casos de prueba. Cada uno comienza con un número que
representa el número de filas, como máximo 50, de una matriz cuadrada. Tras él, aparecen los
elementos que forman la matriz, que serán valores entre -1.000 y 1.000 (incluídos).
La entrada terminará con una matriz de 0 filas.
Salida
Para cada caso de prueba se indicará SI si la matriz es identidad y NO en caso contrario.
Entrada de ejemplo
3
1 0 0
0 1 0
0 0 1
2
0 1
1 0
5
1 0 0 0 0
0 5 0 0 0
0 0 1 0 0
0 0 0 1 0
0 0 0 0 1
0
Salida de ejemplo
SI
NO
NO
 */
package matrizidentidad;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizIdentidad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leemos casos de prueba hasta encontrar n = 0
        while (teclado.hasNextInt()) {
            int n = teclado.nextInt();
            if (n == 0) {
                break; // Fin de entrada
            }
            // ?? 1. LEER LA MATRIZ ????????????????????????????????????????????
            // Usamos double porque el enunciado dice valores entre -1000 y 1000
            // (podrían ser decimales)
            double[][] matriz = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = teclado.nextDouble();
                }
            }

            // ?? 2. COMPROBAR SI ES IDENTIDAD ?????????????????????????????????
            if (esIdentidad(matriz, n)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        teclado.close();
    }

    /**
     * Comprueba si la matriz es IDENTIDAD. Condiciones: - Diagonal (i == j) ?
     * el valor DEBE ser 1 - Fuera diagonal (i != j) ? el valor DEBE ser 0 Si
     * cualquier elemento no cumple su condición, no es identidad.
     */
    static boolean esIdentidad(double[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    // Estamos EN la diagonal ? debe ser 1
                    if (matriz[i][j] != 1) {
                        return false; // Un 5 en la diagonal, por ejemplo ? NO
                    }
                } else {
                    // Estamos FUERA de la diagonal ? debe ser 0
                    if (matriz[i][j] != 0) {
                        return false; // Cualquier valor distinto de 0 ? NO
                    }
                }

            }
        }
        return true; // Todos los elementos cumplen su condición ? SI
    }

}
