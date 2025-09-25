/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_1_1;

import java.awt.geom.Ellipse2D;
import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca Coordenadas Eje X");
        Scanner teclado = new Scanner(System.in);
        double x = teclado.nextDouble();
        while (x != -1) {
            System.out.println("Introduzca Coordenadass Eje Y");
            double y = teclado.nextDouble();
            Ellipse2D.Double elipse = new Ellipse2D.Double(0, 0, 200, 55);
            if (elipse.contains(x, y)) {
                System.out.println("El punto (" + x + "," + y + ") Está dentro");
            } else {
                System.out.println("El punto (" + x + "," + y + ") Está fuera");
            }
            System.out.println("Introduzca Coordenadas Eje X");
            x = teclado.nextDouble();
        }

    }
}
