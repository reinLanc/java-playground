/*
 * Programa que visualiza por pantalla la suma de los números pares y la suma de
 * los impares desde 1 hasta 100.
 */
package ud2_practica2_10;

public class UD2_Practica2_10 {

    public static void main(String[] args) {
        // Variables para almacenar la suma de los pares y de los impares
        int sumaPares = 0;
        int sumaImpares = 0;
        
        // Recorremos los números desde 1 hasta 100 y, dependiendo de si el
        // número es par o impar, lo añadimos a la suma correspondiente.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }
        
        // Mostramos las dos sumas
        System.out.println("Suma de pares entre 1 y 100 = " + sumaPares);
        System.out.println("Suma de impares entre 1 y 100 = " + sumaImpares);
    }
    
}
