/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_3_8;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca el número de personas");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int edad;
        int edades = 0;
        double media = 0;
        int mayor = 0;
        int menor = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Introduzca edad de la persona (" + i + "/" + num + ")");
            edad = teclado.nextInt();
            edades += edad;
            media = edades / num;
            if(i==1) {
                mayor = edad;
                menor = edad;
            }
            if (edad < menor) {
                menor = edad;
            } 
            if (edad > mayor) {
                mayor = edad;
            }
        }
        System.out.println("Grupo de " + num + " personas.");
        System.out.println("Media de edad: " + media);
        System.out.println("Edad del mayor: " + mayor);
        System.out.println("Edad del menor: " + menor);
    }

}
