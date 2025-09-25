/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_3_3;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio");
        double precio = teclado.nextDouble();
        System.out.println("Introduce el IVA");
        int iva = teclado.nextInt();
        double ivaTotal = 0;
        int margen = 0;
        double precioTotal;

        while (precio != 0) {
            while (iva != 1 && iva != 2 && iva != 3) {
                System.out.println("IVA Incorrecto. \n Introduce el IVA ( 1,2,3)");
                iva = teclado.nextInt();
            }        
            switch (iva) {
                case 1:
                    if (precio <= 3000) {
                        margen = 30;
                        ivaTotal = 4;
                    } else {
                        margen = 45;
                        ivaTotal = 4;
                    }
                    break;
                case 2:
                    if (precio <= 700) {
                        margen = 22;
                        ivaTotal = 7;
                    } else {
                        margen = 50;
                        ivaTotal = 7;
                    }
                    break;
                case 3:
                    if (precio <= 180) {
                        margen = 75;
                        ivaTotal = 16;
                    } else {
                        margen = 100;
                        ivaTotal = 16;
                    }
                    break;
            }
            precioTotal = precio + (precio*margen/100) + precio * iva/100;
            System.out.println("Precio total: " + precioTotal);
            System.out.println("Introduce el precio");
            precio = teclado.nextDouble();
            System.out.println("Introduce el IVA");
            iva = teclado.nextInt();
        }
    }
}
