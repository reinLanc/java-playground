package ud5_7_1;

import java.util.Scanner;

public class Ud5_7_1 {

    public static void main(String[] args) {
        double A, B, C; // Coeficientes de la ecuación.
        double solucion; // Almacena el resultado de la ecuación.
        boolean otra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para calcular la solución a una ecuación");
        System.out.println("del tipo A*X*X + B*X + C = 0, donde A, B, y");
        System.out.println("C son valores introducidos por teclado.");
        do {
            /* El usuario introduce los coeficientes. */
            System.out.println();
            System.out.println("Introduzca valores para A, B, y C:");
            System.out.print("A = ");
            A = teclado.nextDouble();
            System.out.print("B = ");
            B = teclado.nextDouble();
            System.out.print("C = ");
            C = teclado.nextDouble();
            System.out.println();
            /* mostrar la solución o error. */
            try {
                solucion = root(A, B, C);
                System.out.println("Solución " + solucion);
            } catch (IllegalArgumentException e) {
                System.out.println("La ecuación no tiene solución.");
                System.out.println(e.getMessage());
            }
            /* Find out whether the user wants to go again. */
            System.out.println();
            System.out.print("Resolver otra ecuación? ");
            otra = teclado.nextBoolean();
        } while (otra);
    }

    static double root(double A, double B, double C)
            throws IllegalArgumentException {
// Devuelve la mayor de las dos raices de
// la ecuación de segundo grado A*x*x + B*x + C = 0.
// (Lanza una execpción si A == 0 ó B*B-4*A*C < 0.)
        if (A == 0) {
            throw new IllegalArgumentException("A no puede ser cero.");
        } else {
            double disc = B * B - 4 * A * C;
            if (disc < 0) {
                throw new IllegalArgumentException("Discriminante < cero.");
            }
            return (-B + Math.sqrt(disc)) / (2 * A);
        }
    }
}
