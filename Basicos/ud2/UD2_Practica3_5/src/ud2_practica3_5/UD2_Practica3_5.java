/*
 * Programa que calcula la gratificación por hijos y por asistencia al trabajo
 * para cada trabajador de una empresa. El programa finaliza cuando el código del
 * trabajador sea 0.
 */
package ud2_practica3_5;

import java.util.*;

/**
 *
 * @author 
 */
public class UD2_Practica3_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce código del trabajador: ");
        int codigo = teclado.nextInt();
        
        while (codigo != 0) {
            // Leemos número de hijos y horas no trabajadas
            System.out.print("Introduce número de hijos: ");
            int numHijos = teclado.nextInt();
            
            System.out.print("Introduce horas no trabajadas: ");
            int horas = teclado.nextInt();
            
            // Determinamos la gratificación por hijos
            double gratificacionHijos = 0;
            switch (numHijos) {
                case 0:
                    gratificacionHijos = 180;
                    break;
                case 1:
                    gratificacionHijos = 240;
                    break;
                case 2:
                    gratificacionHijos = 300;
                    break;
                default:
                    gratificacionHijos = 360;
                    break;
            }
            
            // Calculamos gratificación por asistencia al trabajo
            double gratificacionAsistencia = 360 - horas * 9;
            if (gratificacionAsistencia < 0) {
                gratificacionAsistencia = 0;
            }
            
            // Mostramos los resultados
            System.out.println("---------------------------------------");
            System.out.println("Código del trabajador: " + codigo);
            System.out.println("Gratificación por hijos: " + gratificacionHijos);
            System.out.println("Gratificación por asistencia al trabajo: "
                               + gratificacionAsistencia);
            System.out.println("---------------------------------------");
            System.out.println("");
            
            System.out.print("Introduce código del trabajador: ");
            codigo = teclado.nextInt();
        }
    }
    
}
