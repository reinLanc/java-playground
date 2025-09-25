/*
 * Programa que calcula como aumentaría el valor de una inversión de 10000 euros
 * a un 10% el primer año, pierde un valor de 500 euros durante el segundo y 
 * aumenta un 12% durante el tercero.
 */
package practica2_9;

/**
 *
 * @author 
 */
public class Practica2_9 {

    public static void main(String[] args) {
        double inversion = 10000; // Inversión inicial
        
        inversion *= 1.1; // Inversión después del primer año
        // inversion = inversion * 1.1  //equivalente
        System.out.println("La inversión después del primer año es: "
                            + inversion + " euros.");
        
        inversion -= 500; // Inversión después del segundo año
        System.out.println("La inversión después del segundo año es: "
                            + inversion  + " euros.");
        
        inversion *= 1.12; // Inversión después del tercer año
        System.out.println("La inversión después del tercer año es: "
                            + inversion  + " euros.");
        
    }
    
}
