/*
 * Programa que pide una nota (tipo byte) por teclado y:
 *  - Si la nota es menor que 0 o mayor que 10 visualiza un mensaje de error.
 *  - Si la nota es correcta la visualiza.
 */
package ud2_practica1_2;

import java.util.*;

public class UD2_Practica1_2 {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Scanner para leer datos por teclado 
        Scanner teclado = new Scanner(System.in);
        byte nota;
        
        // Pedimos al usuario que teclee una nota, la leemos y la almacenamos
        // en una variable de tipo byte (a la que llamamos "nota")
        System.out.print("Introduce una nota (entero entre 0 y 10): ");
        nota = teclado.nextByte();
        
        // Si la nota es menor que 0 o mayor que 10 visualizamos un error
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe ser un entero entre 0 y 10.");
        } else { // Si la nota es correcta, la mostramos
            System.out.println("La nota que ha introducido es: " + nota);
        }
    }
    
}
