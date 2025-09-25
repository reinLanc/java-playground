/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion3;

/**
 *
 * @author gilguerei
 */
public class Ampliacion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Precio de adquisición: 2000€");
        System.out.println("Años   \t  Valor Ordenador");
        int i = 0;
        double precio = 2000;
        double depreciacion = 0.40;
        double total = 0;
        while(precio > 300){
            total = precio - (precio * depreciacion);
            precio -=  (precio * depreciacion);
            i++;
            System.out.println(i + " \t " + total + "€");
        }
    }

}


