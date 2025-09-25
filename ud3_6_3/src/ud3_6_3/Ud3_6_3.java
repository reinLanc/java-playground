package ud3_6_3;

import java.util.Scanner;

public class Ud3_6_3 {

    static Scanner teclado = new Scanner(System.in);

    public static double cuadrado(double lado) {
        return lado * lado;
    }

    public static double rectangulo(double altura, double base) {
        return altura * base;
    }

    public static double circulo(double radio) {
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
                    System.out.println("Introduce el lado del Cuadrado");
                    double lado = teclado.nextDouble();
                    System.out.println("El cuadrado tiene área de: " + cuadrado(lado));
                    break;
                case 2:
                    System.out.println("Introduce la altura del rectangulo");
                    double altura = teclado.nextDouble();
                    System.out.println("Introduce la base del rectangulo");
                    double base = teclado.nextDouble();
                    System.out.println("El rectangulo tiene área de: " + rectangulo(altura, base));
                    break;
                case 3:
                    System.out.println("Introduce el radio del circulo");
                    double radio = teclado.nextDouble();
                    System.out.println("El circulo tiene área de: " + circulo(radio));
                    break;
            }
            System.out.println("\t Introducir opción(1-3, 0 finaliza)");
            opcion = teclado.nextInt();
        }
    }

}
