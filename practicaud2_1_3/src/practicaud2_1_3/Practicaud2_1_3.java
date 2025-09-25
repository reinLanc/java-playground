/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_1_3;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //crea un objeto llamado identificador1 que permite leer datos del teclado
        byte nota = teclado.nextByte();
        //asigna el valor introducido, de tipo byte a identificador2
        if (nota < 0 || nota > 10) {
            System.out.println("Nota fuera de Rango (0-10)");
        } else {
            if (nota < 5) {
                System.out.println("Suspenso." + nota);
            } else {
                System.out.println("Aprobado " + nota);
            }
        }
    }

}

