/*
Suma de las diagonales de una matriz cuadrada
Escribe un programa en Java que cree una matriz cuadrada de 4x4 con números enteros.
El programa debe calcular y mostrar:
La suma de los elementos de la diagonal principal
La suma de los elementos de la diagonal secundaria
La suma total de ambas diagonales
 */
package sumadiagonales;

/**
 *
 * @author Reinaldo Gil
 */
public class SumaDiagonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar e inicializar la matriz 4x4
        //Implementar numero aleatorio...
        int[][] matriz = {
            {5, 2, 8, 1},
            {3, 7, 4, 6},
            {9, 1, 3, 2},
            {4, 6, 5, 8}
        };

        // Variables para almacenar las sumas
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        // Mostrar la matriz
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular suma de diagonal principal y secundaria
        for (int i = 0; i < matriz.length; i++) {
            // Diagonal principal: i == j
            sumaPrincipal += matriz[i][i];

            // Diagonal secundaria: i + j == n-1
            sumaSecundaria += matriz[i][matriz.length - 1 - i];
        }

        // Mostrar resultados
        System.out.println("\nSuma diagonal principal: " + sumaPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaSecundaria);
        System.out.println("Suma total de ambas diagonales: "
                + (sumaPrincipal + sumaSecundaria));
    }

}
