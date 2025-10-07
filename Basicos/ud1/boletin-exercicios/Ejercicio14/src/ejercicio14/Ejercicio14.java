package ejercicio14;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int segundosTotales = 186455;

        // Calculamos días (1 día = 86400 segundos)
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
        System.out.println(dias + " días");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }
}

/* EXPLICACIÓN:
 * División entera (/) nos da el cociente
 * Módulo (%) nos da el resto
 * 186455 segundos = 2 días, 3 horas, 47 minutos y 35 segundos
 */
