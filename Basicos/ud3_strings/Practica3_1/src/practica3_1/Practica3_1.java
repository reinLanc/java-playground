package practica3_1;

import java.util.Scanner;

public class Practica3_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String nif;
        int dni, index,i;
        char letra;
        boolean error = false;

        System.out.println("Introduce NIF: ");
        nif = teclado.nextLine();

        if (nif.length() != 9) {
            error = true;
            System.out.println("Longitud incorrecta");
        }

        if (!error && !Character.isLetter(nif.charAt(8))) {
            error = true;
            System.out.println("Posicion 9 no es letra");
        }

        if (!error) {
            for(i=0;i<8;i++)
                if(!Character.isDigit(nif.charAt(i)))
                {    
                    error=true;
                    System.out.println("Posicion "+(i+1)+" no es un digito");
                }    
        }

        if (!error) {
            dni = Integer.parseInt(nif.substring(0, 8));
            letra = nif.charAt(8);
            index = dni % 23;
            if (letras.charAt(index) == letra) {
                System.out.println("NIF correcto");
            } else {
                System.out.println("NIF incorrecto");
            }
        }
    }

}
