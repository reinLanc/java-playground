/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion1;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ampliacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int nota = 0;
        //contador de notas
        int notas = 0;
        int aprobados = 0;
        int suspensos = 0;
        double media = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce la nota (" + i + "/10)");
            nota = teclado.nextInt();
            notas += nota;
            while (nota < 0 || nota > 10) {
                System.out.println("Nota incorrecta. debe estar entre 0 y 10.");
                nota = teclado.nextInt();
            }
            if (nota < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
            media = notas / 10;
        }
        System.out.println("Notas introducidas: 10");
        System.out.println("Media: " + media);
        System.out.println("Total Aprobados: " + aprobados);
        System.out.println("Total Suspensos: " + suspensos);

    }

}
