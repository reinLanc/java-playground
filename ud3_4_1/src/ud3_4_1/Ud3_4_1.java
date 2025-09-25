/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_4_1;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_4_1 {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce un número double");
        double n = teclado.nextDouble();
        System.out.println(n);
        System.out.println("Redondeado a entero: " + redondeadoEntero(n));
        System.out.println("Redondeado a entero cercano al inf. positivo "
                + enteroInfPositivo(n));
                System.out.println("Redondeado a entero cercano al inf."
                        + " negativo" + enteroInfNegativo(n));
    }

    private static double redondeadoEntero(double n) {
        return Math.round(n);
    }

    private static double enteroInfPositivo(double n) {
        return Math.floor(n);
    }

    private static double enteroInfNegativo(double n) {
        return Math.ceil(n);
    }
}
