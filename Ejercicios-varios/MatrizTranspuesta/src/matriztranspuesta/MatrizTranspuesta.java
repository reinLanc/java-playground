/*
Transpuesta de una matriz rectangular
Enunciado
Crea un programa en Java que defina una matriz de 3 filas y 4 columnas.
El programa debe calcular y mostrar su matriz transpuesta
(la matriz transpuesta tiene las filas convertidas en columnas y viceversa, resultando en una matriz de 4x3).
 */
package matriztranspuesta;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Matriz original de 3x4
        int[][] matrizOriginal = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Obtener dimensiones
        int filas = matrizOriginal.length;        // 3
        int columnas = matrizOriginal[0].length;  // 4

        // Crear matriz transpuesta de 4x3
        int[][] matrizTranspuesta = new int[columnas][filas];

        // Mostrar matriz original
        System.out.println("Matriz Original (" + filas + "x" + columnas + "):");
        mostrarMatriz(matrizOriginal);

        // Calcular la transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // El elemento [i][j] de la original va a [j][i] en la transpuesta
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Mostrar matriz transpuesta
        System.out.println("\nMatriz Transpuesta (" + columnas + "x" + filas + "):");
        mostrarMatriz(matrizTranspuesta);
    }

    // Método auxiliar para mostrar cualquier matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
