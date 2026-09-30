/*
 * 
 * ENUNCIADO COMPLETO: Abadías pirenaicas (Problema 171)
 * http://www.aceptaelreto.com/problem/statement.php?id=171
 *
 * Los monjes se levantan temprano para observar la salida del sol.
 * Solo pueden construir abadías en cimas que sean MÁS ALTAS que
 * TODAS las montañas que tengan al Este (si hay montañas más altas
 * al Este, el sol no se vería al amanecer).
 *
 * ENTRADA:
 *   - Múltiples casos de prueba.
 *   - Cada caso empieza con N (número de montañas).
 *   - Luego N alturas en metros, de Oeste a Este.
 *   - Termina con una línea con 0 (no procesar).
 *
 * SALIDA:
 *   - Por cada caso: número máximo de abadías que se pueden construir.
 *
 * EJEMPLO:
 *   Entrada:                        Salida:
 *   5 3000 3500 3200 3400 3200  ?     3
 *   4 4000 3500 3500 3200        ?     3
 *   0
 *
 *   Verificación con el ejemplo 1: [3000, 3500, 3200, 3400, 3200]
 *     - 3200 (pos 4, más al Este): no tiene nada al Este ? abadía ?  maxEste=3200
 *     - 3400 (pos 3): 3400 > 3200 ? abadía ?  maxEste=3400
 *     - 3200 (pos 2): 3200 < 3400 ? NO
 *     - 3500 (pos 1): 3500 > 3400 ? abadía ?  maxEste=3500
 *     - 3000 (pos 0): 3000 < 3500 ? NO
 *     Total: 3 abadías ?
 *
 * ESTRATEGIA DE SOLUCIÓN:
 *   Recorremos el array de DERECHA a IZQUIERDA (de Este a Oeste),
 *   llevando el control del máximo visto hasta ahora (maxEste).
 *   Si la montaña actual supera ese máximo ? puede tener abadía.
 *   Complejidad: O(n) por caso. Óptimo para 100.000 montañas.
 */
package abadiaspirenaicas;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class AbadiasPirenaicas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Leemos casos de prueba hasta encontrar N = 0
        while (teclado.hasNextInt()) {
            int n = teclado.nextInt();

            // Condición de parada: cordillera sin montañas
            if (n == 0) {
                break;
            }

            // Leemos las alturas de las N montañas (de Oeste a Este)
            int[] alturas = new int[n];
            for (int i = 0; i < n; i++) {
                alturas[i] = teclado.nextInt();
            }

            // Recorremos de ESTE a OESTE (índice n-1 hasta 0)
            // maxEste: altura máxima de todas las montañas ya vistas al Este
            int maxEste = 0;
            int abadias = 0;

            for (int i = n - 1; i >= 0; i--) {
                // Puede tener abadía si es ESTRICTAMENTE más alta que todas las del Este
                if (alturas[i] > maxEste) {
                    abadias++;
                    maxEste = alturas[i]; // Actualizamos el máximo hacia el Oeste
                }
            }

            System.out.println(abadias);
        }
    }
}
