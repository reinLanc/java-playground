/*
 * Cálculo de la calificación final de un alumno
 */
package practica3_1;

public class Practica3_1 {

    public static void main(String[] args) {
        
        // Calificaciones parciales
        double parcial1 = 8, parcial2 = 9, parcial3 = 8; 
        
        // Calificación examen final
        double examenFinal = 9;
        
        // Calificación trabajo final
        double trabajoFinal = 10;
        
        // Cálculo de la media de los parciales        
        double mediaParciales = (parcial1 + parcial2 + parcial3) / 3;
        
        // Cálculo de la nota final
        double notaFinal = 0.55 * mediaParciales + 0.3 * examenFinal
                           + 0.15 * trabajoFinal;
        
        // Mostramos por pantalla la nota final
        System.out.println("Nota final: " + notaFinal);
        
    }
    
}
