package ejercicio5;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // Valores iniciales
        int a = 5;
        int b = 10;

        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Necesitamos una variable temporal para intercambiar
        int temp = a;  // Guardamos el valor de a
        a = b;         // a toma el valor de b
        b = temp;      // b toma el valor original de a

        System.out.println("\nDespués del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/* EXPLICACIÓN:
 * Para intercambiar valores necesitamos una variable auxiliar
 * 1. temp guarda el valor de a (5)
 * 2. a toma el valor de b (10)
 * 3. b toma el valor guardado en temp (5)
 * Resultado: a=10, b=5
 */
