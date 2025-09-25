/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_3_1;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int acumulador;
        for (i = 1; i <= 10; i++) {
            acumulador = 1;
            for (int j = 1; j <= 5; j++) {
                acumulador = acumulador * i;
                System.out.println(i + " elevado a " + j + " es: " + acumulador);
            }
            System.out.println("");
        }
    }
}
