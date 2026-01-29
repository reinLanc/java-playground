package ejerciciolibro5;

/**
 *
 * @author Reinaldo Gil
 */
public class Disco {

    /**
     * Clase Disco: representa un disco con título, artista y género
     */
    private String titulo;
    private String artista;
    private String genero;

    /**
     * Constructor de la clase Disco
     */
    public Disco(String titulo, String artista, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    /**
     * Devuelve una representación en String del disco
     */
    @Override
    public String toString() {
        return "Título: " + titulo + " | Artista: " + artista + " | Género: " + genero;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }
}
