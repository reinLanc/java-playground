/*
 * Programa que pide un número de tipo int por teclado y comprueba si es 
 * distinto de 0. Si es distinto de 0 debe comprobarse si es par o impar.
 */
package ud2_practica1_4;

import java.util.*;

public class UD2_Practica1_4 {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Scanner para leer datos por teclado 
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario que teclee una entero, lo leemos y lo almacenamos
        // en una variable de tipo int
        System.out.print("Introduce un entero: ");
        int entero = teclado.nextInt();
        
        // Comprobamos si es distinto de cero y si lo es, miramos si es par o
        // impar.
        // SOLUCION 1:
        if (entero != 0){
            if (entero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        } else {
            System.out.println("El número introducido es cero.");
        }
        
        // SOLUCION 2:
//        if (entero == 0){
//            System.out.println("El número introducido es cero.");
//        } else if (entero % 2 == 0) {
//                System.out.println("El número es par.");
//        } else {
//                System.out.println("El número es impar.");
//        }
    }
    
}