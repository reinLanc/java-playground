/*
Enunciado
Crea un programa que demuestre diferentes tipos de conversiones y casting:

Declara: int entero = 100, double decimal = 9.75, byte peque�o = 50
Realiza las siguientes operaciones y conversiones:

Conversi�n autom�tica de int a double
Casting de double a int (observa la p�rdida de decimales)
Casting de int a byte
Operaci�n mixta: int + double (observa la promoci�n)
Divisi�n entera vs divisi�n decimal: 7/2 vs 7.0/2
Demostraci�n de overflow: byte = 130 (con casting)

Muestra los resultados y explica qu� ocurre en cada caso
 */
package conversionescast;

/**
 *
 * @author Reinaldo Gil
 */
public class ConversionesCast {

    public static void main(String[] args) {
        // Declaraci�n de variables
        int entero = 100;
        double decimal = 9.75;
        byte pequeno = 50;

        System.out.println("=== CONVERSIONES DE TIPO Y CASTING ===");
        System.out.println();
        System.out.println("Variables iniciales:");
        System.out.println("int entero = " + entero);
        System.out.println("double decimal = " + decimal);
        System.out.println("byte peque�o = " + pequeno);
        System.out.println();

        // 1. Conversi�n autom�tica de int a double
        double enteroADouble = entero;
        System.out.println("1. Conversi�n autom�tica int ? double:");
        System.out.println("   " + entero + " ? " + enteroADouble);
        System.out.println("   (No hay p�rdida de informaci�n)");
        System.out.println();

        // 2. Casting de double a int
        int decimalAEntero = (int) decimal;
        System.out.println("2. Casting expl�cito double ? int:");
        System.out.println("   " + decimal + " ? " + decimalAEntero);
        System.out.println("   (Se pierde la parte decimal)");
        System.out.println();

        // 3. Casting de int a byte
        byte enteroAByte = (byte) entero;
        System.out.println("3. Casting int ? byte:");
        System.out.println("   " + entero + " ? " + enteroAByte);
        System.out.println("   (Valor dentro del rango de byte)");
        System.out.println();

        // 4. Operaci�n mixta (promoci�n autom�tica)
        double resultadoMixto = entero + decimal;
        System.out.println("4. Operaci�n mixta (int + double):");
        System.out.println("   " + entero + " + " + decimal + " = " + resultadoMixto);
        System.out.println("   (El int se promociona a double)");
        System.out.println();

        // 5. Divisi�n entera vs decimal
        int divisionEntera = 7 / 2;
        double divisionDecimal = 7.0 / 2;
        System.out.println("5. Divisi�n entera vs decimal:");
        System.out.println("   7 / 2 = " + divisionEntera + " (divisi�n entera)");
        System.out.println("   7.0 / 2 = " + divisionDecimal + " (divisi�n decimal)");
        System.out.println();

        // 6. Demostraci�n de overflow
        byte byteOverflow = (byte) 130;
        System.out.println("6. Overflow en byte:");
        System.out.println("   (byte)130 = " + byteOverflow);
        System.out.println("   (130 est� fuera del rango de byte: -128 a 127)");
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
