/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;

import static java.awt.Frame.NORMAL;
import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
enum Altura {
    ALTO, NORMAL, BAJO
};

public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numPersonas, i;
        double altura;
        String sexo;

        System.out.println("Introduce el número de personas para la estadística de altura: ");
        numPersonas = teclado.nextInt();

        for (i = 0; i < numPersonas; i++) {
            System.out.println("Introduce la altura: ");
            altura = teclado.nextDouble();
            teclado.nextLine();

            System.out.println("Sexo (V,v ó M,m): ");
            sexo = teclado.nextLine();

            switch (clasificarAltura(altura, sexo)) {
                case ALTO:
                    System.out.println("Es alto/a");
                    break;
                case NORMAL:
                    System.out.println("Estatura normal");
                    break;
                case BAJO:
                    System.out.println("Es bajo/a");
                    break;
            }
        }
    }

    /*
     * devolve 1-alto  2-normal  3-bajo
     */
    public static Altura clasificarAltura(double a, String s) {

        s = s.toUpperCase();

        if (s.equals("M")) {
            if (a < 1.50) {
                return Altura.BAJO;
            } else if (a > 1.65) {
                return Altura.ALTO;
            } else {
                return Altura.NORMAL;
            }
        } else {
            if (a < 1.60) {
                return Altura.BAJO;
            } else if (a > 1.75) {
                return Altura.ALTO;
            } else {
                return Altura.NORMAL;
            }
        }
    }

}
