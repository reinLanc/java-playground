/*
 * Cálculo del reparto de presupuesto entre distintas áreas de un hospital
 */
package practica3_3;

/**
 *
 * @author 
 */
public class Practica3_3 {

    public static void main(String[] args) {
        double presupuesto = 120000;
        
        // Cálculo de la cantidad de dinero para cada área
        double ginecologia = presupuesto * 40 / 100;
        double traumatologia = presupuesto * 30 / 100;
        double pediatria = presupuesto * 30 / 100;
        
        // Mostramos los resultados
        System.out.println("Presupuesto total: " + presupuesto + " €");
        System.out.println("Ginecología: " + ginecologia + " €");
        System.out.println("Traumatología: " + traumatologia + " €");
        System.out.println("Pediatría: " + pediatria + " €");
        
    }
    
}
