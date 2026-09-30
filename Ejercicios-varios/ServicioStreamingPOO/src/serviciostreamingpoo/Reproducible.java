package serviciostreamingpoo;


/**
 * Interfaz Reproducible
 * ======================
 * Define el contrato que deben cumplir todos los contenidos reproducibles.
 * Usamos una INTERFAZ (no herencia) porque el enunciado prohíbe expresamente
 * la herencia para los contenidos (punto 4a), pero necesitamos polimorfismo
 * para que play(Reproducible r) acepte tanto Cancion como Podcast.
 *
 * Métodos que toda clase reproducible debe implementar:
 *   - play()          : muestra la info del contenido en formato HH:MM:SS
 *   - getNombre()     : devuelve el nombre/título del contenido
 *   - getDuracion()   : devuelve la duración en segundos
 */
public interface Reproducible {

    /**
     * Reproduce el contenido: imprime su nombre y duración formateada. Cada
     * clase (Cancion, Podcast) implementa este método a su manera.
     */
    void play();

    /**
     * Devuelve el nombre o título del contenido. Se usa en
     * Usuario.play(Reproducible) para imprimir sin conocer el tipo exacto.
     */
    String getNombre();

    /**
     * Devuelve la duración del contenido en segundos. Se usa en
     * ListaReproduccion para calcular la duración total.
     */
    int getDuracion();

    /**
     * Método default: convierte segundos totales a formato HH:MM:SS. Al ser
     * default, todas las clases que implementen Reproducible heredan este
     * método sin necesidad de reescribirlo.
     *
     * Ejemplo: 3723 segundos -> "01:02:03"
     */
    default String formatearDuracion(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segs = segundos % 60;

        // Construimos manualmente con ceros a la izquierda sin usar format
        String hh = (horas < 10 ? "0" : "") + horas;
        String mm = (minutos < 10 ? "0" : "") + minutos;
        String ss = (segs < 10 ? "0" : "") + segs;

        return hh + ":" + mm + ":" + ss;
    }
}
