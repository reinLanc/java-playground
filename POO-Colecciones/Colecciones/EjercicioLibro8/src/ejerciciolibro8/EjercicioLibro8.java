/*
Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de la clase Carta). 
Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que no se repite ninguna.
 */
package ejerciciolibro8;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro8 {

 // Array con los palos de la baraja española
    private static final String[] PALOS = {"bastos", "copas", "espadas", "oros"};
    
    public static void main(String[] args) {
        // ArrayList para almacenar las cartas
        ArrayList<Carta> mano = new ArrayList<>();
        
        System.out.println("=== 10 CARTAS ALEATORIAS ===\n");
        
        // Generamos 10 cartas sin repetir
        while (mano.size() < 10) {
            // Generamos una carta aleatoria
            int numeroAleatorio = (int)(Math.random() * 12) + 1; // 1 a 12
            String paloAleatorio = PALOS[(int)(Math.random() * PALOS.length)];
            
            Carta nuevaCarta = new Carta(numeroAleatorio, paloAleatorio);
            
            // Comprobamos si la carta ya existe en la mano
            // contains() usa el método equals() que hemos sobrescrito
            if (!mano.contains(nuevaCarta)) {
                mano.add(nuevaCarta);
                System.out.println("Carta " + mano.size() + ": " + nuevaCarta);
            }
            // Si la carta ya existe, el bucle continúa y genera otra
        }
        
        System.out.println("\n--- Mano completa ---");
        for (int i = 0; i < mano.size(); i++) {
            System.out.println((i + 1) + ". " + mano.get(i));
        }
    }
}

/*
 * PUNTOS CLAVE DE ESTE EJERCICIO:
 * 
 * 1. Sobrescritura del método equals():
 *    - Es necesario para que contains() funcione correctamente
 *    - Compara número Y palo para determinar si dos cartas son iguales
 * 
 * 2. Evitar repeticiones:
 *    - Usamos un bucle while que continúa hasta tener 10 cartas
 *    - Solo añadimos la carta si !mano.contains(nuevaCarta)
 *    - Si la carta ya existe, se genera otra en la siguiente iteración
 * 
 * 3. Estructura de la baraja española:
 *    - 4 palos: bastos, copas, espadas, oros
 *    - 12 cartas por palo: 1-7, Sota(10), Caballo(11), Rey(12)
 *    - Total: 48 cartas (no usamos el 8 y 9 en la baraja española tradicional)
 * 
 * 4. Método contains():
 *    - Recorre el ArrayList buscando un elemento igual
 *    - Usa equals() para comparar objetos
 *    - Muy útil para evitar duplicados
 */

