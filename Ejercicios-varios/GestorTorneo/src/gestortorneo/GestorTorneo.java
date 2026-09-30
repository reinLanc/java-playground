/*
 Se desea gestionar un torneo de programación con N jugadores y M rondas.

Datos de entrada:
  • Una matriz int[N][M] con las puntuaciones de cada jugador en cada ronda.
  • Un ArrayList<String> con los nombres de los jugadores.

Se pide implementar los siguientes métodos:

  1. calcularTotales()
     Devuelve un HashMap<String, Integer> con la puntuación total de cada jugador.

  2. rankingFinal()
     Devuelve un TreeMap ordenado de mayor a menor puntuación.
     En caso de empate, el orden alfabético decide.

  3. mejorRonda()
     Devuelve el índice de la ronda con la mayor puntuación media entre todos los jugadores.

  4. jugadoresEliminar(int umbral)
     Devuelve un ArrayList con los nombres de jugadores cuya puntuación total
     sea estrictamente menor que el umbral dado.

  5. imprimirTabla()
     Muestra por consola una tabla formateada con los datos del torneo.

Restricciones:
  • N ? 2, M ? 2. Las puntuaciones son enteros ? 0.
  • No se puede modificar la matriz original en ningún método.
 */
package gestortorneo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Reinaldo Gil
 */
public class GestorTorneo {

    // Matriz de puntuaciones [jugador][ronda]
    private final int[][] puntuaciones;

    // Lista de nombres de jugadores (índice coincide con fila de la matriz)
    private final ArrayList<String> jugadores;

    // Número de rondas = columnas de la matriz
    private final int numRondas;

    /**
     * Constructor: recibe la matriz y la lista de jugadores. Valida que las
     * dimensiones sean consistentes.
     */
    public GestorTorneo(int[][] puntuaciones, ArrayList<String> jugadores) {
        if (puntuaciones.length != jugadores.size()) {
            throw new IllegalArgumentException(
                    "La matriz y la lista de jugadores deben tener el mismo tamaño.");
        }

        // Copia defensiva: no modificamos la referencia original
        this.puntuaciones = copiarMatriz(puntuaciones);
        this.jugadores = new ArrayList<>(jugadores);
        this.numRondas = puntuaciones[0].length;
    }

    // Método auxiliar: copia profunda de la matriz
    private int[][] copiarMatriz(int[][] original) {
        int[][] copia = new int[original.length][original[0].length];
        for (int i = 0; i < original.length; i++) // System.arraycopy es más eficiente que un bucle manual
        {
            System.arraycopy(original[i], 0, copia[i], 0, original[i].length);
        }
        return copia;
    }

    // 1. calcularTotales()
    //    Recorre la matriz fila a fila y suma cada columna.
    //    O(N * M)
    public HashMap<String, Integer> calcularTotales() {
        HashMap<String, Integer> totales = new HashMap<>();

        for (int i = 0; i < jugadores.size(); i++) {
            int suma = 0;
            for (int j = 0; j < numRondas; j++) {
                suma += puntuaciones[i][j];
            }

            totales.put(jugadores.get(i), suma);
        }
        return totales;
    }

    // 2. rankingFinal()
    //    Ordena de mayor a menor puntuación.
    //    En empate, nombre en orden alfabético (comparador encadenado).
    //
    //    Usamos TreeMap con Comparator personalizado:
    //    la clave es el nombre, pero el orden depende del total.
    public TreeMap<String, Integer> rankingFinal() {
        HashMap<String, Integer> totales = calcularTotales();

        // Comparador: ordena por puntuación desc; si igual, por nombre asc
        Comparator<String> comp = (a, b) -> {
            int diff = totales.get(b) - totales.get(a); // mayor puntuación primero
            return (diff != 0) ? diff : a.compareTo(b);  // empate => alfabético
        };

        TreeMap<String, Integer> ranking = new TreeMap<>(comp);
        ranking.putAll(totales);
        return ranking;
    }

    // 3. mejorRonda()
    //    Suma cada columna (ronda) y calcula la media de esa ronda.
    //    Devuelve el índice 0-based de la ronda con mayor media.
    //    O(N * M)
    public int mejorRonda() {
        int mejorIdx = 0;
        double mejorMedia = -1;

        for (int j = 0; j < numRondas; j++) {
            int sumaRonda = 0;
            for (int i = 0; i < jugadores.size(); i++) {
                sumaRonda += puntuaciones[i][j];
            }

            double media = (double) sumaRonda / jugadores.size();

            if (media > mejorMedia) {
                mejorMedia = media;
                mejorIdx = j;
            }
        }
        return mejorIdx;
    }

    // 4. jugadoresEliminar(umbral)
    //    Reutiliza calcularTotales() para evitar duplicar la lógica.
    //    Recorre el HashMap y filtra por el umbral.
    public ArrayList<String> jugadoresEliminar(int umbral) {
        HashMap<String, Integer> totales = calcularTotales();
        ArrayList<String> eliminados = new ArrayList<>();

        for (Map.Entry<String, Integer> entrada : totales.entrySet()) {
            if (entrada.getValue() < umbral) {
                eliminados.add(entrada.getKey());
            }
        }

        // Ordenamos para que la salida sea determinista y más legible
        Collections.sort(eliminados);
        return eliminados;
    }

    // 5. imprimirTabla()
    //    Usa String.format para alinear columnas correctamente.
    //    Recorre la matriz directamente para mantener el orden original.
    public void imprimirTabla() {
        // Encabezado dinámico según número de rondas
        System.out.printf("%-15s", "Jugador");
        for (int j = 0; j < numRondas; j++) {
            System.out.printf("  R%-4d", j + 1);
        }
        System.out.printf("  %s%n", "TOTAL");
        System.out.println("-".repeat(15 + numRondas * 7 + 8));

        HashMap<String, Integer> totales = calcularTotales();

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.printf("%-15s", jugadores.get(i));
            for (int j = 0; j < numRondas; j++) {
                System.out.printf("  %-5d", puntuaciones[i][j]);
            }
            System.out.printf("  %d%n", totales.get(jugadores.get(i)));
        }
    }

    // MAIN: prueba con datos de ejemplo
    public static void main(String[] args) {

        // 4 jugadores × 3 rondas
        int[][] puntuaciones = {
            {80, 95, 70}, // Ana
            {60, 85, 90}, // Carlos
            {95, 80, 75}, // Marta
            {60, 70, 65} // Rodrigo
        };

        ArrayList<String> jugadores = new ArrayList<>(
                Arrays.asList("Ana", "Carlos", "Marta", "Rodrigo")
        );

        GestorTorneo torneo = new GestorTorneo(puntuaciones, jugadores);

        System.out.println("=== TABLA DEL TORNEO ===");
        torneo.imprimirTabla();

        System.out.println("\n=== TOTALES ===");
        torneo.calcularTotales().forEach((k, v)
                -> System.out.printf("  %-10s %d%n", k, v));

        System.out.println("\n=== RANKING FINAL ===");
        int[] pos = {1};
        torneo.rankingFinal().forEach((k, v)
                -> System.out.printf("  %dº %-10s %d pts%n", pos[0]++, k, v));

        int mejor = torneo.mejorRonda();
        System.out.printf("%n=== MEJOR RONDA ===%n  Ronda %d%n", mejor + 1);

        System.out.println("\n=== ELIMINADOS (umbral 200) ===");
        System.out.println("  " + torneo.jugadoresEliminar(200));
    }

}
