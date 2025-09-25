/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_3_5;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor inicial (entero mayor que 0): ");
        int valorInicial = teclado.nextInt();
        while (valorInicial <= 0) {
            System.out.print("ERROR. Introduzca el valor inicial (entero mayor que 0): ");
            valorInicial = teclado.nextInt();
        }

        System.out.print("Introduzca el incremento: ");
        int incremento = teclado.nextInt();
        while (incremento <= 0) {
            System.out.print("ERROR. Introduzca el incremento (entero mayor que 0): ");
            incremento = teclado.nextInt();
        }

        // Vamos visualizando los números de la serie y calculando su suma
        System.out.println("Serie:");
        int valor = valorInicial;
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            suma = suma + valor;
            valor = valor + incremento;
        }

        // Finalmente mostramos la suma
        System.out.println("Suma: " + suma);
    }
}
