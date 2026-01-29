/*
Modifica el programa anterior de tal forma que las cartas se muestren ordenadas
Primero se ordenarán por palo: bastos, copas, espadas, oros. 
Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 */
package ejerciciolibro9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro9 {

    private static final String[] PALOS = {"bastos", "copas", "espadas", "oros"};

    public static void main(String[] args) {
        ArrayList<CartaOrdenable> mano = new ArrayList<>();

        System.out.println("=== CARTAS ALEATORIAS ===\n");

        // Generamos 10 cartas sin repetir
        while (mano.size() < 10) {
            int numeroAleatorio = (int) (Math.random() * 12) + 1;
            String paloAleatorio = PALOS[(int) (Math.random() * PALOS.length)];

            CartaOrdenable nuevaCarta = new CartaOrdenable(numeroAleatorio, paloAleatorio);

            if (!mano.contains(nuevaCarta)) {
                mano.add(nuevaCarta);
            }
        }

        // Mostramos las cartas desordenadas
        System.out.println("Cartas generadas (sin ordenar):");
        for (int i = 0; i < mano.size(); i++) {
            System.out.println((i + 1) + ". " + mano.get(i));
        }

        // Ordenamos las cartas usando un Comparator personalizado
        // Primero por palo, luego por número
        Collections.sort(mano, new Comparator<CartaOrdenable>() {
            @Override
            public int compare(CartaOrdenable c1, CartaOrdenable c2) {
                // Primero comparamos por palo
                int comparacionPalo = Integer.compare(c1.getOrdenPalo(), c2.getOrdenPalo());

                if (comparacionPalo != 0) {
                    // Los palos son diferentes, devolvemos esa comparación
                    return comparacionPalo;
                } else {
                    // Los palos son iguales, comparamos por número
                    return Integer.compare(c1.getNumero(), c2.getNumero());
                }
            }
        });

        // Mostramos las cartas ordenadas
        System.out.println("\n=== CARTAS ORDENADAS ===");
        System.out.println("(Orden: bastos, copas, espadas, oros)");
        System.out.println("(Dentro de cada palo: as, 2, 3...7, sota, caballo, rey)\n");

        for (int i = 0; i < mano.size(); i++) {
            System.out.println((i + 1) + ". " + mano.get(i));
        }
    }
}

/*
 * EXPLICACIÓN DE LA ORDENACIÓN PERSONALIZADA:
 * 
 * 1. Comparator<CartaOrdenable>:
 *    - Es una interfaz que define cómo comparar dos objetos
 *    - El método compare() devuelve:
 *      * Negativo si c1 < c2
 *      * Cero si c1 == c2
 *      * Positivo si c1 > c2
 * 
 * 2. Criterio de ordenación:
 *    - PRIMERO: Ordenamos por palo (bastos < copas < espadas < oros)
 *    - SEGUNDO: Si el palo es igual, ordenamos por número (1 < 2 < ... < 12)
 * 
 * 3. Integer.compare():
 *    - Método auxiliar que compara dos enteros
 *    - Más limpio que usar operadores < y >
 * 
 * 4. Resultado:
 *    - Todas las cartas de bastos primero (ordenadas por número)
 *    - Luego las de copas (ordenadas por número)
 *    - Luego las de espadas (ordenadas por número)
 *    - Finalmente las de oros (ordenadas por número)
 * 
 * ALTERNATIVA CON LAMBDA (Java 8+):
 * Collections.sort(mano, (c1, c2) -> {
 *     int comparacionPalo = Integer.compare(c1.getOrdenPalo(), c2.getOrdenPalo());
 *     return comparacionPalo != 0 ? comparacionPalo : 
 *            Integer.compare(c1.getNumero(), c2.getNumero());
 * });
 */
