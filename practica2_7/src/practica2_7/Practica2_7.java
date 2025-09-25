/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_7;

/**
 *
 * @author gilguerei
 */
public class Practica2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dinero = 2000.00;
        double compras = 1227.26;
        double vueltas = dinero - compras;
        System.out.println("Vueltas: " + vueltas);
        double vcentimos = (int)dinero*100-compras*100;
        int total =(int)vcentimos/100;
        int totalc = (int)vcentimos%100;
        System.out.println("Centimos: " + totalc);
        
        System.out.println((total/500) + " Billetes 500"));
        total = total%500;
        System.out.println((total/200) + " Billetes 200"));
    }
    
}
