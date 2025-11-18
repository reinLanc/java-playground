/*
Calcular factorial de un numero
El factorial de un número entero positivo,  es el resultado de multiplicar ese número por todos los números 
enteros positivos que le preceden, hasta llegar al 1. Por ejemplo, el factorial de 5 es
5 * 4 * 3 * 2 *1 lo que da como resultado 120. 
 */
package exame5;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class Exame5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = teclado.nextInt();

        int factorial = 1;

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es " + factorial);
        }
    }
}
