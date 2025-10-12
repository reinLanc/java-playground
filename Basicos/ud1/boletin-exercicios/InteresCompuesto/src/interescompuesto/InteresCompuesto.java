/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interescompuesto;

/**
 *
 * @author Reinaldo Gil
 */
public class InteresCompuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos de la inversi�n
        double capitalInicial = 5000.0;
        final double TASA_ANUAL = 0.045; // 4.5%
        final double TASA_MENSUAL = TASA_ANUAL / 12;

        // C�lculo mes a mes (sin bucles)
        double mes1 = capitalInicial * (1 + TASA_MENSUAL);
        double mes2 = mes1 * (1 + TASA_MENSUAL);
        double mes3 = mes2 * (1 + TASA_MENSUAL);

        double mes4 = mes3 * (1 + TASA_MENSUAL);
        double mes5 = mes4 * (1 + TASA_MENSUAL);
        double mes6 = mes5 * (1 + TASA_MENSUAL);

        double mes7 = mes6 * (1 + TASA_MENSUAL);
        double mes8 = mes7 * (1 + TASA_MENSUAL);
        double mes9 = mes8 * (1 + TASA_MENSUAL);

        double mes10 = mes9 * (1 + TASA_MENSUAL);
        double mes11 = mes10 * (1 + TASA_MENSUAL);
        double mes12 = mes11 * (1 + TASA_MENSUAL);

        // Beneficio obtenido
        double beneficioCompuesto = mes12 - capitalInicial;

        // C�lculo de inter�s simple para comparar
        double interesSimple = capitalInicial * TASA_ANUAL;
        double capitalFinalSimple = capitalInicial + interesSimple;

        // Diferencia entre inter�s compuesto y simple
        double diferenciaIntereses = beneficioCompuesto - interesSimple;

        // Mostrar resultados
        System.out.println("=== C�LCULO DE INTER�S COMPUESTO ===");
        System.out.println();
        System.out.println("Datos de la inversi�n:");
        System.out.println("Capital inicial: " + capitalInicial + " �");
        System.out.println("Tasa de inter�s anual: " + (TASA_ANUAL * 100) + "%");
        System.out.println("Tasa de inter�s mensual: " + (TASA_MENSUAL * 100) + "%");
        System.out.println("Per�odo: 12 meses (1 a�o)");
        System.out.println();

        System.out.println("Evoluci�n trimestral:");
        System.out.println("Trimestre 1 (mes 3): " + mes3 + " �");
        System.out.println("Trimestre 2 (mes 6): " + mes6 + " �");
        System.out.println("Trimestre 3 (mes 9): " + mes9 + " �");
        System.out.println("Trimestre 4 (mes 12): " + mes12 + " �");
        System.out.println();

        System.out.println("Resultados finales:");
        System.out.println("Capital final (inter�s compuesto): " + mes12 + " �");
        System.out.println("Beneficio obtenido: " + beneficioCompuesto + " �");
        System.out.println();

        System.out.println("Comparaci�n con inter�s simple:");
        System.out.println("Capital final (inter�s simple): " + capitalFinalSimple + " �");
        System.out.println("Inter�s simple: " + interesSimple + " �");
        System.out.println();

        System.out.println("Ganancia adicional del inter�s compuesto: " + diferenciaIntereses + " �");
    }

}
