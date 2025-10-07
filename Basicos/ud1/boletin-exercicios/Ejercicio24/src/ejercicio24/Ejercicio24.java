package ejercicio24;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        // Datos del tablero
        double ladoTablero = 80.0;      // cm
        double ladoCasa = 2.0;          // cm

        // Calculamos cuántas casas caben por lado
        int casasPorLado = (int) (ladoTablero / ladoCasa);

        // Total de casas = casas por lado × casas por lado
        int totalCasas = casasPorLado * casasPorLado;

        System.out.println("Lado del tablero: " + ladoTablero + " cm");
        System.out.println("Lado de cada casa: " + ladoCasa + " cm");
        System.out.println("Casas por lado: " + casasPorLado);
        System.out.println("Total de casas: " + totalCasas);
    }
}

/* EXPLICACIÓN:
 * Si el tablero mide 80 cm y cada casa 2 cm:
 * - Casas por lado: 80 / 2 = 40
 * - Total de casas: 40 × 40 = 1600 casas
 * 
 * El tablero es cuadrado, por eso elevamos al cuadrado
 */
