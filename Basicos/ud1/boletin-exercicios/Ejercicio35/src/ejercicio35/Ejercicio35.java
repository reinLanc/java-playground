package ejercicio35;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        // Ecuación: ax + b = 0
        // Ejemplo: 3x + 6 = 0
        double a = 3.0;
        double b = 6.0;

        // Despejamos x: x = -b / a
        double x = -b / a;

        System.out.println("Ecuación: " + a + "x + " + b + " = 0");
        System.out.println("Solución: x = " + x);

        // Verificación (sustituimos x en la ecuación)
        double resultado = a * x + b;
        System.out.println("Verificación: " + a + " × " + x + " + " + b + " = " + resultado);
    }
}

/* EXPLICACIÓN:
 * Ecuación de primer grado: ax + b = 0
 * Para resolverla:
 * ax + b = 0
 * ax = -b
 * x = -b/a
 * 
 * Ejemplo: 3x + 6 = 0
 * x = -6/3 = -2
 */
