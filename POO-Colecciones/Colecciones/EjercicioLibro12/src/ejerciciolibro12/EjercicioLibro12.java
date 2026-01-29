/*
Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los puntos
según el juego de la brisca. El valor de las cartas se debe guardar en una estructura HashMap que debe
contener parejas (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una estructura
de la clase ArrayList que contiene objetos de la clase Carta. 
El valor de las cartas es el siguiente: 
as ? 11, tres ? 10, sota ? 2, caballo ? 3, rey ? 4; el resto de cartas no vale nada.
 */
package ejerciciolibro12;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro12 {

    // Arrays con las figuras y palos posibles
    private static final String[] FIGURAS = {
        "as", "dos", "tres", "cuatro", "cinco",
        "seis", "siete", "sota", "caballo", "rey"
    };

    private static final String[] PALOS = {
        "oros", "copas", "espadas", "bastos"
    };

    public static void main(String[] args) {
        // ArrayList para almacenar las 5 cartas
        ArrayList<CartaBrisca> mano = new ArrayList<>();

        System.out.println("=== JUEGO DE LA BRISCA ===\n");
        System.out.println("Generando 5 cartas...\n");

        // Generamos 5 cartas sin repetir
        while (mano.size() < 5) {
            // Generamos carta aleatoria
            String figuraAleatoria = FIGURAS[(int) (Math.random() * FIGURAS.length)];
            String paloAleatorio = PALOS[(int) (Math.random() * PALOS.length)];
            CartaBrisca nuevaCarta = new CartaBrisca(figuraAleatoria, paloAleatorio);

            // Solo añadimos si no está repetida
            if (!mano.contains(nuevaCarta)) {
                mano.add(nuevaCarta);
            }
        }

        // Mostramos las cartas y calculamos los puntos totales
        int puntosTotal = 0;
        for (int i = 0; i < mano.size(); i++) {
            CartaBrisca carta = mano.get(i);
            // Usamos el método obtenerValor() de CartaBrisca
            int puntosCarta = carta.obtenerValor();
            System.out.println((i + 1) + ". " + carta);

            // Solo mostramos los puntos si la carta vale algo
            if (puntosCarta > 0) {
                System.out.println("   (" + puntosCarta + " puntos)");
            }
            puntosTotal += puntosCarta;
        }

        // Mostramos el resultado final
        System.out.println("\n???????????????????????????");
        System.out.println("Tienes " + puntosTotal + " puntos");
        System.out.println("???????????????????????????");

        // Mensaje según los puntos obtenidos
        if (puntosTotal >= 30) {
            System.out.println("\n¡Excelente mano!");
        } else if (puntosTotal >= 15) {
            System.out.println("\n¡Buena mano!");
        } else if (puntosTotal > 0) {
            System.out.println("\nMano regular.");
        } else {
            System.out.println("\nMano sin puntos.");
        }
    }
}

/*
 * EXPLICACIÓN DEL EJERCICIO:
 * 
 * 1. Valores en la Brisca:
 *    - As: 11 puntos (la carta más valiosa)
 *    - Tres: 10 puntos (segunda más valiosa)
 *    - Rey: 4 puntos
 *    - Caballo: 3 puntos
 *    - Sota: 2 puntos
 *    - Resto de cartas: 0 puntos
 * 
 * 2. Uso de HashMap para valores:
 *    - Relaciona cada figura con su valor en puntos
 *    - Búsqueda rápida y eficiente
 *    - Fácil de modificar si cambian las reglas
 * 
 * 3. ArrayList para la mano:
 *    - Almacena las 5 cartas generadas
 *    - Permite recorrerlas fácilmente
 *    - El método contains() evita duplicados
 * 
 * 4. Combinación de estructuras:
 *    - ArrayList<CartaBrisca>: para la secuencia de cartas
 *    - HashMap<String, Integer>: para los valores
 *    - Esta combinación es muy común en programación
 * 
 * PUNTUACIÓN POSIBLE:
 * - Mínima: 0 puntos (5 cartas sin valor)
 * - Máxima: 30 puntos (as + tres + rey + caballo + sota)
 * 
 * REGLAS REALES DE LA BRISCA:
 * - En el juego real hay más reglas (triunfo, ganador de baza, etc.)
 * - Este ejercicio solo simula el valor de las cartas
 * - Total de puntos en la baraja completa: 120 puntos
 */
