/*
Piramide a la derecha de numeros introducida por teclado.
 */
package exame7numeros;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class Exame7Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de líneas: ");
        int lineas = teclado.nextInt();

        // Parte superior (crece)
        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Parte inferior (disminuye)
        for (int i = lineas - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
