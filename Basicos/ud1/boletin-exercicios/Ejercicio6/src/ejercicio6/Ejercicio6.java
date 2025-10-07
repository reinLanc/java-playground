package ejercicio6;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        // Forma 1: Usando el carácter directamente
        char letra1 = 'e';

        // Forma 2: Usando el código Unicode decimal
        char letra2 = 101;  // 101 es el código Unicode de 'e'

        // Forma 3: Usando el código Unicode hexadecimal
        char letra3 = '\u0065';  // 0065 en hexadecimal = 101 decimal

        System.out.println("Forma 1 (literal): " + letra1);
        System.out.println("Forma 2 (código decimal): " + letra2);
        System.out.println("Forma 3 (código hexadecimal): " + letra3);
    }
}

/* EXPLICACIÓN:
 * Hay tres formas de almacenar un carácter:
 * 1. 'e' - Entre comillas simples
 * 2. 101 - Su código Unicode en decimal
 * 3. '\u0065' - Su código Unicode en hexadecimal
 */
