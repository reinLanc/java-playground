/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_5;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce el precio: ");
        Scanner teclado3 = new Scanner(System.in);
        int precio = teclado3.nextInt();
        double acumulador = 0;
        while (precio > 0) {
            System.out.println("Introduce un número de unidades:");
            Scanner teclado = new Scanner(System.in);
            int unidades = teclado.nextInt();
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("Introduce el IVA: ");
            int iva = teclado2.nextInt();
            double total = (precio + precio * iva / 100) * unidades;
            acumulador += total;
            System.out.println("Total de la compra:" + acumulador + "€");
            System.out.println("Introduce el precio: ");
            precio = teclado3.nextInt();
        }

    }
}
