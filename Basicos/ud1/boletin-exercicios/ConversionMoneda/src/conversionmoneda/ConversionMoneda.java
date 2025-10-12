/*
Ejercicio 1: Calculadora de Cambio de Moneda
Enunciado
Crea un programa que convierta una cantidad en euros a d�lares, libras esterlinas y yenes japoneses.

Tipo de cambio: 1 EUR = 1.18 USD, 1 EUR = 0.85 GBP, 1 EUR = 130.50 JPY
Declara una constante para cada tipo de cambio
Usa una variable con una cantidad en euros (por ejemplo, 150.75 euros)
Calcula y muestra el equivalente en cada moneda
Muestra tambi�n cu�nto dinero total tendr�a si sumara todas las conversiones en sus respectivas monedas
 */
package conversionmoneda;

/**
 *
 * @author Reinaldo Gil
 */
public class ConversionMoneda {

    public static void main(String[] args) {
        // Declaraci�n de constantes para tipos de cambio
        final double EUR_A_USD = 1.18;
        final double EUR_A_GBP = 0.85;
        final double EUR_A_JPY = 130.50;

        // Cantidad en euros a convertir
        double cantidadEuros = 150.75;

        // Conversiones
        double cantidadDolares = cantidadEuros * EUR_A_USD;
        double cantidadLibras = cantidadEuros * EUR_A_GBP;
        double cantidadYenes = cantidadEuros * EUR_A_JPY;

        // Mostrar resultados
        System.out.println("=== CONVERSOR DE MONEDA ===");
        System.out.println("Cantidad original: " + cantidadEuros + " EUR");
        System.out.println();
        System.out.println("Conversiones:");
        System.out.println("En d�lares (USD): " + cantidadDolares);
        System.out.println("En libras (GBP): " + cantidadLibras);
        System.out.println("En yenes (JPY): " + cantidadYenes);
        System.out.println();

        // Suma simb�lica (aunque no tiene sentido sumar diferentes monedas)
        double sumaSimbolica = cantidadDolares + cantidadLibras + cantidadYenes;
        System.out.println("Suma simb�lica de todas las cantidades: " + sumaSimbolica);
        System.out.println("(Nota: Esta suma no tiene sentido real ya que son monedas diferentes)");
    }

}
