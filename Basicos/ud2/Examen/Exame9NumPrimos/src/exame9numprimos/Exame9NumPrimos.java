/*
Calcular si un numero n ( introducido por teclado ) es un numero primo o no lo es.
Un número primo es un número natural mayor que 1 que tiene solo dos divisores positivos distintos
: él mismo y el número 1. 
Por lo tanto, solo puede ser dividido exactamente por 1 y por sí mismo, sin dejar residuo.
 */
package exame9numprimos;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class Exame9NumPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = teclado.nextInt();

        boolean esPrimo = true;

        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {   // si tiene otro divisor, no es primo
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " NO es primo.");
        }
    }
}
