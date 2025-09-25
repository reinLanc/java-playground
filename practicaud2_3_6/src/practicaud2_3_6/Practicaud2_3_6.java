/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_3_6;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un número.");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        double numerador = 0;
        double divisor = 2;
        double resultado = 0;
        while(num <= 0) {
            System.out.println("Introduzca un número.(Debe ser positivo y mayor que cero");
            num = teclado.nextInt();
        }
        for(int i = 0; i<= num; i++) {
            numerador = numerador+5;
            divisor = divisor*3;
            resultado += numerador/divisor;
            System.out.println(numerador + " " + divisor);
        }
        System.out.println("Resultado = " + resultado);
    }
    
}
