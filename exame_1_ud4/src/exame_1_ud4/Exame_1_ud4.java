package exame_1_ud4;

import java.util.Arrays;

public class Exame_1_ud4 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                num = (int) Math.floor(Math.random() * (100 +1));
                matriz[i][j] = num;
                for (i = 0; i < matriz.length; i++) {
                    for (j = 0; j < matriz.length; j++) {
                        if (matriz[i][j] != num) {
                            num = (int) Math.floor(Math.random() * (100 + 1));
                            matriz[i][j] = num;
                        }
                    }
                }
            }
        }

        mostrar(matriz);
    }

    public static void mostrar(int n[][]) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
