/**
 * EJERCICIO 5 — Gestión de butacas de un cine
 * 
 * La sala de un cine se representa como una matriz de F filas × C columnas,
 * donde cada celda puede ser:
 *   0 -> asiento LIBRE
 *   1 -> asiento OCUPADO
 *
 * El programa debe:
 *   1. Leer el estado actual de la sala.
 *   2. Mostrar cuántos asientos libres y ocupados hay en total.
 *   3. Mostrar el porcentaje de ocupación de CADA FILA.
 *   4. Encontrar y mostrar la fila con más asientos libres consecutivos
 *      (útil para sentar a un grupo junto).
 *
 * Ejemplo con 3 filas y 5 columnas:
 *   1 1 0 0 0   <- fila 0: 3 libres, máx consecutivos libres = 3
 *   0 1 1 1 0   <- fila 1: 2 libres, máx consecutivos libres = 1
 *   0 0 0 1 1   <- fila 2: 3 libres, máx consecutivos libres = 3
 *
 * Libres totales: 8 | Ocupados totales: 7
 * Fila con más asientos libres consecutivos: fila 0 (o fila 2), con 3
 */
package ejercicio5cine;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio5Cine {

    /**
     * Calcula cuántos asientos libres consecutivos hay como máximo en una fila.
     * Recorre la fila contando rachas de ceros y se queda con la racha más
     * larga.
     *
     * Ejemplo: 1 0 0 1 0 -> racha 1: 2 ceros | racha 2: 1 cero -> devuelve 2
     */
    static int maxConsecutivosLibres(int[] fila) {
        int maxRacha = 0; // la racha más larga encontrada hasta ahora
        int rachaActual = 0; // la racha que estamos contando en este momento

        for (int j = 0; j < fila.length; j++) {
            if (fila[j] == 0) {
                // Asiento libre: aumentamos la racha actual
                rachaActual++;
                // Actualizamos el máximo si esta racha supera la anterior
                if (rachaActual > maxRacha) {
                    maxRacha = rachaActual;
                }
            } else {
                // Asiento ocupado: la racha se rompe, reiniciamos el contador
                rachaActual = 0;
            }
        }
        return maxRacha;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Leemos las dimensiones de la sala
        System.out.print("Numero de filas de la sala: ");
        int filas = teclado.nextInt();

        System.out.print("Numero de columnas (asientos por fila): ");
        int columnas = teclado.nextInt();

        // Rellenamos la matriz: 0 = libre, 1 = ocupado
        int[][] sala = new int[filas][columnas];

        //sala[i][j]=(int)(Math.random)*1;
        System.out.println("Introduce el estado de la sala (0=libre, 1=ocupado):");
        for (int i = 0; i < filas; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = teclado.nextInt();
            }
        }
        
        // PARTE 1: contar totales de libres y ocupados

        int totalLibres = 0;
        int totalOcupados = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (sala[i][j] == 0) {
                    totalLibres++;
                } else {
                    totalOcupados++;
                }
            }
        }

        System.out.println("Asientos libres:   " + totalLibres);
        System.out.println("Asientos ocupados: " + totalOcupados);

        // PARTE 2: porcentaje de ocupación por fila
        // Ocupación = (ocupados en la fila / columnas) * 100
        // Usamos división entera para no necesitar formato decimal

        System.out.println("Ocupacion por fila:");
        for (int i = 0; i < filas; i++) {
            int ocupadosFila = 0;
            for (int j = 0; j < columnas; j++) {
                if (sala[i][j] == 1) {
                    ocupadosFila++;
                }
            }
            // Multiplicamos por 100 antes de dividir para no perder decimales con enteros
            int porcentaje = (ocupadosFila * 100) / columnas;
            System.out.println("  Fila " + i + ": " + porcentaje + "% ocupada");
        }

        // PARTE 3: fila con más asientos libres consecutivos
        // Llamamos al método auxiliar para cada fila y nos quedamos con el máximo

        int mejorFila = 0;
        int mejorConsecutivos = maxConsecutivosLibres(sala[0]);

        for (int i = 1; i < filas; i++) {
            int consecutivos = maxConsecutivosLibres(sala[i]);
            if (consecutivos > mejorConsecutivos) {
                mejorConsecutivos = consecutivos;
                mejorFila = i;
            }
        }

        System.out.println("Mejor fila para sentarse juntos: fila " + (mejorFila+1)
                + " con " + mejorConsecutivos + " asientos libres consecutivos");

    }

}
