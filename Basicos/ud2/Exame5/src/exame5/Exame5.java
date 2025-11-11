/*
Calcular factorial de un numero
 */
package exame5;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class Exame5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = sn.nextInt();

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
