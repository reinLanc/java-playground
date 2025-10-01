/*
 * Programa que calcula el precio final a pagar por varias unidades de un mismo 
 * artículo, introduciendo por teclado el número de unidades, el precio de cada 
 * unidad y el tanto por ciento de IVA. El programa finaliza cuando el precio 
 * sea 0 o negativo.
 */
package ud2_practica2_5;

import java.util.*;

public class UD2_Practica2_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precioUnidad,precioFinal;
        int numUnidades, iva;

        System.out.print("Introduce precio del artículo (<=0 para salir): ");
        precioUnidad = teclado.nextDouble();
        while (precioUnidad > 0) {
            System.out.print("Introduce número de unidades: ");
            numUnidades = teclado.nextInt();
            System.out.print("Introduce IVA: ");
            iva = teclado.nextInt();
            precioFinal = numUnidades * precioUnidad;
            precioFinal += precioFinal * iva / 100;
            System.out.println("Precio final: " + precioFinal + "\n");
            System.out.print("Introduce precio del artículo (<=0 para salir): ");
            precioUnidad = teclado.nextDouble();
        }
    }
}
