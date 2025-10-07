package ejercicio16;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        // Probamos con diferentes valores
        int contador = 8;
        System.out.println("Contador inicial: " + contador);
        contador = (contador + 1) % 11;
        System.out.println("Después de incrementar: " + contador);

        // Otro ejemplo con valor 10
        contador = 10;
        System.out.println("\nContador inicial: " + contador);
        contador = (contador + 1) % 11;
        System.out.println("Después de incrementar: " + contador);

        // Otro ejemplo con valor 5
        contador = 5;
        System.out.println("\nContador inicial: " + contador);
        contador = (contador + 1) % 11;
        System.out.println("Después de incrementar: " + contador);
    }
}

/* EXPLICACIÓN:
 * Operador módulo (%) para comportamiento circular
 * Rango [0, 10] tiene 11 valores
 * (contador + 1) % 11 hace que:
 * - Si contador = 10, (10+1) % 11 = 0
 * - Si contador = 8, (8+1) % 11 = 9
 * - Siempre queda en el rango [0, 10]
 */
