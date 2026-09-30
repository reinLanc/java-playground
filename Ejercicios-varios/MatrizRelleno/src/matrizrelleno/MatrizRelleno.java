/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizrelleno;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizRelleno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas: ");
        int m = sc.nextInt();
        System.out.print("Columnas: ");
        int n = sc.nextInt();

        // a) Suma de indices
        System.out.println("\na) Suma de indices:");
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i + j;
            }
        }
        imprimir(a, m, n);

        // b) Contador incremental fila a fila
        System.out.println("\nb) Contador fila a fila:");
        int[][] b = new int[m][n];
        int cont = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = cont++;
            }
        }
        imprimir(b, m, n);

        // c) Contador incremental columna a columna
        System.out.println("\nc) Contador columna a columna:");
        int[][] c = new int[m][n];
        cont = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                c[i][j] = cont++;
            }
        }
        imprimir(c, m, n);

        // d) Diagonal principal '*' y diagonal secundaria '+'
        // (Solo funciona bien con matriz cuadrada)
        System.out.println("\nd) Diagonales (matriz cuadrada n x n):");
        System.out.print("Tamanio para matriz cuadrada: ");
        int size = sc.nextInt();
        String[][] d = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                d[i][j] = " ";
            }
        }

        for (int i = 0; i < size; i++) {
            d[i][i] = "*";                      // diagonal principal
            d[i][size - 1 - i] = "+";          // diagonal secundaria
        }
        // Si coinciden ambas diagonales (centro en impar), ponemos '*'
        if (size % 2 != 0) {
            int mid = size / 2;
            d[mid][mid] = "*+";
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + d[i][j] + "] ");
            }
            System.out.println();
        }
    }

    static void imprimir(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
