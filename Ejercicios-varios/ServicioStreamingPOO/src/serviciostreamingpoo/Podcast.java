/**
 * Clase Podcast
 * ==============
 * Representa un podcast reproducible.
 * Implementa Reproducible sin extender ninguna clase base
 * (punto 4a: sin herencia para contenidos).
 *
 * Atributos:
 *   - nombre   : nombre del podcast (String)
 *   - tema     : tema o categoría del podcast (String)
 *   - duracion : duración en segundos (int)
 */
package serviciostreamingpoo;

/**
 *
 * @author Reinaldo Gil
 */
public class Podcast implements Reproducible {

    private String nombre;
    private String tema;
    private int duracion; // en segundos

    /**
     * Constructor con todos los datos del podcast.
     *
     * @param nombre nombre del podcast
     * @param tema tema o categoría
     * @param duracion duración en segundos
     */
    public Podcast(String nombre, String tema, int duracion) {
        this.nombre = nombre;
        this.tema = tema;
        this.duracion = duracion;
    }

    // ?? Getters ????????????????????????????????????????????????????????????????
    public String getTema() {
        return tema;
    }

    /**
     * Implementación de getNombre() exigida por Reproducible.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Implementación de getDuracion() exigida por Reproducible.
     */
    @Override
    public int getDuracion() {
        return duracion;
    }

    /**
     * Implementación de play() exigida por Reproducible. Imprime el tipo
     * ("podcast"), el nombre, el tema y la duración en HH:MM:SS.
     */
    @Override
    public void play() {
        System.out.println("Reproduciendo podcast: " + nombre
                + ". Tema: " + tema
                + ". Duracion " + formatearDuracion(duracion));
    }

    /**
     * toString() para depuración y listados.
     */
    @Override
    public String toString() {
        return "Podcast [" + nombre + " | " + tema + " | " + formatearDuracion(duracion) + "]";
    }
}
