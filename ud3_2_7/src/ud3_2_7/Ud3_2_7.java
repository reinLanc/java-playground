package ud3_2_7;

import java.util.Scanner;

public class Ud3_2_7 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca una frase:");
        String frase = teclado.nextLine();
        int contador = 0;
        if(frase.isEmpty()) {
            System.out.println("No hay palabras.");
        }
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
         if(frase.isEmpty()) {
             System.out.println("Cadena vacía. No hay palabras.");
        } else {
            System.out.println("La frase \"" + frase + "\" contiene "
                    + (contador + 1) + " palabra(s).");

        }
    }
}
