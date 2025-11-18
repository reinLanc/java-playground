/*
Triangulo rectangulo de numeros impares
 */
package exametriangulorectangulo;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class ExameTrianguloRectangulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            int valor = 2 * i - 1;   // número impar inicial

            for (int j = valor; j >= 1; j -= 2) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
