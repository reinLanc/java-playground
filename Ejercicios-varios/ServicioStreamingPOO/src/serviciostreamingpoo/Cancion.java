
package serviciostreamingpoo;

/**
 * Clase Cancion
 * ==============
 * Representa una canción reproducible.
 * Implementa Reproducible en lugar de extender una clase base,
 * tal como exige el enunciado (punto 4a: sin herencia para contenidos).
 *
 * Atributos:
 *   - titulo   : nombre de la canción (String)
 *   - grupo    : nombre del artista o grupo (String)
 *   - duracion : duración en segundos (int)
 */
public class Cancion implements Reproducible {
    
    private String titulo;
    private String grupo;
    private int    duracion; // en segundos
 
    /**
     * Constructor con todos los datos de la canción.
     *
     * @param titulo   título de la canción
     * @param grupo    nombre del artista o grupo
     * @param duracion duración en segundos
     */
    public Cancion(String titulo, String grupo, int duracion) {
        this.titulo   = titulo;
        this.grupo    = grupo;
        this.duracion = duracion;
    }
 
    // ?? Getters ????????????????????????????????????????????????????????????????
 
    public String getTitulo()   { return titulo;   }
    public String getGrupo()    { return grupo;     }
 
    /**
     * Implementación de getNombre() exigida por Reproducible.
     * Para una canción, el nombre es su título.
     */
    @Override
    public String getNombre() {
        return titulo;
    }
 
    /**
     * Implementación de getDuracion() exigida por Reproducible.
     */
    @Override
    public int getDuracion() {
        return duracion;
    }
 
    /**
     * Implementación de play() exigida por Reproducible.
     * Imprime el tipo ("canción"), el título, el grupo y la duración en HH:MM:SS.
     * El método formatearDuracion() se hereda de la interfaz (método default).
     */
    @Override
    public void play() {
        System.out.println("Reproduciendo cancion: " + titulo
                + " - " + grupo
                + ". Duracion " + formatearDuracion(duracion));
    }
 
    /**
     * toString() para depuración y listados.
     */
    @Override
    public String toString() {
        return "Cancion [" + titulo + " | " + grupo + " | " + formatearDuracion(duracion) + "]";
    }
}
