/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4_3_1;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud4_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cronometro c;
        Scanner teclado;

        teclado = new Scanner(System.in);
        c = new Cronometro();
        System.out.println("Pulsa INTRO para arracar");
        teclado.nextLine();
        c.arrancar();
        System.out.println("Pulsa INTRO para parar");
        teclado.nextLine();
        c.parar();
        System.out.println("Tiempo transcurrido " + c.tiempo() + " milisegundos");
    }

}
