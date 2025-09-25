package sumarecursiva;

import java.util.Scanner;

public class Sumarecursiva {

    public static void main(String[] args) {
        System.out.println("Introduce un numero:");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        System.out.println("Suma Recursiva de " + n + " : " +sumador(n));
    }

    public static int sumador(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n + (sumador(n - 1));
        }

    }
}
