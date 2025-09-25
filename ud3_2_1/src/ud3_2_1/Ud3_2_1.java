/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_2_1;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_2_1 {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de carácteres:");
        String cadena = teclado.nextLine();
        System.out.println(cadena + "\n");
        longitud(cadena);
        char7(cadena);
        buscarx(cadena);
        mayuscula(cadena);
    }

    public static void longitud(String cadena) {
        int resultado = cadena.length();
        System.out.println("Longitud de la cadena: " + resultado);
    }

    public static void char7(String cadena) {
        if (cadena.length() < 7) {
            System.out.println("La cadena no llega a los 7 carácteres.");
        } else {
            String resultado = cadena.substring(7, 8);
            System.out.println("Carácter de posición 7 de la cadena: " + resultado);
        }
    }

    public static void buscarx(String cadena) {
        String resultado = cadena.toUpperCase();
        int posx = resultado.indexOf("X");
        if (posx != -1) {
            System.out.println("La x ocupa la posición : " + posx);
        } else {
            System.out.println("La x no está presente en la cadena.");
        }
    }

    public static void mayuscula(String cadena) {
        String resultado = cadena.toUpperCase();
        System.out.println("Cadena en Mayuscula: \n" + resultado);
    }

}
