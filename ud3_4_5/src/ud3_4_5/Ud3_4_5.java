package ud3_4_5;

import java.util.Scanner;

public class Ud3_4_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la arista del cubo");
        double arista = teclado.nextDouble();
        System.out.println("El cubo de arista " + arista + " cm. Tiene un volumen de " + calcVolumen(arista) + " cm3");

    }

    public static double calcVolumen(double a) {
        double v;
        v = Math.pow(a,3);
        return v;
    }

}
