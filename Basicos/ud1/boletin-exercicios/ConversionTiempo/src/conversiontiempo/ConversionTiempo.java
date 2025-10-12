/*
Ejercicio 8: C�lculo de Tiempo y Conversiones
Enunciado
Desarrolla un programa que convierta una cantidad de segundos a horas, minutos y segundos:

Tiempo total en segundos: 7265 segundos
Calcula:

Cu�ntas horas completas hay
Cu�ntos minutos completos quedan (despu�s de extraer las horas)
Cu�ntos segundos quedan (despu�s de extraer horas y minutos)


Usa el operador m�dulo (%) y divisi�n entera
Muestra el resultado en formato: "X horas, Y minutos, Z segundos"
Calcula tambi�n cu�ntos d�as completos representan esos segundos
 */
package conversiontiempo;

/**
 *
 * @author Reinaldo Gil
 */
public class ConversionTiempo {

    public static void main(String[] args) {
        // Constantes de conversi�n
        final int SEGUNDOS_POR_MINUTO = 60;
        final int SEGUNDOS_POR_HORA = 3600;
        final int SEGUNDOS_POR_DIA = 86400;

        // Tiempo total en segundos
        int tiempoTotalSegundos = 7265;

        // C�lculo de d�as
        int dias = tiempoTotalSegundos / SEGUNDOS_POR_DIA;
        int segundosRestantesDias = tiempoTotalSegundos % SEGUNDOS_POR_DIA;

        // C�lculo de horas
        int horas = tiempoTotalSegundos / SEGUNDOS_POR_HORA;
        int segundosRestantesHoras = tiempoTotalSegundos % SEGUNDOS_POR_HORA;

        // C�lculo de minutos (sobre los segundos que quedan despu�s de extraer horas)
        int minutos = segundosRestantesHoras / SEGUNDOS_POR_MINUTO;

        // Segundos finales (lo que queda despu�s de extraer horas y minutos)
        int segundos = segundosRestantesHoras % SEGUNDOS_POR_MINUTO;

        // Mostrar resultados
        System.out.println("=== CONVERSI�N DE TIEMPO ===");
        System.out.println();
        System.out.println("Tiempo total: " + tiempoTotalSegundos + " segundos");
        System.out.println();

        System.out.println("Conversi�n:");
        System.out.println(horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
        System.out.println();

        System.out.println("Equivalente en d�as:");
        System.out.println(dias + " d�as completos");
        System.out.println("(Resto: " + segundosRestantesDias + " segundos)");
        System.out.println();

        // Demostraci�n de las operaciones
        System.out.println("Explicaci�n de c�lculos:");
        System.out.println("Horas = " + tiempoTotalSegundos + " / " + SEGUNDOS_POR_HORA + " = " + horas);
        System.out.println("Resto tras horas = " + tiempoTotalSegundos + " % " + SEGUNDOS_POR_HORA + " = " + segundosRestantesHoras);
        System.out.println("Minutos = " + segundosRestantesHoras + " / " + SEGUNDOS_POR_MINUTO + " = " + minutos);
        System.out.println("Segundos finales = " + segundosRestantesHoras + " % " + SEGUNDOS_POR_MINUTO + " = " + segundos);
    }

}
