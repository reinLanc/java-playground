import java.util.Scanner;

/**
 * Problema: Reloj Espejo
 *
 * Dado que el espejo invierte horizontalmente la esfera del reloj,
 * cualquier hora vista en el espejo y su hora real suman siempre 720 minutos (12 horas).
 *
 * Fórmula clave:
 *   minutos_reales = 720 - minutos_espejo
 *
 * Caso especial: si el resultado es 0, la hora real es 12:00 (= 720 minutos)
 */
public class RelojEspejo {

    /**
     * Convierte la hora vista en el espejo a la hora real.
     *
     * Ejemplo:
     *   Entrada: "08:05"  ->  485 minutos en espejo
     *   Calculo: 720 - 485 = 235 minutos reales
     *   Salida:  "03:55"
     *
     * @param horaEspejo hora en formato "HH:MM" tal como se ve en el espejo
     * @return           hora real en formato "HH:MM"
     */
    static String resolverEspejo(String horaEspejo) {

        // PASO 1: Separar la cadena "HH:MM" en dos partes usando ":" como separador
        String[] partes = horaEspejo.split(":");
        int horas   = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        // PASO 2: Convertir la hora del espejo a minutos totales
        // Ejemplo: 08:05 -> 8*60 + 5 = 485 minutos
        int minutosEspejo = horas * 60 + minutos;

        // PASO 3: Calcular los minutos de la hora real restando de 720
        // El % 720 protege el caso en que la resta da exactamente 720 (que equivale a 0)
        int minutosReales = (720 - minutosEspejo) % 720;

        // PASO 4: Caso especial para las 12:00
        // Si minutosReales es 0, no existe "00:00" en un reloj de 12 horas, es 12:00
        if (minutosReales == 0) {
            minutosReales = 720; // 12 horas * 60 minutos = 720
        }

        // PASO 5: Convertir los minutos totales de vuelta a horas y minutos
        int horasReales    = minutosReales / 60; // División entera -> horas
        int minutosFinales = minutosReales % 60; // Resto           -> minutos

        // PASO 6: Construir la cadena de salida con ceros a la izquierda si hace falta
        // Usamos String.format para garantizar siempre dos dígitos (ej: "03:05" no "3:5")
        return String.format("%02d:%02d", horasReales, minutosFinales);
    }

    public static void main(String[] args) {

        // Creamos el Scanner con el nombre requerido: "teclado"
        Scanner teclado = new Scanner(System.in);

        // Leemos el número de casos de prueba
        int n = teclado.nextInt();
        teclado.nextLine(); // Consumimos el salto de línea que queda tras nextInt()

        // Procesamos cada caso de prueba
        for (int i = 0; i < n; i++) {

            // Leemos la hora tal como se ve en el espejo, en formato "HH:MM"
            String horaEspejo = teclado.nextLine().trim();

            // Calculamos y mostramos la hora real
            String horaReal = resolverEspejo(horaEspejo);
            System.out.println(horaReal);
        }
    }
}
