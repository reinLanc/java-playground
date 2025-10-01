package potenciarecursiva;

import java.util.Scanner;

public class Potenciarecursiva {

    public static void main(String[] args) {
        System.out.println("Introduce la base:");
        Scanner teclado = new Scanner(System.in);
        int base = teclado.nextInt();
        System.out.println("Introduce el exponente");
        int exponente = teclado.nextInt();
        System.out.println(potenciaRecursiva(base, exponente));
    }

    public static int potenciaRecursiva(int b, int e) {
        if (e == 0) {
            return 1;
        } else if (e == 1) {
            return b;
        } else {
            return b * potenciaRecursiva(b, e - 1);
        }
    }
}
