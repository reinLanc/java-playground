/*
 * Programa que lee dos cadenas de caracteres del teclado y dice si son iguales o no.
 */
package ud3_practica2_5;

import java.util.*;

public class UD3_Practica2_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena1 = teclado.nextLine();
        System.out.print("Introduce otra cadena: ");
        String cadena2 = teclado.nextLine();
        
        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales");
        } else {
            System.out.println("Las cadenas son distintas");
        }
        
    }
    
}
