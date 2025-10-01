/*
 * Programa que pida por teclado:
 * • Un valor inicial (inicial).
 * • Un factor de incremento (incremento).
 * Los dos valores deben ser mayores que cero y de tipo entero. Si son menores o
 * iguales que cero se pedirán de nuevo.
 * Se desea:
 * Visualizar una serie de 5 números, comenzando en inicial e incrementando según el
 * factor de incremento.
 * Visualizar el resultado de sumar los 5 números.
 */
package ud2_practica3_6;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Practica3_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor inicial (entero mayor que 0): ");
        int valorInicial = teclado.nextInt();
        while (valorInicial <= 0) {
            System.out.print("ERROR. Introduzca el valor inicial (entero mayor que 0): ");
            valorInicial = teclado.nextInt();
        }

        System.out.print("Introduzca el incremento: ");
        int incremento = teclado.nextInt();
        while (incremento <= 0) {
            System.out.print("ERROR. Introduzca el incremento (entero mayor que 0): ");
            incremento = teclado.nextInt();
        }

        // Vamos visualizando los números de la serie y calculando su suma
        System.out.println("Serie:");
        int valor = valorInicial;
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            suma = suma + valor;
            valor = valor + incremento;
        }

        // Finalmente mostramos la suma
        System.out.println("Suma: " + suma);
    }

}
