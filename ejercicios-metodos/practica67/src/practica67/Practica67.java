package practica67;

import java.util.Scanner;

public class Practica67 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        double altura;
        String sexo;

        System.out.println("Introduce la altura (0-salir): ");
        altura = teclado.nextDouble();
        teclado.nextLine();
        while (altura != 0) {


            System.out.println("Sexo (V,v ó M,m): ");
            sexo = teclado.nextLine();

            switch (clasificarAltura(altura, sexo)) {
                case 1:
                    System.out.println("Es alto/a");
                    break;
                case 2:
                    System.out.println("Estatura normal");
                    break;
                case 3:
                    System.out.println("Es bajo/a");
                    break;
            }
            System.out.println("Introduce la altura (0-salir): ");
            altura = teclado.nextDouble();
            teclado.nextLine();
        }
    }

    /*
     * devolve 1-alto  2-normal  3-bajo
     */
    public static int clasificarAltura(double a, String s) {

        s = s.toUpperCase();

        if (s.equals("M")) {
            if (a < 1.50) {
                return 3;
            } else if (a > 1.65) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (a < 1.60) {
                return 3;
            } else if (a > 1.75) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
