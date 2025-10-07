package ejercicio14;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int segundosTotales = 186455;

        // Calculamos d�as (1 d�a = 86400 segundos)
        int dias = segundosTotales / 86400;
        int resto = segundosTotales % 86400;

        // Calculamos horas (1 hora = 3600 segundos)
        int horas = resto / 3600;
        resto = resto % 3600;

        // Calculamos minutos (1 minuto = 60 segundos)
        int minutos = resto / 60;

        // Calculamos segundos restantes
        int segundos = resto % 60;

        System.out.println(segundosTotales + " segundos son:");
        System.out.println(dias + " d�as");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }
}

/* EXPLICACI�N:
 * Divisi�n entera (/) nos da el cociente
 * M�dulo (%) nos da el resto
 * 186455 segundos = 2 d�as, 3 horas, 47 minutos y 35 segundos
 */
