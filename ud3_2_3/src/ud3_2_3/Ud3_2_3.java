/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_2_3;

import java.util.Scanner;

public class Ud3_2_3 {
static Scanner teclado = new Scanner(System.in);
    private static String reverse(String cadena) {
       String invertida = "";
       for(int i = cadena.length() - 1 ; i >= 0; i--) {
           invertida = invertida + cadena.charAt(i);
       }
        return invertida;
    }
    public static void main(String[] args) {
        System.out.println("Introduce una cadena de texto: ");
       String cadena = teclado.nextLine();
        System.out.println("CADENA INVERTIDA:");
        System.out.println(reverse(cadena));
    }
}
