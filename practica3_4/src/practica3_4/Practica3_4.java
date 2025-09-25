/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_4;

/**
 *
 * @author gilguerei
 */
public class Practica3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio = 100;
        double ganancia = 30;
        double nuevoPrecio = precio+precio*ganancia/100;
        double nuevoprecio2 = precio/0.7;
        //precio de compra
        System.out.println(nuevoPrecio);
        //precio de venta
        System.out.println(nuevoprecio2);
        
    }
    
}
