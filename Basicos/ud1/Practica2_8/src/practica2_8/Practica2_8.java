/*
 * Programa que transforma en grados un ángulo dado en radianes
 */
package practica2_8;

public class Practica2_8 {

    public static void main(String[] args) {
        final double PI = 3.14159; // Definimos una constante con el valor de pi
        
        double radianes = 1; // Radianes que queremos convertir a grados
        
        double grados = radianes * 180 / PI; // Realizamos la conversión
        
        // Mostramos el resultado por pantalla
        System.out.println(radianes + " radianes son " + grados + " grados.");
    }
    
}
