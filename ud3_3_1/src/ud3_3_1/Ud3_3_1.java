/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_3_1;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce tu DNI:");
        Scanner teclado = new Scanner(System.in);
        String nif = teclado.nextLine();
        String numerica = nif.substring(0,7);
        int dni, i, index;
        final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        boolean error = false;
        char letra;
        int longitud = nif.length();
        if (longitud != 9) {
            error = true;
            System.out.println("Longitud incorrecta. Debe tener 9 carácteres");
        }
        if (!Character.isLetter(nif.charAt(8))) {
            error = true;
            System.out.println("El ultimo carácter debe ser una letra.");
        }
        for (i = 0; i <= numerica.length(); i++) {          
            if (!Character.isDigit(nif.charAt(i))) {
                error = true;
                System.out.println("El caracter en la posición " + i + " no es un digito");
            }
        }
        if (!error) {
            dni = Integer.parseInt(numerica);
            index = dni % 23;
            if (nif.charAt(8) == (letras.charAt(index))) {
                System.out.println("Nif Valido");
            } else {
                System.out.println("Nif no valido.");
            }
            System.out.println(index);
            System.out.println(letras.charAt(index));
        }
    }
}
