package ud3_6_2;

import java.util.Scanner;

public class Ud3_6_2 {

    static Scanner teclado = new Scanner(System.in);

    public static double cuadrado() {
        System.out.println("Introduce el lado del Cuadrado");
        double lado = teclado.nextDouble();
        return lado * lado;
    }

    public static double rectangulo() {
        System.out.println("Introduce la altura del rectangulo");
        double altura = teclado.nextDouble();
        System.out.println("Introduce la base del rectangulo");
        double base = teclado.nextDouble();
        return altura * base;
    }

    public static double circulo() {
        System.out.println("Introduce el radio del circulo");
        double radio = teclado.nextDouble();
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        System.out.println("1.Cuadrado\n2.Rectangulo\n3.Circulo\n0.Fin,");
        System.out.println("\t Introducir opción(1-3, 0 finaliza)");
        int opcion = teclado.nextInt();
        while (opcion < 0 || opcion > 3) {
            System.out.println("Valor incorrecto. opciones del 1 al 3");
            System.out.println("1.Cuadrado\n2.Rectangulo\n3.Circulo\n0.Fin,");
            System.out.println("\t Introducir opción(1-3, 0 finaliza)");
            opcion = teclado.nextInt();
        }
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("El cuadrado tiene área de: " + cuadrado());
                    break;
                case 2:
                    System.out.println("El rectangulo tiene área de: " + rectangulo());
                    break;
                case 3:
                    System.out.println("El circulo tiene área de: " + circulo());
                    break;
            }
            System.out.println("\t Introducir opción(1-3, 0 finaliza)");
            opcion = teclado.nextInt();
        }
    }

}
