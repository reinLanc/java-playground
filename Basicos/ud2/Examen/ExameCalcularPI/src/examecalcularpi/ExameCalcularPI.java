/*
Programa para calcular PI en la serie de Leibniz. El programa debera preguntar cuantos terminos
de la serie vamos a usar.
 */
package examecalcularpi;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class ExameCalcularPI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos términos quieres usar? ");
        int terminos = teclado.nextInt();

        double pi = 0.0;
        double signo = 1.0;

        int denominador = 1;

        for (int i = 0; i < terminos; i++) {
            pi += signo * (1.0 / denominador);
            signo *= -1;            // alterna + y -
            denominador += 2;       // números impares
        }

        pi *= 4;

        System.out.println("Aproximación de PI = " + pi);
    }
}
