/*
 * Programa que lee del teclado una cadena de caracteres y muestre la siguiente
información:
* • Su longitud
* • El carácter de la posición 7
* • La posición en que aparece el primer carácter 'x' o un aviso indicando que la cadena no
* contiene este carácter.
* • La cadena transformada en mayúsculas
*/
package ud3_practica2_1;

import java.util.*;

public class UD3_Practica2_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de más de 7 caracteres: ");
        String cadena = teclado.nextLine();
        
        System.out.println("");
        System.out.println("Longitud de la cadena: " + cadena.length());
        if(cadena.length()>6)
            System.out.println("Carácter de la posición 7: " + cadena.charAt(6));
        int posicion = cadena.indexOf('x');
        if (posicion != -1) {
            System.out.println("El primer carácter 'x' aparece en la posición "
                                + (posicion+1));
        } else {
            System.out.println("La cadena no contiene el carácter 'x'.");
        }
        System.out.println("Cadena transformada en mayúsculas: " 
                            + cadena.toUpperCase());
    }
    
}
