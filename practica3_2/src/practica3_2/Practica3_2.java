/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2;

/**
 *
 * @author gilguerei
 */
public class Practica3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double mujeres = 3, hombres = 22;
        double total = mujeres+hombres;
        
        double porcentajeHombres = hombres/total*100;
        double porcentajeMujeres = mujeres/total*100;
        
        System.out.println(porcentajeHombres);
        System.out.println(porcentajeMujeres);
    }
    
}
