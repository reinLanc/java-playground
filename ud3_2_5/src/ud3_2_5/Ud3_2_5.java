
package ud3_2_5;

import java.util.Scanner;

public class Ud3_2_5 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduzca la cadena de texto nº1:");
        String cadena1 = teclado.nextLine();
        System.out.println("Introduzca la cadena de texto nº2:");
        String cadena2 = teclado.nextLine(); 
        System.out.println(compares(cadena1,cadena2));
    }
    public static String compares(String cadena1, String cadena2) {
      String mensaje = "";
      if(cadena1.equals(cadena2)) {
          mensaje = "Las 2 cadenas son iguales.";
      } else {
          mensaje = "Las cadenas son distintas.";
      }
      return mensaje;
    }
}
