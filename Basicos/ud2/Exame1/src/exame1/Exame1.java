package exame1;
import java.util.Scanner;

/**
 Calcular si un numero es positivo negativo o cero.
 * @author Reinaldo Gil
 */
public class Exame1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }

}
