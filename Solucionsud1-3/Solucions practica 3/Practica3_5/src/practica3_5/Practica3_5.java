/*
 * Cálculo del sueldo fijo a percibir por un vendedor.
 */
package practica3_5;

/**
 *
 * @author 
 */
public class Practica3_5 {

    public static void main(String[] args) {
        // Datos para realizar el cálculo
        double sueldoFijo = 900;
        double ventasRealizadas = 3840.74;
        double kilometrosRealizados = 1000;
        double diasDesplazamiento = 18;
        
        final double COMISION = 5;
        final double KILOMETRAJE = 1;
        final double DIETAS = 60;
        final double RETENCIONSS = 150;
        final double RETENCIONIRPF = 18;
        
        // Cálculo del sueldo bruto
        double sueldoBruto = sueldoFijo + ventasRealizadas * COMISION / 100
                + kilometrosRealizados * KILOMETRAJE 
                + diasDesplazamiento * DIETAS;
        
        // Cálculo de los descuentos (Seguridad Social e IRPF)
        double descuentos = RETENCIONSS + sueldoFijo * RETENCIONIRPF / 100;
        
        // Cálculo del sueldo líquido
        double sueldoLiquido = sueldoBruto - descuentos;
        
        // Visualización del resultado
        System.out.println("Sueldo líquido a percibir: " + sueldoLiquido
                           + " euros.");
        
    }
    
}
