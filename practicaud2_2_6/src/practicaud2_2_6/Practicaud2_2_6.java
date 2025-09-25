/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_6;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el número de horas:");
        Scanner teclado = new Scanner(System.in);
        int horas = teclado.nextInt();
        double precio;
        while (horas >= 0) {
            System.out.println("Introduce preecio de hora");
            precio = teclado.nextDouble();
            if (horas > 40) {
                System.out.println("Sueldo: " + (40 * precio + (horas - 40) * precio * 1.5) + " €");
            } else {
                System.out.println("Sueldo " + (horas * precio) + "€");
            }
            System.out.println("Introduce numero de horas");
            horas = teclado.nextInt();
        }
    }

}
