/*
Calcular la posicion de un numero n introducido por teclado en la serie de Fibonacci
 */
package exame6fibonacci;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class Exame6Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la posición que deseas buscar en la serie de Fibonacci:");
        int posicion = teclado.nextInt();
        
        if (posicion <= 0) {
            System.out.println("La posición debe ser mayor que 0");
        } else {
            int num1 = 0;
            int num2 = 1;
            int resultado = 0;
            
            for (int i = 1; i <= posicion; i++) {
                if (i == posicion) {
                    resultado = num1;
                    break;
                }
                
                int suma = num1 + num2;
                num1 = num2;
                num2 = suma;
            }
            
            System.out.println("El número en la posición " + posicion + " es: " + resultado);
        }
    }
}
