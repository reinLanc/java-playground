/*
 * Programa que visualiza por pantalla todos los divisores de un número entero 
 * introducido por teclado.
 */
package ud2_practica2_3;
import java.util.*;

public class UD2_Practica2_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario que teclee un número entero
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
        
        // Mostramos los divisores
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
    
}
