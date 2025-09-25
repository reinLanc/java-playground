/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_3;

/**
 *
 * @author gilguerei
 */
public class Practica3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double presupuesto = 120000;
        double presupuestoGinecologia = presupuesto*0.40;
        double presupuestoTraumatologia = presupuesto*0.30;
        double presupuestoPediatria = presupuesto*0.30;
        
        System.out.println("Presupuesto Ginecologia " + presupuestoGinecologia);
        System.out.println("Presupuesto Traumatologia " + presupuestoTraumatologia);
        System.out.println("Presupuesto Pediatria " + presupuestoPediatria);
    }
    
}
