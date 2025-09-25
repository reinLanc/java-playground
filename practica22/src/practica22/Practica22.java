/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practica22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos como constante por lo que dividir
        final int DIVISOR = 23;

        //Insertamos el DNI
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los numeros de tu DNI");
        int dni = teclado.nextInt();

        //Sacamos el resto
        int res = dni % DIVISOR;

        //Invocamos el metodo
        char letra = letraNIF(res);

        //Mostramos el DNI completo
        System.out.println("Tu DNI es " + dni + letra);

    }

    public static char letraNIF(int res) {

        //Definimos el array de char
        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        //Devolvemos el valor en la posicion del array
        return letrasNIF[res];
    }

}
