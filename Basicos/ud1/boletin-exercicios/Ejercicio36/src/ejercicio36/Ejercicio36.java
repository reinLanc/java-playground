package ejercicio36;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio36 {

    public static void main(String[] args) {
        // Hora actual (ejemplo: 21:30)
        int horas = 21;
        int minutos = 30;

        // Convertimos todo a segundos desde medianoche
        int segundosActuales = horas * 3600 + minutos * 60;

        // Un día tiene 86400 segundos (24 × 3600)
        int segundosEnUnDia = 24 * 3600;

        // Segundos que faltan para medianoche
        int segundosFaltantes = segundosEnUnDia - segundosActuales;

        System.out.println("Hora actual: " + horas + ":" + minutos);
        System.out.println("Segundos actuales: " + segundosActuales);
        System.out.println("Segundos hasta medianoche: " + segundosFaltantes);

        // Convertimos de nuevo a horas, minutos y segundos
        int horasFaltantes = segundosFaltantes / 3600;
        int minutosFaltantes = (segundosFaltantes % 3600) / 60;
        int segFaltantes = segundosFaltantes % 60;

        System.out.println("Faltan: " + horasFaltantes + "h " + minutosFaltantes + "m " + segFaltantes + "s");
    }
}

/* EXPLICACIÓN:
 * 1. Convertimos la hora actual a segundos
 * 2. Un día = 24h × 3600s = 86400 segundos
 * 3. Restamos: segundos_día - segundos_actuales
 * Ejemplo con 21:30:
 * - Segundos actuales: 21×3600 + 30×60 = 77400
 * - Faltan: 86400 - 77400 = 9000 segundos (2h 30m)
 */
