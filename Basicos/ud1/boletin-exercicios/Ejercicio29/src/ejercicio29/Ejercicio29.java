package ejercicio29;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        // Constante de gravitación universal
        final double G = 6.673e-8;  // cm³/(g seg²)

        // Masas de los cuerpos (en gramos)
        double m1 = 5000.0;   // 5 kg = 5000 g
        double m2 = 3000.0;   // 3 kg = 3000 g

        // Distancia entre los cuerpos (en cm)
        double d = 100.0;     // 1 metro = 100 cm

        // Fórmula: F = G * (m1 * m2) / (d²)
        double F = G * (m1 * m2) / (d * d);

        System.out.println("=== CÁLCULO DE FUERZA GRAVITATORIA ===");
        System.out.println("Constante G: " + G + " cm³/(g·seg²)");
        System.out.println("Masa 1: " + m1 + " g");
        System.out.println("Masa 2: " + m2 + " g");
        System.out.println("Distancia: " + d + " cm");
        System.out.println("\nFuerza gravitatoria: " + F + " dinas");
        System.out.println("(1 dina = 1 g·cm/seg²)");
    }
}

/* EXPLICACIÓN:
 * Ley de gravitación universal de Newton
 * F = G × (m₁ × m₂) / d²
 * 
 * Con G = 6.673×10⁻⁸ cm³/(g·seg²)
 * m1 = 5000 g, m2 = 3000 g, d = 100 cm
 * 
 * F = 6.673×10⁻⁸ × (5000 × 3000) / 10000
 * F = 6.673×10⁻⁸ × 15000000 / 10000
 * F = 0.10009 dinas
 */
