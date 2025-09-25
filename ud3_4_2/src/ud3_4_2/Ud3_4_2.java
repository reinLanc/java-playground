/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_4_2;

import java.util.Scanner;

public class Ud3_4_2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce valor del angulo º");
        double angulo = teclado.nextDouble();
        double anguloRadianes = Math.toRadians(angulo);
        System.out.println("Angulo: " + angulo + "º");
        System.out.println("Seno del angulo: " + seno(anguloRadianes));
        System.out.println("Coseno del angulo: " + coseno(anguloRadianes));
        System.out.println("Tangente del angulo: " + tangente(anguloRadianes));
    }

    private static double seno(double a) {
        return Math.sin(a);
    }

    private static double coseno(double a) {
        return Math.cos(a);
    }

    private static double tangente(double a) {
        return Math.tan(a);
    }
}
