/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_4_2_a;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_4_2_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado = new Scanner(System.in);
       double nota;
       int suma = 0;
       int conta = 0;
       double media = 0;
        do {
            System.out.println("Introduce nota entre 0 y 10, 99 finaliza");
            nota = teclado.nextDouble();
            if (nota != 99) {//plantear soluciones alternativas, una con bucle y otra con if
               while(nota < 0 || nota > 10) {
                    System.out.println("Error, nota no válida");
                    continue;
                }
                suma += nota;
                conta++;
            }
            if(conta>0) {
                media = suma/conta;
                System.out.println("Media de las notas: " + media);
            }
        } while (nota != 99);
        System.out.println("Notas introducidas: " + conta);
    }
}
