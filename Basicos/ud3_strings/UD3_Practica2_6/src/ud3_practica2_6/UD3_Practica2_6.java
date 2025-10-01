/*
 * Programa que lee una cadena de caracteres del teclado y dice si es palíndromo.
 */
package ud3_practica2_6;

import java.util.*;

public class UD3_Practica2_6 {

    public static void main(String[] args) {
        //OPCION 1
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Introduce una cadena: ");
//        String cadena = teclado.nextLine();
//        
//        boolean esPalindromo = true;
//        int principio = 0;
//        int fin = cadena.length()-1;
//        while (principio < fin) {
//            if (cadena.charAt(principio) != cadena.charAt(fin)) {
//                esPalindromo = false;
//                break;
//            }
//            principio++;
//            fin--;
//        }
//        
//        if (esPalindromo) {
//            System.out.println("La cadena es un palíndromo.");
//        } else {
//            System.out.println("La cadena no es un palíndromo.");
//        }
        
        // OPCION 2
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();
        
        String reves = "";
        for (int i=cadena.length()-1;i>=0;i--){
            reves = reves + cadena.charAt(i);
        }
                
        if (cadena.equals(reves)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
    
    
    
    
}
