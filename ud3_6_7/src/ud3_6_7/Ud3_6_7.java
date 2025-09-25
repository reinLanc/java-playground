/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_6_7;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_6_7 {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca la altura: ");
        double a = teclado.nextDouble();
        while (a != 0) {
            System.out.println("Introduzca el sexo: V o M");
            teclado.nextLine();
            String sexo = teclado.nextLine();

            switch (calculaAltura(a, sexo)) {
                case 1:
                    System.out.println("Es bajo./a");
                    break;
                case 2:
                    System.out.println("Es normal");
                    break;
                case 3:
                    System.out.println("Es alto/a");
                    break;
            }
            System.out.println("Introduzca la altura: ");
             a = teclado.nextDouble();
        }
    }

    // 1 = bajo, 2 = normal , 3 = Alto
    static int calculaAltura(double a, String sexo) {
        int clasificacion = 0;
        sexo = sexo.toUpperCase();
        if (sexo.equals("V")) {
            if (a < 1.60) {
                clasificacion = 1;
            } else if (a >= 1.60 && a <= 1.75) {
                clasificacion = 2;
            } else {
                clasificacion = 3;
            }
        } else {
            if (a < 1.50) {
                clasificacion = 1;
            } else if (a >= 1.50 && a <= 1.65) {
                clasificacion = 2;
            } else {
                clasificacion = 3;
            }
        }
        return clasificacion;
    }
}
