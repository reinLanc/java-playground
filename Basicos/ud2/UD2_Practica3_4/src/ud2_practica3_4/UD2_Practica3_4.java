/*
* Se introducen por teclado los números de lista, las notas de 3 evaluaciones (de 0 a
* 10. Si no son correctas se pedirán de nuevo) y el número de faltas a clase de 5
* alumnos de un curso. El programa calcula la nota media y obteniene una nota final
* en función de las horas faltadas a clase.
* Si al calcular la nota final resulta una nota superior a 10 o inferior a 0, se dejará en
* 10 o 0 respectivamente.
* 
 */
package ud2_practica3_4;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Practica3_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Leemos los datos de 5 alumnos y, a partir de ellos, obtenemos su
        // nota final
        for (int i = 1; i <= 5; i++) {
            // Leemos número de lista del alumno
            System.out.print("Introduce número de lista del alumno: ");
            int numLista = teclado.nextInt();
            
            // Leemos notas de la primera evaluación hasta que nos introduzcan
            // un valor entre 0 y 10.
            System.out.print("Introduce nota de la primera evaluación: ");
            int notaEval1 = teclado.nextInt();
            while (notaEval1 < 0 || notaEval1 > 10) {
                System.out.print("NOTA NO VÁLIDA. Introduce nota de la primera evaluación: ");
                notaEval1 = teclado.nextInt();
            }
 
            // Leemos notas de la segunda evaluación hasta que nos introduzcan
            // un valor entre 0 y 10.
            System.out.print("Introduce nota de la segunda evaluación: ");
            int notaEval2 = teclado.nextInt();
            while (notaEval2 < 0 || notaEval2 > 10) {
                System.out.print("NOTA NO VÁLIDA. Introduce nota de la segunda evaluación: ");
                notaEval2 = teclado.nextInt();
            }
 
            // Leemos notas de la tercera evaluación hasta que nos introduzcan
            // un valor entre 0 y 10.
            System.out.print("Introduce nota de la tercera evaluación: ");
            int notaEval3 = teclado.nextInt();
            while (notaEval3 < 0 || notaEval3 > 10) {
                System.out.print("NOTA NO VÁLIDA. Introduce nota de la tercera evaluación: ");
                notaEval1 = teclado.nextInt();
            }
            
            // Leemos número de faltas del alumno
            System.out.print("Introduce número de faltas del alumno: ");
            int numFaltas = teclado.nextInt();
            
            // Calculamos la nota media sin tener en cuenta las faltas
            double notaMedia = (notaEval1 + notaEval2 + notaEval3) / 3.0;
            
            // Modificamos la nota media en función del número de faltas
            if (numFaltas < 5) 
                notaMedia++;
            else if (numFaltas < 10);
            else if (numFaltas < 15)
                notaMedia--;
            else if (numFaltas < 20)
                notaMedia -= 2;
            else
                notaMedia -= 3;
            
            // Ajustamos la nota final a 10 si la nota media es superior a 10 y
            // a 0 si la nota media es inferior a 0.
            if (notaMedia > 10) 
                notaMedia = 10;
            
            if (notaMedia < 0)
                notaMedia = 0;
            
            //Mostramos la nota final
            System.out.println("Nota media del alumno con número de lista "
                               + numLista + ": " + notaMedia + "\n");
        }
    }
    
}
