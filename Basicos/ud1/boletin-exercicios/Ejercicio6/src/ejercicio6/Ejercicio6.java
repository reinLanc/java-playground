package ejercicio6;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        // Forma 1: Usando el car�cter directamente
        char letra1 = 'e';

        // Forma 2: Usando el c�digo Unicode decimal
        char letra2 = 101;  // 101 es el c�digo Unicode de 'e'

        // Forma 3: Usando el c�digo Unicode hexadecimal
        char letra3 = '\u0065';  // 0065 en hexadecimal = 101 decimal

        System.out.println("Forma 1 (literal): " + letra1);
        System.out.println("Forma 2 (c�digo decimal): " + letra2);
        System.out.println("Forma 3 (c�digo hexadecimal): " + letra3);
    }
}

/* EXPLICACI�N:
 * Hay tres formas de almacenar un car�cter:
 * 1. 'e' - Entre comillas simples
 * 2. 101 - Su c�digo Unicode en decimal
 * 3. '\u0065' - Su c�digo Unicode en hexadecimal
 */
