// CONCEPTOS CLAVE DEL EJERCICIO 8
// 1. MATRIZ DE DATOS posiciones[atleta][carrera]
//    La fila representa al atleta y la columna a la carrera.
//    Esta elección es arbitraria pero hay que ser consistente.
//    Alternativa: posiciones[carrera][atleta] (columna = atleta).
// 2. MEDIA PONDERADA
//    No es simplemente suma/n. Cada valor se multiplica por un
//    factor antes de sumar:
//      suma = ? (pos[a][c] * factor[c])
//      media = suma / nCarreras
//    Necesitamos double porque los factores tienen decimales.
// 3. ORDENACIÓN BURBUJA (Bubble Sort)
//    Compara pares adyacentes y los intercambia si están en
//    orden incorrecto. Repite hasta que no hay intercambios.
//    Complejidad: O(n²) — aceptable para n=20.
//
//    Patrón intercambio (swap):
//      tmp = a[j];
//      a[j] = a[j+1];
//      a[j+1] = tmp;
//    SIEMPRE necesita una variable temporal tmp.
// 4. ORDENAR ARRAYS EN PARALELO
//    Al ordenar mediaPonderada[], también hay que mover en
//    paralelo nombres[] y posiciones[][] para que la posición i
//    siempre corresponda al mismo atleta.
//    Para posiciones (int[][]) el intercambio es de referencias
//    de array (int[]), no de valores individuales.
// 5. printf con formatos mixtos
//    "%-12s"  ? String alineado a la IZQUIERDA en 12 caracteres
//    "%.2f"   ? double con 2 decimales
//    "%nº"    ? salto de línea portable (equivale a \n en printf)
//    Estos formatos son muy útiles para tablas legibles.
// 6. random.nextInt(100) + 1  ? valor aleatorio en [1, 100]
//    nextInt(n) devuelve un valor en [0, n-1].
//    Para obtener [min, max]: nextInt(max - min + 1) + min
package maratonolimpico;

import java.util.Random;

/**
 *
 * @author Reinaldo Gil
 */
public class MaratonOlimpico {

    static final int ATLETAS = 20;
    static final int CARRERAS = 10;

    // Factores de ponderación para cada carrera (índice 0..9)
    static final double[] FACTORES = {
        0.5, 0.6, 0.7, 0.8, 0.9,
        1.0, 1.1, 1.2, 1.3, 1.4
    };

    public static void main(String[] args) {
        Random random = new Random();

        // EXTRA 2: Nombres generados automáticamente 
        String[] nombres = new String[ATLETAS];
        for (int i = 0; i < ATLETAS; i++) {
            nombres[i] = "Corredor " + i; // Corredor 0, Corredor 1, ..., Corredor 19
        }

        // EXTRA 1: Posiciones aleatorias en rango [1, 100] 
        // posiciones[atleta][carrera] = posición obtenida por ese atleta en esa carrera
        int[][] posiciones = new int[ATLETAS][CARRERAS];
        for (int a = 0; a < ATLETAS; a++) {
            for (int c = 0; c < CARRERAS; c++) {
                posiciones[a][c] = random.nextInt(100) + 1; // nextInt(100) ? [0,99]; +1 ? [1,100]
            }
        }

        //CALCULAR MEDIA PONDERADA de cada atleta
        // mediaPonderada[a] = ?(posiciones[a][c] * FACTORES[c]) / CARRERAS
        double[] mediaPonderada = new double[ATLETAS];
        for (int a = 0; a < ATLETAS; a++) {
            double suma = 0;
            for (int c = 0; c < CARRERAS; c++) {
                suma += posiciones[a][c] * FACTORES[c];
            }
            mediaPonderada[a] = suma / CARRERAS;
        }

        //EXTRA 4: Ordenar de menor a mayor media (Burbuja) 
        // Ordenamos tanto el array de medias como los de nombres y posiciones
        // en paralelo para no perder la correspondencia atleta?datos.
        for (int i = 0; i < ATLETAS - 1; i++) {
            for (int j = 0; j < ATLETAS - 1 - i; j++) {
                if (mediaPonderada[j] > mediaPonderada[j + 1]) {
                    // Intercambiar medias
                    double tmpD = mediaPonderada[j];
                    mediaPonderada[j] = mediaPonderada[j + 1];
                    mediaPonderada[j + 1] = tmpD;
                    // Intercambiar nombres (mantenemos sincronía)
                    String tmpS = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tmpS;
                    // Intercambiar filas de posiciones
                    int[] tmpA = posiciones[j];
                    posiciones[j] = posiciones[j + 1];
                    posiciones[j + 1] = tmpA;
                }
            }
        }

        //EXTRA 4: Mostrar tabla completa ordenada 
        System.out.println("??????????? RANKING COMPLETO ???????????");
        for (int a = 0; a < ATLETAS; a++) {
            System.out.printf("Nombre: %-12s Posiciones: ", nombres[a]);
            System.out.print("[");
            for (int c = 0; c < CARRERAS; c++) {
                System.out.print(posiciones[a][c]);
                if (c < CARRERAS - 1) {
                    System.out.print(", ");
                }
            }
            System.out.printf("]  Media Ponderada: %.2f%n", mediaPonderada[a]);
        }

        // EXTRA 3: Mostrar los 3 seleccionados (ya están al inicio por orden)
        System.out.println("\n??????????? TOP 3 SELECCIONADOS ????????");
        for (int i = 0; i < 3; i++) {
            System.out.printf("  %dº ? %-12s  Media: %.2f%n",
                    i + 1, nombres[i], mediaPonderada[i]);
        }
        System.out.println("????????????????????????????????????????");
    }

}
