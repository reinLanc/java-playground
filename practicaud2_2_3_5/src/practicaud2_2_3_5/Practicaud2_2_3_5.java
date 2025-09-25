/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_3_5;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca código del trabajador");
        int codigo = teclado.nextInt();

        while (codigo != 0) {
            System.out.println("Introduzca número de hijos");
            int hijos = teclado.nextInt();
            System.out.println("Introduzca horas trabajadas");
            int horas = teclado.nextInt();
            int gratificacionHijos = 0;
            int gratificacionHoras = 360;
            int sueldoTotal = 0;
            int horastrabajar = 100;
            int horastotales = horastrabajar-horas;
            int horastrabajadas = gratificacionHoras - horastotales*9;
            if (hijos == 0) {
                gratificacionHijos = 180;
            }
            if (hijos == 1) {
                gratificacionHijos = 240;
            }
            if (hijos == 2) {
                gratificacionHijos = 300;
            } else {
                gratificacionHijos = 360;
            }
            System.out.println("Trabajador numero " + codigo);
            System.out.println("Gratificación por hijos: " + gratificacionHijos + "€");
            System.out.println("Gratificación por horas trabajadas: " + horastrabajadas + "€");
            System.out.println("Total : " + (gratificacionHijos+horastrabajadas) + "€");
            System.out.println("Introduzca código del trabajador");
            codigo = teclado.nextInt();
            System.out.println("Introduzca número de hijos");
            hijos = teclado.nextInt();
            System.out.println("Introduzca horas trabajadas");
        }
    }

}
