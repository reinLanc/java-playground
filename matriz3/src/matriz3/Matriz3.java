package matriz3;

import java.util.Scanner;

public class Matriz3 {

    public static void llenar(int M[][], int d) {
        Scanner Leer = new Scanner(System.in);
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= d; j++) {
                System.out.print("Inserte pos[" + i + "][" + j + "]: ");
                M[i][j] = Leer.nextInt();
            }
        }
    }

    public static void mostrar(int M[][], int d) {
        for (int i = 1; i <= d; i++) {
            System.out.println();
            for (int j = 1; j <= d; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
        }
    }

    public static void invierte(int M[][], int d) {
        int fin = d;
        for (int i = 1; i <= d / 2; i++) {
            int aux = M[i][d];
            M[i][d] = M[d][i];
            M[d][i] = aux;
            fin--;
        }
    }

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int M[][] = new int[20][20];
        System.out.print("Inserte dimen. de la matriz cuadrada: ");
        int d = Leer.nextInt();
        llenar(M, d);
        System.out.print("nMATRIZ ORIGINAL: ");
        mostrar(M, d);
        System.out.print("nnMATRIZ CON LA DIAGONAL SECUNDARIA INVERTIDA: ");
        invierte(M, d);
        mostrar(M, d);

    }

}
