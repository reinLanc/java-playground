/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla[][];
        int i, j;
        int suma = 0;

        tabla = new int[4][4];
        System.out.println("INTRODUCE TABLA 4X4");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Introduce posicion " + i + " " + j);
                tabla[i][j] = Integer.parseInt(teclado.nextLine());
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.printf("%6d", tabla[i][j]);
                suma += tabla[i][j];
            }
            System.out.println();
        }
        System.out.println("Suma total " + suma);

    }

}
