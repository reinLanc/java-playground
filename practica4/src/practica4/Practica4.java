/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = {1, 5, 9, 3, 45, 23, 45, 12, 87, 9, 6, 5};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero a eliminar:");
        int num = teclado.nextInt();
        System.out.println("Elemento a borrar: " + num);
        System.out.println("Array Inicial:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        int ocurrencias = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                ocurrencias++;
                for (int j = i; j < numeros.length - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
            }
        }
        int numerosFinal[];
        int le = numeros.length - ocurrencias;
        numerosFinal = new int[le];
        for (int i = 0; i < le; i++) {
            numerosFinal[i] = numeros[i];
        }
        System.out.println("Array Final");
        for (int i = 0; i < numerosFinal.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

}
