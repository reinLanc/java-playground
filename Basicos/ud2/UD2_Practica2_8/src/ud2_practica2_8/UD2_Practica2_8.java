/*
 * Programa que calcula la suma de los cuadrados de los números del 1 al 100.
 */
package ud2_practica2_8;

public class UD2_Practica2_8 {

    public static void main(String[] args) {
        int suma = 0, i; // Variable que contendrá la suma total
        
        for (i = 1; i <= 100; i++)
            suma = suma + i * i;
        
        System.out.println("La suma de los cuadrados de los números "
                           + "del 1 al 100 es " + suma + ".");
    }
}
