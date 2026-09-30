// CONCEPTOS CLAVE DEL EJERCICIO 7
// 1. SUMA Y RESTA de matrices ? 2 bucles, celda a celda
//    res[i][j] = a[i][j] + b[i][j]
//    Solo válido si ambas matrices tienen las MISMAS dimensiones.
// 2. MULTIPLICACIÓN MATRICIAL ? 3 bucles (O(n³))
//    NO es multiplicar celda a celda (eso sería producto de Hadamard).
//    Fórmula:  res[i][j] = ? a[i][k] * b[k][j]  (k de 0 a N-1)
//    
//    Ejemplo para res[0][0] con N=2:
//      a[0][0]*b[0][0] + a[0][1]*b[1][0]
//    
//    El índice k "conecta" la fila de A con la columna de B.
//    Java inicializa int[][] a 0, por eso += funciona desde el inicio.
// 3. NÚMERO DE ORDEN de una celda [i][j] en matriz de N cols:
//    orden = i * N + j
//    Fila 0: 0,1,2,3,4  ? i=0: 0*5+0=0, 0*5+1=1 ...
//    Fila 1: 5,6,7,8,9  ? i=1: 1*5+0=5, 1*5+1=6 ...
// 4. printf con formato
//    System.out.printf("%6d", valor)
//    %6d ? entero en campo de 6 caracteres (alineación a la derecha).
//    Útil para mostrar matrices de forma alineada y legible.
// 5. SEPARAR la lógica en métodos estáticos
//    sumar(), restar(), multiplicar(), mostrarMatriz()
//    Cada método hace UNA cosa ? código más limpio, testeable y reutilizable.
//    El main() orquesta, los métodos ejecutan.
package matriz5x5;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class Matriz5x5 {

    static final int N = 5; // Tamaño de la matriz (constante global de la clase)

    // Muestra una matriz con formato alineado 
    static void mostrarMatriz(int[][] m, String titulo) {
        System.out.println("\n" + titulo);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%6d", m[i][j]); // %6d: entero en campo de 6 caracteres
            }
            System.out.println();
        }
    }

    //  Suma celda a celda
    static int[][] sumar(int[][] a, int[][] b) {
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = a[i][j] + b[i][j]; // Operación elemento a elemento
            }
        }
        return res;
    }

    // Resta celda a celda 
    static int[][] restar(int[][] a, int[][] b) {
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    //  Multiplicación matricial (producto fila × columna) 
    // res[i][j] = ? (a[i][k] * b[k][j])  para k de 0 a N-1
    // Necesitamos un TRIPLE bucle: i (fila resultado), j (col resultado),
    // k (índice de acumulación del producto escalar).
    static int[][] multiplicar(int[][] a, int[][] b) {
        int[][] res = new int[N][N]; // Java inicializa a 0 por defecto
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    res[i][j] += 5a[i][k] * b[k][j]; // Acumulamos el producto
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el valor inicial de la Matriz A: ");
        int v1 = teclado.nextInt();
        System.out.print("Introduce el valor inicial de la Matriz B: ");
        int v2 = teclado.nextInt();

        int[][] matA = new int[N][N];
        int[][] matB = new int[N][N];

        // Rellenamos A: cada celda vale v1 + su número de orden (0..24)
        // Número de orden = i*N + j  (fila por tamaño + columna)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matA[i][j] = v1 + (i * N + j);
            }
        }

        // Rellenamos B: cada celda vale v2 + su número de orden * 2
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matB[i][j] = v2 + (i * N + j) * 2;
            }
        }

        mostrarMatriz(matA, "Matriz A:");
        mostrarMatriz(matB, "Matriz B:");
        mostrarMatriz(sumar(matA, matB), "A + B:");
        mostrarMatriz(restar(matA, matB), "A - B:");
        mostrarMatriz(multiplicar(matA, matB), "A × B (producto matricial):");
    }

}
