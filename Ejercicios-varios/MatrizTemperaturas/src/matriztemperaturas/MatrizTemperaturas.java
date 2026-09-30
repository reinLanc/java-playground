/**
 * EJERCICIO 12 — Analisis de mapa de temperaturas (Heatmap)
 *
 * Una red de sensores meteorologicos cubre una zona geografica dividida
 * en una cuadricula de F filas x C columnas. Cada celda almacena la
 * temperatura media en grados Celsius registrada ese dia.
 *
 * El programa realiza un analisis completo:
 *
 *   PARTE 1 — Estadisticas basicas:
 *     Temperatura maxima y minima global y su localizacion (fila, columna).
 *     Media global de toda la zona.
 *
 *   PARTE 2 — Deteccion de zonas anomalas:
 *     Una celda es ANOMALA si su temperatura se aleja mas de un umbral
 *     dado respecto a la media global. Las anomalas se guardan en un
 *     ArrayList de coordenadas para mostrarlas al final.
 *
 *   PARTE 3 — Gradiente de temperatura por filas:
 *     Para cada fila calculamos el "gradiente": diferencia entre el sensor
 *     mas caliente y el mas frio de esa fila. Indica la variabilidad
 *     dentro de cada franja horizontal.
 *
 *   PARTE 4 — Clasificacion climatica con HashMap:
 *     Clasificamos cada celda en una zona climatica segun su temperatura:
 * < 0        -> "Polar" 0 a 9 -> "Frio" 10 a 19 -> "Templado" 20 a 29 -> "Calido" >=
 * 30 -> "Tropical" Usamos un HashMap para contar cuantas celdas hay en cada
 * zona.
 *
 * PARTE 5 — Mapa visual: Imprimimos la cuadricula usando simbolos segun la
 * temperatura: * = Polar/Frio | ~ = Templado | + = Calido | # = Tropical
 */
