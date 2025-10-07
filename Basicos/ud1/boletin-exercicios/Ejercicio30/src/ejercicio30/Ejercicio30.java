package ejercicio30;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio30 {

    public static void main(String[] args) {
        // Velocidad de la luz
        final double c = 2.997925e10;  // cm/s

        // Masa en gramos
        double m = 100.0;  // 100 gramos

        // Fórmula de Einstein: E = mc²
        double E = m * c * c;

        System.out.println("=== ECUACIÓN DE EINSTEIN E = mc² ===");
        System.out.println("Masa: " + m + " g");
        System.out.println("Velocidad de la luz: " + c + " cm/s");
        System.out.println("\nEnergía producida: " + E + " ergs");
        System.out.println("(En notación científica: " + String.format("%.4e", E) + " ergs)");

        // Información adicional
        System.out.println("\nNota: 1 erg = 1 g·cm²/s²");
    }
}

/* EXPLICACIÓN:
 * Ecuación de Einstein: E = mc²
 * 
 * Donde:
 * - E = energía (ergs)
 * - m = masa (gramos)
 * - c = velocidad de la luz (cm/s)
 * 
 * Con m = 100 g y c = 2.997925×10¹⁰ cm/s:
 * E = 100 × (2.997925×10¹⁰)²
 * E ≈ 8.987×10²¹ ergs
 * 
 * Esta enorme cantidad de energía muestra el principio
 * de equivalencia masa-energía
 */
