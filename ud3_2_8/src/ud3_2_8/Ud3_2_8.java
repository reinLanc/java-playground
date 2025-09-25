/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_2_8;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_2_8 {
static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca una frase:");
         String frase = teclado.nextLine();
         frase = frase.toUpperCase();
         System.out.print(frase.charAt(0));
        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                System.out.print(frase.charAt(i + 1));
            }
        }
    }
    
}
