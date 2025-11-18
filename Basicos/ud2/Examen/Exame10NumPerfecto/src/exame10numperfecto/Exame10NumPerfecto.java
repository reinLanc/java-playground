/*
Comprobar si un número n introducido por teclado es un número perfecto o no.
Un número es perfecto si la suma de sus divisores propios (sin incluirse a sí mismo) es igual al número.
 */
package exame10numperfecto;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class Exame10NumPerfecto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = teclado.nextInt();

        int suma = 0;

        for (int i = 1; i < n; i++) {  // solo divisores propios
            if (n % i == 0) {          // si es divisor
                suma += i;
            }
        }

        if (suma == n) {
            System.out.println(n + " es un número perfecto.");
        } else {
            System.out.println(n + " NO es un número perfecto.");
        }
    }
}
