/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_1;

/**
 *
 * @author gilguerei
 */
public class Practica3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1 = 8, nota2=9, nota3= 9;
        double examenFinal = 9;
        double trabajoFinal = 9;
        
        double media = (nota1+nota2+nota3)/3;
        
        double notaFinal = 0.55*media + 0.30*examenFinal+ 0.15*trabajoFinal;
        System.out.println(notaFinal);
        
    }
    
}
