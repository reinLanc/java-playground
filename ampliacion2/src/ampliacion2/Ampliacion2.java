/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion2;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ampliacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el importe");
        double importe = teclado.nextDouble();
        double descuento = 0;
        double mediaVentas = 0;
        int contadorClientes = 0;
        int contadorVentas = 0;
        double total = 0;
        while (importe > 0.0) {
            if (importe < 600) {
                descuento = 0;
                contadorClientes++;
                contadorVentas += importe;
            } else if (importe >= 600 && importe <= 3000) {
                descuento = 0.05;
                contadorClientes++;
                contadorVentas += importe;
            } else if (importe > 3000 && importe <= 5000) {
                descuento = 0.10;
                contadorClientes++;
                contadorVentas += importe;
            } else {
                descuento = 0.15;
                contadorClientes++;
                contadorVentas += importe;
            }
            mediaVentas = contadorVentas / contadorClientes;
            total = importe - (importe * descuento);
            System.out.println("Total Importe: " + total);
            System.out.println("Introduzca el importe");
            importe = teclado.nextDouble();
        }
        System.out.println("Importe: " + importe);
        System.out.println("Total final: " + contadorVentas);
        System.out.println("Valor medio de las compras:" + mediaVentas);
    }
}
