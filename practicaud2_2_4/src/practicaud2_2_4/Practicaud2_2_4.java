/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_4;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un número:");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        while (num != 999) {
            System.out.println("Número introducido: " + num);
            System.out.println("Introduce un número:");
            num = teclado.nextInt();
        }
        System.out.println("Fin del programa.");
    }

}
