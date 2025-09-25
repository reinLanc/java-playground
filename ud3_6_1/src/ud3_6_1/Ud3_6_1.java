package ud3_6_1;

import java.util.Scanner;

public class Ud3_6_1 {
static Scanner teclado = new Scanner(System.in);
    public static void cuadrado() {
        System.out.println("Introduce el lado del Cuadrado");
        double lado = teclado.nextDouble();
        System.out.println("El área del cuadrado de lado " + lado + " es:" + (lado * lado));
    }

    public static void rectangulo() {
        System.out.println("Introduce la altura del rectangulo");
        double altura = teclado.nextDouble();
        System.out.println("Introduce la base del rectangulo");
        double base = teclado.nextDouble();
        System.out.println("El área del rectangulo de altura " + altura + " y de base " + base + " es: " + (altura*base));
    }

    public static void circulo() {
        System.out.println("Introduce el radio del circulo");
        double radio = teclado.nextDouble();
        System.out.println("El área del circulo de radio " + radio + " es: " + (Math.PI *radio*radio));
    }

    public static void main(String[] args) {
        System.out.println("1.Cuadrado\n2.Rectangulo\n3.Circulo\n0.Fin,");
        System.out.println("\t Introducir opción(1-3, 0 finaliza)");
        int opcion = teclado.nextInt();
        while (opcion > 3) {
            System.out.println("Valor incorrecto. opciones del 1 al 3");
            System.out.println("1.Cuadrado\n2.Rectangulo\n3.Circulo\n0.Fin,");
            System.out.println("\t Introducir opción(1-3, 0 finaliza)");
            opcion = teclado.nextInt();
        }
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    cuadrado();
                    break;
                case 2:
                    rectangulo();
                    break;
                case 3:
                    circulo();
                    break;
            }
            System.out.println("1.Cuadrado\n2.Rectangulo\n3.Circulo\n0.Fin,");
            System.out.println("\t Introducir opción(1-3, 0 finaliza)");
            opcion = teclado.nextInt();
        
    }
}
}
