package exame3;
import java.util.Scanner;
/**
 Verificar si un numero itntroducido por teclado es potencia de 2.
 * @author Reinaldo Gil
 */
public class Exame3 {
    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("Debe ser un número positivo.");
        } else {
            boolean esPotencia = true;
            int n = numero;
            while (n > 1) {
                if (n % 2 != 0) {
                    esPotencia = false;
                    break;
                }
                n = n / 2;
            }
            if (esPotencia)
                System.out.println(numero + " es potencia de dos.");
            else
                System.out.println(numero + " no es potencia de dos.");
        }
    }
}
