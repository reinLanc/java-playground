/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_5;

/**
 *
 * @author gilguerei
 */
public class Practica3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sueldoFijo = 1200;
        double ventas = 2000;
        double kilometros = 300;
        double dias = 4;
        
        final double comision = 5;
        final double dietas = 60;
        final double kilometraje = 1;
        final double ss = 150;
        final double irpf = 18;
        
        double prestaciones = ss + sueldoFijo*irpf/100;
        double sueldoBruto = sueldoFijo+ventas*comision/100
        +kilometros*kilometraje
        +dias*dietas;
        System.out.println(sueldoBruto);
        double sueldoLiquido = sueldoBruto - prestaciones;
        System.out.println("Sueldo Liquido " + sueldoLiquido);
    }
    
}
