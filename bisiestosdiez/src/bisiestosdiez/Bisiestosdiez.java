package bisiestosdiez;

import java.util.Scanner;

public class Bisiestosdiez {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = teclado.nextLine().trim();
        String palabras[] = frase.split(" ");
        int palabraLarga = 0;
        String palabra;
        String numero = "";
        for (int i = 0; i < palabras.length; i++) {
            numero = String.valueOf(palabras[i]);
            if(numero.length() > palabraLarga)
                palabraLarga = numero.length();
        }
        System.out.println("La palabra mas larga tiene " +  palabraLarga + " caracteres.");
    }
}
