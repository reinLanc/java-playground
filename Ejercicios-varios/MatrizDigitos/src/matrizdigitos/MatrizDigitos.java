/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizdigitos;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUCIR M");
        m = sc.nextInt();
        System.out.println("INTRODUCIR N");
        n = sc.nextInt();

        int A[][] = new int[m][n];
        int B[][] = new int[m][n];

        cargarm(A, m, n);
        llenarm(A, B, m, n);

        System.out.println("Matriz original:");
        mostrarm(A, m, n);
        System.out.println("Matriz de cantidad de digitos:");
        mostrarm(B, m, n);
    }

    static void cargarm(int A[][], int m, int n) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
    }

    static void llenarm(int A[][], int B[][], int m, int n) {
        int i, j, c, aux;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                c = 0;
                aux = A[i][j];
                do {
                    c++;
                    aux = aux / 10;
                } while (aux != 0);
                B[i][j] = c;
            }
        }
    }

    static void mostrarm(int X[][], int m, int n) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("[" + X[i][j] + "] ");
            }
            System.out.println();
        }
    }

}
