/**
 * Clase ListaReproduccion
 * ========================
 * Representa una lista de reproducción identificada por un nombre.
 * Puede contener canciones y podcasts (cualquier objeto Reproducible),
 * en orden y con posibles repeticiones.
 *
 * Atributos:
 *   - nombre     : identificador de la lista (String)
 *   - contenidos : lista ordenada de elementos reproducibles (ArrayList<Reproducible>)
 */
package serviciostreamingpoo;

import java.util.ArrayList;

/**
 *
 * @author Reinaldo Gil
 */
public class ListaReproduccion {

    private String nombre;
    private ArrayList<Reproducible> contenidos;

    /**
     * Constructor: crea una lista vacía con el nombre dado.
     *
     * @param nombre nombre identificador de la lista
     */
    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    // ?? Getters ????????????????????????????????????????????????????????????????
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Reproducible> getContenidos() {
        return contenidos;
    }

    // ?? Lógica ????????????????????????????????????????????????????????????????
    /**
     * Añade un elemento reproducible al final de la lista. Los elementos tienen
     * orden y pueden repetirse (ArrayList permite duplicados).
     *
     * @param r el contenido a añadir (Cancion o Podcast)
     */
    public void anyadir(Reproducible r) {
        contenidos.add(r);
    }

    /**
     * Comprueba si la lista está vacía.
     *
     * @return true si no tiene ningún elemento
     */
    public boolean estaVacia() {
        return contenidos.isEmpty();
    }

    /**
     * Calcula la duración total sumando la duración de todos los elementos. Se
     * usa para ordenar las listas por duración en verListasReproduccion().
     *
     * @return suma de duraciones en segundos
     */
    public int getDuracionTotal() {
        int total = 0;
        for (Reproducible r : contenidos) {
            total += r.getDuracion();
        }
        return total;
    }

    /**
     * Convierte segundos a formato HH:MM:SS para mostrar la duración total.
     * Mismo algoritmo que en la interfaz Reproducible, pero aplicado aquí sobre
     * la duración total de la lista.
     */
    private String formatearDuracion(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segs = segundos % 60;

        String hh = (horas < 10 ? "0" : "") + horas;
        String mm = (minutos < 10 ? "0" : "") + minutos;
        String ss = (segs < 10 ? "0" : "") + segs;

        return hh + ":" + mm + ":" + ss;
    }

    /**
     * toString(): imprime el nombre de la lista y su duración total.
     */
    @Override
    public String toString() {
        return "Lista \"" + nombre + "\" | Duracion total: " + formatearDuracion(getDuracionTotal());
    }
}
