/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_3_7;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int impares = 0;
        int pares = 0;
        int total = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("Introduzca 15 números enteros (" + i + "/15)");
            Scanner teclado = new Scanner(System.in);
            num = teclado.nextInt();
            if (num % 2 == 0) {
                total += num;
            } else {
                total -= num;
            }
        }
        System.out.println("Total: " + total);
    }

}
