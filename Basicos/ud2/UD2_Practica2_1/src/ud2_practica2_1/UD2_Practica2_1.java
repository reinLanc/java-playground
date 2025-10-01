/*
 * Programa que genera una tabla formada por los cuadrados y los cubos de los
 * números desde 1 hasta N, donde N es un número entero positivo que se 
 * introduce por teclado.
 */
package ud2_practica2_1;
import java.util.*;

public class UD2_Practica2_1 {

    public static void main(String[] args) {
        int n,i;
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario que teclee un número entero positivo
        System.out.print("Introduce un número entero positivo: ");
        n = teclado.nextInt();
        
        // En un bucle generamos los cuadrados y los cubos
        for (i = 1; i <= n; i++) {
            System.out.print(i+"\t");
            System.out.print(i*i+"\t");
            System.out.print(i*i*i+"\n");
        }
    }
    
}
