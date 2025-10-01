/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz6;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Matriz6 {

    public static void llenar(int M[][], int f, int c) {
        Scanner Leer = new Scanner(System.in);
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("Inserte pos[" + i + "][" + j + "]: ");
                M[i][j] = Leer.nextInt();
            }
        }
    }

    public static void mostrar(int M[][], int f, int c) {
        for (int i = 1; i <= f; i++) {
            System.out.println();
            for (int j = 1; j <= c; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
        }
    }

    public static void cuenta(int M[][], int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("n[" + M[i][j] + "] tiene: " + digitos(M[i][j]) + " digito(s)");
            }
        }
    }

    public static int digitos(int n) {
        int contador = 0;
        while (n != 0) {
            n = n / 10;
            contador++;
        }
        return (contador);
    }

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int M[][] = new int[20][20];
        System.out.print("Inserte filas de la matriz: ");
        int f = Leer.nextInt();
        System.out.print("Inserte columnas de la matriz: ");
        int c = Leer.nextInt();
        System.out.print("nLLENANDO MATRIZ M: n");
        llenar(M, f, c);
        System.out.print("nLA MATRIZ: ");
        mostrar(M, f, c);
        System.out.print("nnCONTEO DE DIGITOS: ");
        cuenta(M, f, c);

    }

}
