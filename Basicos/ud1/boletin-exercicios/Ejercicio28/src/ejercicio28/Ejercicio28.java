package ejercicio28;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        // Declaración e inicialización de variables enteras
        int a = 2;
        int b = 10;
        int c = 2;

        // Cálculo de la fórmula: resultado = -b + (b² - 4ac) / 2a + b/a
        // Usando el menor número posible de paréntesis
        // Opción 1: Con mínimos paréntesis (respetando prioridad de operadores)
        double resultado = -b + (b * b - 4 * a * c) / (2 * a) + b / (double) a;

        // Desglose paso a paso para verificar:
        int b_cuadrado = b * b;                    // b² = 100
        int cuatro_a_c = 4 * a * c;               // 4ac = 16
        int numerador = b_cuadrado - cuatro_a_c;  // b² - 4ac = 84
        int dos_a = 2 * a;                        // 2a = 4
        double division1 = numerador / (double) dos_a;  // 84/4 = 21.0
        double division2 = b / (double) a;        // 10/2 = 5.0
        double menos_b = -b;                      // -10
        double resultadoPasoAPaso = menos_b + division1 + division2;  // -10 + 21 + 5 = 16.0

        // Mostrar resultados
        System.out.println("=== CÁLCULO DE FÓRMULA MATEMÁTICA ===");
        System.out.println();
        System.out.println("Variables:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("Fórmula: resultado = -b + (b² - 4ac) / 2a + b/a");
        System.out.println();

        System.out.println("Cálculo paso a paso:");
        System.out.println("b² = " + b + "² = " + b_cuadrado);
        System.out.println("4ac = 4 × " + a + " × " + c + " = " + cuatro_a_c);
        System.out.println("b² - 4ac = " + b_cuadrado + " - " + cuatro_a_c + " = " + numerador);
        System.out.println("2a = 2 × " + a + " = " + dos_a);
        System.out.println("(b² - 4ac) / 2a = " + numerador + " / " + dos_a + " = " + division1);
        System.out.println("b / a = " + b + " / " + a + " = " + division2);
        System.out.println("-b = -" + b + " = " + menos_b);
        System.out.println();

        System.out.println("Resultado final:");
        System.out.println("resultado = " + menos_b + " + " + division1 + " + " + division2);
        System.out.println("resultado = " + resultado);
        System.out.println();

        System.out.println("Verificación (cálculo paso a paso): " + resultadoPasoAPaso);
        System.out.println();

        System.out.println("Código Java (con mínimos paréntesis):");
        System.out.println("double resultado = -b + (b * b - 4 * a * c) / (2 * a) + b / (double) a;");
    }
}
/*
Explicación
Puntos Clave:

Variables enteras: Declaradas como int según el enunciado

   int a = 2;
   int b = 10;
   int c = 2;

Fórmula con mínimos paréntesis:

 double resultado = -b + (b * b - 4 * a * c) / (2 * a) + b / (double) a;

Paréntesis necesarios:

(b * b - 4 * a * c): Para agrupar el numerador
(2 * a): Para el denominador (evitar división incorrecta)
(double) a: Casting para división decimal


Prioridad de operadores (de mayor a menor):

Operador unario - (menos de -b)
Multiplicación *
División /
Suma + y resta -


Casting importante:

b / (double) a ? Convierte a double para obtener resultado decimal
Sin el casting, 10 / 2 daría 5 (división entera)


Resultado: Con a=2, b=10, c=2:

b² = 100
4ac = 16
b² - 4ac = 84
84 / 4 = 21.0
10 / 2 = 5.0
-10 + 21.0 + 5.0 = 16.0
*/
