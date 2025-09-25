package ficheroweb8;

import java.util.Scanner;

public class Ficheroweb8 {

    static boolean enteroValido(String cadena) {

        // Propiedades
        boolean r = true;

        // Analizo caracter a caracter la cadena. Si no son de 0 a 9 no será cifra entera válida
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) < '0' || cadena.charAt(i) > '9') {
                r = false;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = null;

        System.out.println("Introduzca un número entero:");
        do {
            linea = sc.nextLine();

            if (enteroValido(linea) == false) {
                System.out.println("Eso no es un entero ni de coña. Prueba otra vez");
            }
        } while (enteroValido(linea) == false);

        sc.close();
    }

}
