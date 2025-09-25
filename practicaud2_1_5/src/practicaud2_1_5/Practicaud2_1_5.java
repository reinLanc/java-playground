/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_1_5;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el precio del Articulo.");
        Scanner teclado2 = new Scanner(System.in);
        float precio = teclado2.nextFloat();
        System.out.println("Introduzca la cantidad de articulos.");
        Scanner teclado = new Scanner(System.in);
        int unidad = teclado.nextInt();
        int descuento;
        double total;
        if (unidad >= 100) {
             descuento = 40;
             total = precio - precio * descuento/100;
        } else if (unidad >= 25) {
             descuento = 20;
             total = precio - precio * descuento/100;
        } else if (unidad > 10) {
             descuento = 10;
             total = precio - precio * descuento/100;
        } else {
            descuento = 0;
             total = precio - precio * descuento/100;
        }
        System.out.println("Has obtenido un " + descuento + "% de descuento.");
        System.out.println("Precio final " + total + "€");
    }

}
