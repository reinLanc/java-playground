/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_1_8;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_1_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ELIGE OPCIÓN 1, 2 , 3 o 4");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
                switch (opcion) {
            case 1:
                System.out.println("Numero Introducido: " + opcion);
                System.out.println("OPCIÓN ELEGIDA:CADRADO");
                break;
            case 2:
                System.out.println("Numero Introducido: " + opcion);
                System.out.println("OPCIÓN ELEGIDA:RECTANGULO");
                break;
            case 3:
                System.out.println("Numero Introducido: " + opcion);
                System.out.println("OPCIÓN ELEGIDA:TRIANGULO");
                break;
            case 4:
                System.out.println("Numero Introducido: " + opcion);
                System.out.println("OPCIÓN ELEGIDA:CIRCULO");
                break;
            default:
                System.out.println("OPCIÓN NO VALIDA");
        }
    }
    
}
