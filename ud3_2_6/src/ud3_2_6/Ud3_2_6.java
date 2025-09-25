
package ud3_2_6;

import java.util.Scanner;
public class Ud3_2_6 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una cadena de texto:");
        String cadena = teclado.nextLine();
        System.out.println("La cadena " + cadena + palindromo(cadena));
    }

    private static String palindromo(String cadena) {
        String mensaje = "";
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida = invertida + cadena.charAt(i);
        }
        if (cadena.equals(invertida)) {
            mensaje = " es un palindromo.";
        } else {
            mensaje = " no es un palindromo.";
        }
        return mensaje;
    }
}
