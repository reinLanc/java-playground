/*
Ejercicio 8: Cálculo de Tiempo y Conversiones
Enunciado
Desarrolla un programa que convierta una cantidad de segundos a horas, minutos y segundos:

Tiempo total en segundos: 7265 segundos
Calcula:

Cuántas horas completas hay
Cuántos minutos completos quedan (después de extraer las horas)
Cuántos segundos quedan (después de extraer horas y minutos)


Usa el operador módulo (%) y división entera
Muestra el resultado en formato: "X horas, Y minutos, Z segundos"
Calcula también cuántos días completos representan esos segundos
 */
package conversiontiempo;

/**
 *
 * @author Reinaldo Gil
 */
public class ConversionTiempo {

    public static void main(String[] args) {
        // Constantes de conversión
        final int SEGUNDOS_POR_MINUTO = 60;
        final int SEGUNDOS_POR_HORA = 3600;
        final int SEGUNDOS_POR_DIA = 86400;

        // Tiempo total en segundos
        int tiempoTotalSegundos = 7265;

        // Cálculo de días
        int dias = tiempoTotalSegundos / SEGUNDOS_POR_DIA;
        int segundosRestantesDias = tiempoTotalSegundos % SEGUNDOS_POR_DIA;

        // Cálculo de horas
        int horas = tiempoTotalSegundos / SEGUNDOS_POR_HORA;
        int segundosRestantesHoras = tiempoTotalSegundos % SEGUNDOS_POR_HORA;

        // Cálculo de minutos (sobre los segundos que quedan después de extraer horas)
        int minutos = segundosRestantesHoras / SEGUNDOS_POR_MINUTO;

        // Segundos finales (lo que queda después de extraer horas y minutos)
        int segundos = segundosRestantesHoras % SEGUNDOS_POR_MINUTO;

        // Mostrar resultados
        System.out.println("=== CONVERSIÓN DE TIEMPO ===");
        System.out.println();
        System.out.println("Tiempo total: " + tiempoTotalSegundos + " segundos");
        System.out.println();

        System.out.println("Conversión:");
        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
        System.out.println();

        System.out.println("Equivalente en días:");
        System.out.println(dias + " días completos");
        System.out.println("(Resto: " + segundosRestantesDias + " segundos)");
        System.out.println();

        // Demostración de las operaciones
        System.out.println("Explicación de cálculos:");
        System.out.println("Horas = " + tiempoTotalSegundos + " / " + SEGUNDOS_POR_HORA + " = " + horas);
        System.out.println("Resto tras horas = " + tiempoTotalSegundos + " % " + SEGUNDOS_POR_HORA + " = " + segundosRestantesHoras);
        System.out.println("Minutos = " + segundosRestantesHoras + " / " + SEGUNDOS_POR_MINUTO + " = " + minutos);
        System.out.println("Segundos finales = " + segundosRestantesHoras + " % " + SEGUNDOS_POR_MINUTO + " = " + segundos);
    }

}
