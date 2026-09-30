/**
 * EJERCICIO 4 — Conversor de divisas con matriz de tasas de cambio
 * =================================================================
 * Un banco maneja N divisas (por ejemplo: EUR, USD, GBP, JPY...).
 * Las tasas de cambio entre ellas se almacenan en una matriz N×N
 * donde tasas[i][j] indica cuántas unidades de la divisa J se obtienen
 * por cada unidad de la divisa I.
 *
 * La diagonal siempre vale 1.0 (cambiar una moneda a sí misma).
 *
 * El programa debe:
 *   1. Leer la matriz de tasas de cambio.
 *   2. Leer una cantidad y la divisa de origen.
 *   3. Mostrar cuánto equivale esa cantidad en TODAS las demás divisas.
 *   4. Indicar cuál es la divisa que da más dinero en esa conversión.
 *
 * Ejemplo con N=3, divisas: EUR(0) USD(1) GBP(2)
 *
 * Matriz de tasas:
 *         EUR    USD    GBP
 *   EUR [  1.00   1.08   0.86 ]
 *   USD [  0.93   1.00   0.79 ]
 *   GBP [  1.16   1.26   1.00 ]
 *
 * Si tenemos 100 EUR:
 *   -> EUR: 100 * 1.00 = 100.00
 *   -> USD: 100 * 1.08 = 108.00   <-- la que más da
 *   -> GBP: 100 * 0.86 = 86.00
 */
package ejerciciodivisas;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioDivisas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Leemos el número de divisas
        System.out.print("Numero de divisas: ");
        int n = teclado.nextInt();

        // Leemos los nombres de las divisas (ej: EUR, USD, GBP...)
        String[] divisas = new String[n];
        System.out.println("Introduce los nombres de las " + n + " divisas:");
        for (int i = 0; i < n; i++) {
            divisas[i] = teclado.next();
        }

        // Leemos la matriz de tasas de cambio N×N
        // tasas[i][j] = cuántas unidades de la divisa j da 1 unidad de la divisa i
        double[][] tasas = new double[n][n];

        System.out.println("Introduce la matriz de tasas de cambio (" + n + "x" + n + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tasas[i][j] = teclado.nextDouble();
            }
        }

        // Leemos la cantidad y la divisa de origen (por índice: 0, 1, 2...)
        System.out.print("Cantidad a convertir: ");
        double cantidad = teclado.nextDouble();

        System.out.print("Indice de la divisa de origen (0=" + divisas[0] + "): ");
        int origen = teclado.nextInt();

        // Calculamos la conversión a cada divisa y buscamos la que más dinero da
        System.out.println("Resultado de convertir " + cantidad + " " + divisas[origen] + ":");
        System.out.println("------------------------------------------");

        double maxCantidad = -1;          // la mayor cantidad obtenida
        int indiceMejor = -1;          // índice de la divisa que más da

        for (int j = 0; j < n; j++) {
            // Aplicamos la tasa: cantidad * tasas[origen][j]
            double resultado = cantidad * tasas[origen][j];

            System.out.println(divisas[j] + ": " + resultado);

            // Actualizamos el máximo (ignoramos la propia divisa de origen)
            if (j != origen && resultado > maxCantidad) {
                maxCantidad = resultado;
                indiceMejor = j;
            }
        }

        System.out.println("------------------------------------------");
        System.out.println("La divisa mas favorable es: " + divisas[indiceMejor]
                + " con " + maxCantidad + " " + divisas[indiceMejor]);

        teclado.close();

    }

}
