/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_2_2;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_2_2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una frase: ");
        String frase = teclado.nextLine();
        String frase2 = frase.toUpperCase();
        int contadorA = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase2.charAt(i) == 'A') {
                contadorA++;
            }
        }
        if (contadorA > 0) {
            System.out.println("La frase " + frase + " contiene " + contadorA
                    + "·veces la letra 'a'.");
        } else {
            System.out.println("La frase " + frase + " no contiene la letra 'a'");
        }
}
}