package matriz4;

import java.util.Scanner;

public class Matriz4 {

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

    public static void comunes(int R[][], int fr, int cr, int S[][], int fs, int cs) {
        System.out.print("nnLos elementos comunes de R en S son: ");
        for (int i = 1; i <= fr; i++) {
            for (int j = 1; j <= cr; j++) {
                for (int k = 1; k <= fs; k++) {
                    for (int l = 1; l <= cs; l++) {
                        if (R[i][j] == S[k][l]) {
                            System.out.print("[" + R[i][j] + "]");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int R[][] = new int[20][20];
        int S[][] = new int[20][20];
        System.out.print("Inserte filas de R: ");
        int fr = Leer.nextInt();
        System.out.print("Inserte columnas de R: ");
        int cr = Leer.nextInt();
        System.out.print("Inserte filas de S: ");
        int fs = Leer.nextInt();
        System.out.print("Inserte columnas de S: ");
        int cs = Leer.nextInt();

        System.out.print("nLLENANDO MATRIZ R: n");
        llenar(R, fr, cr);
        System.out.print("nLLENANDO MATRIZ S: n");
        llenar(S, fs, cs);
        System.out.print("nLA MATRICES R : ");
        mostrar(R, fr, cr);
        System.out.print("nLA MATRICES S : ");
        mostrar(S, fs, cs);
        comunes(R, fr, cr, S, fs, cs);

    }

}
