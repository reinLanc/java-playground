/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_1;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un número:");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int i;

        System.out.print("Número ");
        System.out.print(" Cuadrado ");
        System.out.println(" Cubo ");
        for (i = 1; i <= num; i++) {
            System.out.print(i + "\t");
            System.out.print(i*i + "\t");
            System.out.println( i*i*i + "\n");
        }
    }

}
