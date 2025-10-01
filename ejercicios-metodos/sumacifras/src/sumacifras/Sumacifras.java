package sumacifras;

import java.util.Scanner;

public class Sumacifras {

    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if (sumaCifras(n) > 1) {
            System.out.println(n + " tiene " + sumaCifras(n) + " cifras.");
        } else {
            System.out.println(n + " tiene " + sumaCifras(n) + " cifra.");
        }

    }

    public static int sumaCifras(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return 1 + sumaCifras(n / 10);
        }
    }
}
