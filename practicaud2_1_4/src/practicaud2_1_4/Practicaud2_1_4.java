/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_1_4;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Num " + num + " es par.");
            } else {
                System.out.println("Num " + num + " es impar");
            }
        } else {
            System.out.println("ZERO");
        }
    }
}