package matriztemperaturas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizTemperaturas {

    /**
     * Devuelve la categoria climatica de una temperatura. Metodo auxiliar
     * reutilizado en varias partes del programa.
     */
    static String categoriaClimatica(int temp) {
        if (temp < 0) {
            return "Polar";
        }
        if (temp < 10) {
            return "Frio";
        }
        if (temp < 20) {
            return "Templado";
        }
        if (temp < 30) {
            return "Calido";
        }
        return "Tropical";
    }

    /**
     * Devuelve el simbolo visual asociado a una categoria climatica.
     */
    static char simbolo(int temp) {
        if (temp < 0) {
            return '*';
        }
        if (temp < 10) {
            return '~';
        }
        if (temp < 20) {
            return '-';
        }
        if (temp < 30) {
            return '+';
        }
        return '#';
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Leemos las dimensiones de la cuadricula
        System.out.print("Filas de la cuadricula: ");
        int filas = teclado.nextInt();

        System.out.print("Columnas de la cuadricula: ");
        int cols = teclado.nextInt();

        System.out.print("Umbral de anomalia (grados sobre/bajo la media): ");
        int umbralAnomalia = teclado.nextInt();

        // Rellenamos la matriz de temperaturas
        int[][] temp = new int[filas][cols];
        System.out.println("Introduce las temperaturas fila a fila:");
        for (int i = 0; i < filas; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < cols; j++) {
                temp[i][j] = teclado.nextInt();
            }
        }

        // ---------------------------------------------------------------
        // PARTE 1: maxima, minima y media global
        // Inicializamos max y min con el primer elemento, no con 0,
        // porque las temperaturas pueden ser negativas.
        // ---------------------------------------------------------------
        int maxTemp = temp[0][0];
        int minTemp = temp[0][0];
        int filaMax = 0, colMax = 0;
        int filaMin = 0, colMin = 0;
        long sumaTotal = 0; // usamos long por si hay muchos sensores

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                sumaTotal += temp[i][j];

                if (temp[i][j] > maxTemp) {
                    maxTemp = temp[i][j];
                    filaMax = i;
                    colMax = j;
                }
                if (temp[i][j] < minTemp) {
                    minTemp = temp[i][j];
                    filaMin = i;
                    colMin = j;
                }
            }
        }

        int totalCeldas = filas * cols;
        double mediaGlobal = (double) sumaTotal / totalCeldas;

        System.out.println("\n--- PARTE 1: Estadisticas globales ---");
        System.out.println("Temperatura maxima: " + maxTemp + " C en (" + filaMax + "," + colMax + ")");
        System.out.println("Temperatura minima: " + minTemp + " C en (" + filaMin + "," + colMin + ")");
        System.out.println("Media global:       " + mediaGlobal + " C");

        // ---------------------------------------------------------------
        // PARTE 2: deteccion de anomalias
        // Guardamos cada celda anomala como String "fila,col=valor"
        // en un ArrayList para poder recorrerlo despues.
        // ---------------------------------------------------------------
        ArrayList<String> anomalias = new ArrayList<String>();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                double diferencia = Math.abs(temp[i][j] - mediaGlobal);
                if (diferencia > umbralAnomalia) {
                    anomalias.add("(" + i + "," + j + ")=" + temp[i][j] + "C");
                }
            }
        }

        System.out.println("\n--- PARTE 2: Zonas anomalas (alejadas mas de "
                + umbralAnomalia + " grados de la media) ---");
        if (anomalias.isEmpty()) {
            System.out.println("No se detectaron zonas anomalas.");
        } else {
            System.out.println("Se encontraron " + anomalias.size() + " zonas anomalas:");
            for (String anomalia : anomalias) {
                System.out.println("  Sensor " + anomalia);
            }
        }

        // ---------------------------------------------------------------
        // PARTE 3: gradiente de temperatura por filas
        // Para cada fila, gradiente = max de la fila - min de la fila
        // Una fila con gradiente alto tiene mucha variabilidad interna.
        // ---------------------------------------------------------------
        System.out.println("\n--- PARTE 3: Gradiente de temperatura por fila ---");
        int filaMaxGradiente = 0;
        int valorMaxGradiente = 0;

        for (int i = 0; i < filas; i++) {
            // Inicializamos max y min de la fila con su primer elemento
            int maxFila = temp[i][0];
            int minFila = temp[i][0];

            for (int j = 1; j < cols; j++) {
                if (temp[i][j] > maxFila) {
                    maxFila = temp[i][j];
                }
                if (temp[i][j] < minFila) {
                    minFila = temp[i][j];
                }
            }

            int gradiente = maxFila - minFila;
            System.out.println("Fila " + i + ": max=" + maxFila + " min=" + minFila
                    + " gradiente=" + gradiente + " grados");

            if (gradiente > valorMaxGradiente) {
                valorMaxGradiente = gradiente;
                filaMaxGradiente = i;
            }
        }
        System.out.println("Fila con mayor variabilidad: fila " + filaMaxGradiente
                + " (gradiente de " + valorMaxGradiente + " grados)");

        // ---------------------------------------------------------------
        // PARTE 4: clasificacion climatica con HashMap
        // Contamos cuantas celdas hay en cada zona climatica.
        // Usamos getOrDefault para no preocuparnos de si la clave existe.
        // ---------------------------------------------------------------
        HashMap<String, Integer> zonas = new HashMap<String, Integer>();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                String zona = categoriaClimatica(temp[i][j]);
                zonas.put(zona, zonas.getOrDefault(zona, 0) + 1);
            }
        }

        System.out.println("\n--- PARTE 4: Clasificacion climatica ---");
        String[] orden = {"Polar", "Frio", "Templado", "Calido", "Tropical"};
        for (String zona : orden) {
            int cantidad = zonas.getOrDefault(zona, 0);
            int porcentaje = (cantidad * 100) / totalCeldas;
            System.out.println(zona + ": " + cantidad + " celdas (" + porcentaje + "%)");
        }

        // ---------------------------------------------------------------
        // PARTE 5: mapa visual con simbolos
        // ---------------------------------------------------------------
        System.out.println("\n--- PARTE 5: Mapa visual de temperaturas ---");
        System.out.println("Leyenda:  * Polar/Frio  ~ Frio  - Templado  + Calido  # Tropical");
        System.out.println();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(simbolo(temp[i][j]) + " ");
            }
            System.out.println();
        }

        teclado.close();
    }

}
