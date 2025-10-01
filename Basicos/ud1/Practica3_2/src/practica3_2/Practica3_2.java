/*
 * Cálculo del porcentaje de hombres y mujeres en un grupo de estudiantes
 */
package practica3_2;

public class Practica3_2 {

    public static void main(String[] args) {
        int hombres = 22, mujeres = 3;
        
        // Cálculo y visualización del total de hombres y mujeres
        int total = hombres + mujeres;
        System.out.println("Número total de hombres y mujeres: " + total);
        
        // Cálculo del porcentaje de hombres
        double porcentajeHombres = (double)hombres / total * 100;
        System.out.println("Número de hombres: " + hombres
                + "\tPorcentaje: " + porcentajeHombres + "%");
        
        // Cálculo del porcentaje de mujeres
        double porcentajeMujeres = (double)mujeres / total * 100;
        System.out.println("Número de mujeres: " + mujeres
                + "\tPorcentaje: " + porcentajeMujeres + "%");

    }

}
