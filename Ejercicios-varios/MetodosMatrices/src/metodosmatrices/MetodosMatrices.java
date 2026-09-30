// CONCEPTOS CLAVE DEL EJERCICIO 6
// 1. MATRIZ IRREGULAR ("jagged array") en Java
//    En Java, int[][] es en realidad un "array de arrays".
//    Cada fila puede tener un tamaño diferente:
//      int[][] m = new int[3][];   ? 3 filas, columnas sin definir
//      m[0] = new int[1];          ? fila 0 tiene 1 columna
//      m[1] = new int[3];          ? fila 1 tiene 3 columnas
//    Esto es distinto de C o Python donde la matriz es siempre rectangular.
// 2. miArray[i].length
//    En una matriz irregular, cada fila tiene su propio .length.
//    miArray.length         ? número de FILAS
//    miArray[i].length      ? número de COLUMNAS de la fila i
//    Nunca asumir que todas las filas tienen el mismo .length
//    sin haberlo comprobado antes.
// 3. Arrays.fill(array, valor)
//    Rellena TODOS los elementos de un array con el mismo valor.
//    Equivale a un bucle for pero más conciso y expresivo.
//    Requiere: import java.util.Arrays;
// 4. REUTILIZACIÓN DE MÉTODOS
//    esCuadrada() llama a esRegular() internamente.
//    Principio DRY (Don't Repeat Yourself): si ya tenemos la
//    lógica escrita, la reutilizamos en lugar de copiarla.
// 5. FOR-EACH con matrices
//    for (int[] fila : matriz)      ? recorre las filas
//    for (int val : fila)           ? recorre los valores de esa fila
//    Más legible que el for clásico cuando no necesitamos el índice.
package metodosmatrices;

import java.util.Arrays;

/**
 *
 * @author Reinaldo Gil
 */
public class MetodosMatrices {

    // MÉTODO 1: esRegular 
    // Una matriz es regular si TODAS sus filas tienen el mismo length.
    // Usamos la longitud de la fila 0 como referencia y comparamos el resto.
    static boolean esRegular(int[][] miArray) {
        if (miArray == null || miArray.length == 0) {
            return false;
        }
        int columnasFila0 = miArray[0].length;
        for (int i = 1; i < miArray.length; i++) {
            // Si alguna fila difiere en longitud ? irregular
            if (miArray[i].length != columnasFila0) {
                return false;
            }
        }
        return true; // Todas las filas son iguales es regular
    }

    // MÉTODO 2: esCuadrada 
    // Cuadrada = regular + mismo número de filas que de columnas.
    // Aprovechamos esRegular() para no repetir código (reutilización).
    static boolean esCuadrada(int[][] miArray) {
        if (!esRegular(miArray)) {
            return false;
        }
        // Si es regular, todas las filas tienen el mismo length ? usamos fila 0
        return miArray.length == miArray[0].length;
    }

    // MÉTODO 3: generarMatrizPiramide
    // En Java, int[][] puede ser IRREGULAR: cada fila puede tener distinto length.
    // Creamos primero el array de filas, luego asignamos cada fila por separado.
    static int[][] generarMatrizPiramide(int nNiveles) {
        // Creamos el "array de arrays" con nNiveles filas, SIN definir columnas aún
        int[][] piramide = new int[nNiveles][];

        for (int i = 0; i < nNiveles; i++) {
            // La fila i tiene i+1 columnas (fila 0 ? 1 col, fila 1 ? 2 col, etc.)
            piramide[i] = new int[i + 1];
            // Rellenamos todas las celdas de la fila con el valor i
            Arrays.fill(piramide[i], i);
        }
        return piramide;
    }

    //MAIN: demostración
    public static void main(String[] args) {

        // Matriz regular cuadrada 3x3
        int[][] cuadrada = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("¿Regular? " + esRegular(cuadrada));   // true
        System.out.println("¿Cuadrada? " + esCuadrada(cuadrada));   // true

        // Matriz irregular (jagged array)
        int[][] irregular = {{1, 2}, {3, 4, 5}, {6}};
        System.out.println("¿Regular? " + esRegular(irregular));  // false
        System.out.println("¿Cuadrada? " + esCuadrada(irregular));  // false

        // Generamos pirámide de 4 niveles y la mostramos
        int[][] pir = generarMatrizPiramide(4);
        System.out.println("\nMatriz pirámide (nNiveles=4):");
        for (int[] fila : pir) {               // for-each sobre filas
            for (int val : fila) {              // for-each sobre elementos
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
