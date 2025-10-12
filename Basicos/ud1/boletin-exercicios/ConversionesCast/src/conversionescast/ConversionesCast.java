/*
Enunciado
Crea un programa que demuestre diferentes tipos de conversiones y casting:

Declara: int entero = 100, double decimal = 9.75, byte pequeño = 50
Realiza las siguientes operaciones y conversiones:

Conversión automática de int a double
Casting de double a int (observa la pérdida de decimales)
Casting de int a byte
Operación mixta: int + double (observa la promoción)
División entera vs división decimal: 7/2 vs 7.0/2
Demostración de overflow: byte = 130 (con casting)

Muestra los resultados y explica qué ocurre en cada caso
 */
package conversionescast;

/**
 *
 * @author Reinaldo Gil
 */
public class ConversionesCast {

    public static void main(String[] args) {
        // Declaración de variables
        int entero = 100;
        double decimal = 9.75;
        byte pequeno = 50;

        System.out.println("=== CONVERSIONES DE TIPO Y CASTING ===");
        System.out.println();
        System.out.println("Variables iniciales:");
        System.out.println("int entero = " + entero);
        System.out.println("double decimal = " + decimal);
        System.out.println("byte pequeño = " + pequeno);
        System.out.println();

        // 1. Conversión automática de int a double
        double enteroADouble = entero;
        System.out.println("1. Conversión automática int ? double:");
        System.out.println("   " + entero + " ? " + enteroADouble);
        System.out.println("   (No hay pérdida de información)");
        System.out.println();

        // 2. Casting de double a int
        int decimalAEntero = (int) decimal;
        System.out.println("2. Casting explícito double ? int:");
        System.out.println("   " + decimal + " ? " + decimalAEntero);
        System.out.println("   (Se pierde la parte decimal)");
        System.out.println();

        // 3. Casting de int a byte
        byte enteroAByte = (byte) entero;
        System.out.println("3. Casting int ? byte:");
        System.out.println("   " + entero + " ? " + enteroAByte);
        System.out.println("   (Valor dentro del rango de byte)");
        System.out.println();

        // 4. Operación mixta (promoción automática)
        double resultadoMixto = entero + decimal;
        System.out.println("4. Operación mixta (int + double):");
        System.out.println("   " + entero + " + " + decimal + " = " + resultadoMixto);
        System.out.println("   (El int se promociona a double)");
        System.out.println();

        // 5. División entera vs decimal
        int divisionEntera = 7 / 2;
        double divisionDecimal = 7.0 / 2;
        System.out.println("5. División entera vs decimal:");
        System.out.println("   7 / 2 = " + divisionEntera + " (división entera)");
        System.out.println("   7.0 / 2 = " + divisionDecimal + " (división decimal)");
        System.out.println();

        // 6. Demostración de overflow
        byte byteOverflow = (byte) 130;
        System.out.println("6. Overflow en byte:");
        System.out.println("   (byte)130 = " + byteOverflow);
        System.out.println("   (130 está fuera del rango de byte: -128 a 127)");
        System.out.println("   (Resultado incorrecto por overflow)");
        System.out.println();

        // Ejemplo adicional: casting en expresiones
        double promedioIncorrecto = (100 + 200 + 150) / 3;
        double promedioCorrecto = (100 + 200 + 150) / 3.0;
        System.out.println("Ejemplo adicional - Promedio:");
        System.out.println("Sin casting: (100+200+150)/3 = " + promedioIncorrecto);
        System.out.println("Con decimal: (100+200+150)/3.0 = " + promedioCorrecto);
    }
}
