/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_2_4;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_2_4 {
static Scanner teclado = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la cadena de texto nº1:");
        String cadena1 = teclado.nextLine();
        System.out.println("Introduzca la cadena de texto nº2:");
        String cadena2 = teclado.nextLine(); 
        System.out.println("Cadenas concatenadas:");
        System.out.println(concat(cadena1,cadena2));
    }
    public static String concat(String cadena1, String cadena2) {
      return cadena1.concat(cadena2);
    }
}
