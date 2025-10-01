/*
 * Programa que calcula las potencias desde 1 hasta 5 de un número entero 
 * introducido por teclado
 */
package ud2_practica2_2;
import java.util.*;

public class UD2_Practica2_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador=1;
        
        // Pedimos al usuario que teclee un número entero
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
        
        // Calculamos y mostramos las potencias desde 1 hasta 5 del número
        System.out.println("Potencias desde 1 hasta 5 de " + numero + ":");
        for (int i = 1; i <= 5; i++) {
            acumulador=acumulador*numero;
            System.out.println(numero + " elevado a " + i + " = "
                               + acumulador);
        }
    }
    
}
