/*
 * En un curso de informática se realizaron 2 exámenes diferentes: A y B, entre 10
 * alumnos. El programa calcula la nota media de cada examen A y B. (Puede haber más
 * exámenes de un tipo que de otro).
 */
package ud2_ampliacion6;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Ampliacion6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double sumaTipoA = 0;
        int numTipoA = 0;
        double sumaTipoB = 0;
        int numTipoB = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Tipo de examen del alumno " + i + " (1-Tipo A,2-Tipo B): ");
            int tipo = teclado.nextInt();
            while (tipo < 1 || tipo > 2) {
                System.out.print("ERROR. Tipo de examen del alumno " + i + " (1-Tipo A,2-Tipo B): ");
                tipo = teclado.nextInt();
            }

            System.out.print("Nota del alumno " + i + " : ");
            double nota = teclado.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.print("ERROR. Introduzca la nota del alumno número " + i + " : ");
                nota = teclado.nextDouble();
            }

            switch (tipo) {
                case 1:
                    numTipoA++;
                    sumaTipoA += nota;
                    break;
                case 2:
                    numTipoB++;
                    sumaTipoB += nota;
                    break;
            }
        }
        
        if (numTipoA != 0) {
            System.out.println("\nNota media exámenes tipo A: "
                    + (sumaTipoA / numTipoA));
        }

        if (numTipoB != 0) {
            System.out.println("Nota media exámenes tipo B: "
                    + (sumaTipoB / numTipoB));
        }

    }

}
