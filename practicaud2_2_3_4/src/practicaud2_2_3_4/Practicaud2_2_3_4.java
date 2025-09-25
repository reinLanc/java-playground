/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_3_4;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int lista = 0;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int faltas;
        double media;
        double notaFinal = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduzca numero de lista");
            lista = teclado.nextInt();
            System.out.println("Introduzca nota1");
            nota1 = teclado.nextInt();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Introduzca nota1");
                nota1 = teclado.nextInt();
            }
            System.out.println("Introduzca nota2");
            nota2 = teclado.nextInt();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Introduzca nota2");
                nota2 = teclado.nextInt();
            }
            System.out.println("Introduzca nota3");
            nota3 = teclado.nextInt();
            while (nota3 < 0 || nota3 > 10) {
                System.out.println("Introduzca nota3");
                nota3 = teclado.nextInt();
            }
            System.out.println("Introduzca num de faltas");
            faltas = teclado.nextInt();
            media = (nota1 + nota2 + nota3) / 3;
            if (faltas < 5) {
                notaFinal = media + 1;
            } else if (faltas >= 5 && faltas < 10) {
                notaFinal = media;
            } else if (faltas >= 10 && faltas < 15) {
                notaFinal = media - 1;
            } else if (faltas >= 15 && faltas < 20) {
                notaFinal = media - 2;
            } else if (faltas >= 20) {
                notaFinal = media - 3;
            } 
            if (notaFinal > 10) {
                notaFinal = 10;
            } if (notaFinal < 0) {
                notaFinal = 0;
            }
        System.out.println("El alumno num " + lista + " tiene " + media + " de media");
        System.out.println("El alumno num " + lista + " tiene " + notaFinal + " de final");
        }
    }

}
