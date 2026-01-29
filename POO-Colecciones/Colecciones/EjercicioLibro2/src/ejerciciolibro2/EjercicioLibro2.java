/*
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego
calcule la suma, la media, el máximo y el mínimo de esos números.
El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.
 */
package ejerciciolibro2;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro2 {

    public static void main(String[] args) {
        // Creamos el ArrayList para almacenar los números
        ArrayList<Integer> numeros = new ArrayList<>();

        // Generamos un tamaño aleatorio entre 10 y 20 (ambos inclusive)
        int tamaño = (int) (Math.random() * 11) + 10;

        System.out.println("Generando " + tamaño + " números aleatorios...\n");

        // Rellenamos el ArrayList con números aleatorios entre 0 y 100
        for (int i = 0; i < tamaño; i++) {
            int numeroAleatorio = (int) (Math.random() * 101); // 0 a 100 inclusive
            numeros.add(numeroAleatorio);
        }

        // Mostramos los números generados
        System.out.println("Números generados: " + numeros);

        // Calculamos las estadísticas
        // Inicializamos variables para los cálculos
        int suma = 0;
        int maximo = numeros.get(0); // Empezamos con el primer número
        int minimo = numeros.get(0);

        // Recorremos todos los números para calcular
        for (int numero : numeros) {
            suma += numero;

            // Actualizamos el máximo si encontramos uno mayor
            if (numero > maximo) {
                maximo = numero;
            }

            // Actualizamos el mínimo si encontramos uno menor
            if (numero < minimo) {
                minimo = numero;
            }
        }

        // Calculamos la media (convertimos a double para tener decimales)
        double media = (double) suma / numeros.size();

        // Mostramos los resultados
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Suma:    " + suma);
        System.out.println("Media:   " + String.format("%.2f", media));
        System.out.println("Máximo:  " + maximo);
        System.out.println("Mínimo:  " + minimo);
    }

}
