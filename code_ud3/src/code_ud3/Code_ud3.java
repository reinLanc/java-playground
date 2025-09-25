/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_ud3;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Code_ud3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int sumapares = 0;
        int sumaimpares = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número (0 para terminar): ");
        num = entrada.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                sumapares = sumapares + num;
            } else {
                sumaimpares = sumaimpares + num;
            }
            System.out.println("Introduce un número (0 para terminar): ");
            num = entrada.nextInt();
        }
        System.out.println("La suma de los numeros pares es " + sumapares);
        System.out.println("La suma de los numeros impares es " + sumaimpares);
    }
}
