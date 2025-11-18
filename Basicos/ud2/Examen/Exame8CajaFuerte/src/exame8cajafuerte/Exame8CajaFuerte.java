/*
Caja fuerte con una determinada combinación. y 3 intentos si no se accede la combinacion se bloquea para 
siempre luego de 3 intentos si se tiene la combinacion dira acceso concedido.
 */
package exame8cajafuerte;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class Exame8CajaFuerte {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int COMBINACION = 1234;  // combinación secreta
        final int MAX_INTENTOS = 3;
        int intentos = MAX_INTENTOS;
        boolean accesoConcedido = false;

        System.out.println("=== CAJA FUERTE ===");
        System.out.println("Tienes " + MAX_INTENTOS + " intentos para introducir la combinación correcta.");

        while (intentos > 0) {

            int intento;

            //validar combinación de 4 digitos
            while (true) {
                System.out.print("Introduce la combinación de 4 dígitos: ");
                intento = teclado.nextInt();

                if (intento >= 1000 && intento <= 9999) {
                    break;  // es válido 
                } else {
                    System.out.println("Debes introducir un número de EXACTAMENTE 4 dígitos.");
                }
            }
            if (intento == COMBINACION) {
                accesoConcedido = true;
                break;  // combinación correcta 
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Combinación incorrecta. Te quedan " + intentos + " intento(s).");
                }
            }
        }

        if (accesoConcedido) {
            System.out.println("\nAcceso concedido. ¡Caja fuerte abierta!");
        } else {
            System.out.println("\nCaja bloqueada permanentemente. Se han agotado los intentos.");
        }
    }
}
