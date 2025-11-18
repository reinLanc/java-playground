package exame2;
import java.util.Scanner;
/**
 Estructura de asteriscos numero de lineas n (introducido por teclado)
 * @author Reinaldo Gil
 */
public class Exame2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de líneas: ");
        int lineas = teclado.nextInt();

        // Si el número es par, se le suma 1 para mantener la forma simétrica
        if (lineas % 2 == 0) {
            lineas++;
        }

        int mitad = (lineas / 2) + 1;

        // Parte superior (crece)
        for (int i = 1; i <= mitad; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior (disminuye)
        for (int i = mitad - 1; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
