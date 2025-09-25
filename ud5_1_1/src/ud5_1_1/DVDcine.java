package ud5_1_1;

public class DVDcine {

    String titulo;
    String director;
    String protagonistas;
    int duracion;
    String resumen;
    String genero;

    DVDcine(
            String titulo,
            String director,
            String protagonistas,
            int duracion,
            String resumen,
            String genero) {
        this.titulo = titulo;
        this.director = director;
        this.protagonistas = protagonistas;
        this.genero = genero;
        this.duracion = duracion;
        this.resumen = resumen;
    }

    boolean esThriller() {
        return genero.equalsIgnoreCase("Thriller");
    }

    boolean tieneResumen() {
        return resumen.length() > 0;
    }

    String muestraDuracion() {
        return duracion + " min.";
    }

    String muestraDVDCine() {
        return titulo.toUpperCase()
                + "\nDe: " + director + "\nCon: " + protagonistas
                + "\n" + genero + "-" + muestraDuracion()
                + "\nResumen:\n" + resumen;
    }
}
