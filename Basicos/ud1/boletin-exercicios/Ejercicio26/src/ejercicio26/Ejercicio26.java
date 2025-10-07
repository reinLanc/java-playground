package ejercicio26;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        double pies = 10.0;

        // Conversiones según las equivalencias dadas
        double yardas = pies / 3;              // 1 yarda = 3 pies
        double pulgadas = pies * 12;           // 1 pie = 12 pulgadas
        double centimetros = pulgadas * 2.54;  // 1 pulgada = 2.54 cm
        double metros = centimetros / 100;     // 1 m = 100 cm

        System.out.println(pies + " pies equivalen a:");
        System.out.println("- " + yardas + " yardas");
        System.out.println("- " + pulgadas + " pulgadas");
        System.out.println("- " + centimetros + " centímetros");
        System.out.println("- " + metros + " metros");
    }
}

/* EXPLICACIÓN:
 * Convertimos 10 pies a todas las unidades:
 * - Yardas: 10 / 3 = 3.333...
 * - Pulgadas: 10 × 12 = 120
 * - Centímetros: 120 × 2.54 = 304.8
 * - Metros: 304.8 / 100 = 3.048
 */
