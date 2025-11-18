/*
Escribe un programa en Java que calcule el cuadrado del número
que se introduce por teclado como dato usando solamente sumas.
 */
package examecadradosuma;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class ExameCadradoSuma {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero a calcular:");
        int numero = teclado.nextInt();
        int resultado = 0;

        // Sumar el número consigo mismo tantas veces como indique su valor
        // Por ejemplo: 5² = 5 + 5 + 5 + 5 + 5 = 25
        for (int i = 1; i <= numero; i++) {
            resultado += numero;
        }

        System.out.println("El cuadrado de " + numero + " es: " + resultado);
        }
    }

