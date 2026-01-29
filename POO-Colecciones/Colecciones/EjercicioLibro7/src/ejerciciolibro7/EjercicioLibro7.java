/*
La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón siguiendo la 
siguiente pauta: o bien coincide el valor con la moneda anteriormente generada- 
1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros- 
o bien coincide la posición– cara o cruz. Simula, mediante un programa, la generación de 6 monedas
aleatorias siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de la clase Moneda
y la secuencia se debe ir almacenando en una lista.
Ejemplo: 2 céntimos– cara 2 céntimos– cruz 50 céntimos– cruz 1 euro– cruz 1 euro– cara 10 céntimos– cara
 */
package ejerciciolibro7;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro7 {
    // Array con los valores posibles de las monedas

    private static final String[] VALORES = {"1c", "2c", "5c", "10c", "25c", "50c", "1€", "2€"};
    // Array con las posiciones posibles
    private static final String[] POSICIONES = {"cara", "cruz"};

    public static void main(String[] args) {
        // Lista para almacenar la secuencia de monedas
        ArrayList<Moneda> secuencia = new ArrayList<>();

        System.out.println("=== MÁQUINA EUROCOIN ===\n");

        // Generamos la primera moneda (completamente aleatoria)
        String valorInicial = VALORES[(int) (Math.random() * VALORES.length)];
        String posicionInicial = POSICIONES[(int) (Math.random() * POSICIONES.length)];
        Moneda monedaAnterior = new Moneda(valorInicial, posicionInicial);
        secuencia.add(monedaAnterior);

       // System.out.println("Moneda 1: " + monedaAnterior);

        // Generamos las siguientes 5 monedas (deben coincidir en valor o posición)
        for (int i = 2; i <= 6; i++) {
            Moneda nuevaMoneda = generarSiguienteMoneda(monedaAnterior);
            secuencia.add(nuevaMoneda);
           // System.out.println("Moneda " + i + ": " + nuevaMoneda);
            monedaAnterior = nuevaMoneda;
        }

        // Mostramos la secuencia completa
        System.out.println("\n--- Secuencia completa ---");
        for (int i = 0; i < secuencia.size(); i++) {
            System.out.println((i + 1) + ". " + secuencia.get(i));
        }
    }

    /**
     * Genera una nueva moneda que coincide en valor o posición con la anterior
     *
     * @param anterior La moneda anterior
     * @return Nueva moneda que cumple la regla
     */
    private static Moneda generarSiguienteMoneda(Moneda anterior) {
        String nuevoValor;
        String nuevaPosicion;

        // Decidimos aleatoriamente si coincidirá en valor o en posición
        boolean coincideValor = Math.random() < 0.5;

        if (coincideValor) {
            // Coincide en VALOR, pero cambiamos la posición
            nuevoValor = anterior.getValor();

            // Cambiamos la posición (si era cara ? cruz, si era cruz ? cara)
            if (anterior.getPosicion().equals("cara")) {
                nuevaPosicion = "cruz";
            } else {
                nuevaPosicion = "cara";
            }
        } else {
            // Coincide en POSICIÓN, pero cambiamos el valor
            nuevaPosicion = anterior.getPosicion();

            // Generamos un valor diferente al anterior
            do {
                nuevoValor = VALORES[(int) (Math.random() * VALORES.length)];
            } while (nuevoValor.equals(anterior.getValor()));
        }

        return new Moneda(nuevoValor, nuevaPosicion);
    }
}

/*
 * EXPLICACIÓN DEL ALGORITMO:
 * 
 * 1. La primera moneda se genera completamente al azar
 * 
 * 2. Para cada moneda siguiente, decidimos aleatoriamente:
 *    - Opción A: Mantener el VALOR y cambiar la POSICIÓN
 *    - Opción B: Mantener la POSICIÓN y cambiar el VALOR
 * 
 * 3. Esto garantiza que cada nueva moneda coincida con la anterior
 *    en exactamente una característica (valor o posición)
 * 
 * Ejemplo de secuencia válida:
 * 1. 2c - cara
 * 2. 2c - cruz    (coincide en valor)
 * 3. 50c - cruz   (coincide en posición)
 * 4. 1€ - cruz    (coincide en posición)
 * 5. 1€ - cara    (coincide en valor)
 * 6. 10c - cara   (coincide en posición)
 */
