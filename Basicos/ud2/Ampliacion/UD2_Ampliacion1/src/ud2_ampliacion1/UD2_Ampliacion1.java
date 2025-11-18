/*
 * Introduce por teclado las notas de un grupo de alumnos (10). Calcula la nota media,
 * el número de aprobados y el número de suspensos.
 */
package ud2_ampliacion1;

import java.util.*;


/**
 *
 * @author
 */
public class UD2_Ampliacion1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double suma = 0;
        int numAprobados = 0;
        int numSuspensos = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca la nota del alumno número "+i+" : ");
            double nota=teclado.nextDouble();
            while(nota < 0 || nota > 10){
                System.out.print("ERROR. Introduzca la nota del alumno número "+i+" : ");
                nota=teclado.nextDouble();                
            }
            
            if (nota >= 5) {
                numAprobados++;
            } else {
                numSuspensos++;
            }
            
            suma += nota;
        }
        
        System.out.println("\nNota media: " + (suma / 10));
        System.out.println("Aprobados: " + numAprobados);
        System.out.println("Suspensos: " + numSuspensos);
    }
}
