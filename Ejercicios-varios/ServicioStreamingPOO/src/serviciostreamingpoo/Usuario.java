/**
 * Clase abstracta Usuario
 * ========================
 * Clase base para todos los tipos de usuario de la aplicación.
 * Es abstracta porque no tiene sentido crear un "usuario genérico":
 * siempre será o UsuarioGratis o UsuarioPago.
 *
 * Responsabilidades de esta clase:
 *   - Almacenar nombre y email (con validación).
 *   - Contar el total de reproducciones.
 *   - Gestionar las listas de reproducción.
 *   - Declarar play(Reproducible) como método abstracto para que
 *     cada subclase lo implemente a su manera (punto 1c: SIN interfaces).
 *   - Implementar play(ListaReproduccion) con sobrecarga (punto 6).
 */
package serviciostreamingpoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Reinaldo Gil
 */
public abstract class Usuario {

    //Atributos 
    private String nombre;
    private String email;

    // Contador de reproducciones totales (punto 4b)
    private int totalReproducciones;

    // Cada usuario puede tener varias listas de reproducción (punto 5)
    private ArrayList<ListaReproduccion> listas;

    // Constructores 
    /**
     * Constructor con nombre y email. Valida el email antes de asignarlo.
     *
     * @param nombre nombre del usuario
     * @param email correo electrónico (debe tener formato texto@texto.ext)
     * @throws IllegalArgumentException si el email no es válido
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        setEmail(email); // usamos el setter para que valide
        this.totalReproducciones = 0;
        this.listas = new ArrayList<>();
    }

    /**
     * Constructor solo con nombre (email vacío por defecto). Permite crear un
     * usuario sin email y asignarlo después con setEmail().
     *
     * @param nombre nombre del usuario
     */
    public Usuario(String nombre) {
        this(nombre, "sinEmail@pendiente.com"); // delegamos al otro constructor
    }

    // ?? Getters y Setters ?????????????????????????????????????????????????????
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del email con validación. Reglas (punto 1a): 1. Debe contener una
     * arroba (@). 2. Debe haber texto antes de la arroba. 3. Debe haber texto
     * después de la arroba. 4. El texto después de la arroba debe contener un
     * punto.
     *
     * @param email correo a validar y asignar
     * @throws IllegalArgumentException si el formato no es válido
     */
    public void setEmail(String email) {
        if (!emailValido(email)) {
            throw new IllegalArgumentException("Email no valido: " + email);
        }
        this.email = email;
    }

    // ?? Validación del email ???????????????????????????????????????????????????
    /**
     * Comprueba si un email tiene formato válido. Formato requerido:
     * texto@texto.extensión
     *
     * @param email cadena a validar
     * @return true si el email es válido
     */
    private boolean emailValido(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        // Buscamos la posición de la arroba
        int posArroba = email.indexOf('@');

        // Debe existir una arroba (posArroba != -1) y debe haber texto antes
        if (posArroba <= 0) {
            return false;
        }

        // Extraemos la parte que hay después de la arroba
        String parteDespues = email.substring(posArroba + 1);

        // Debe haber texto después de la arroba y ese texto debe contener un punto
        // El punto además no puede ser el último carácter (debe haber extensión)
        int posPunto = parteDespues.indexOf('.');
        if (posPunto <= 0 || posPunto == parteDespues.length() - 1) {
            return false;
        }

        return true;
    }

    // ?? Lógica de reproducciones ?????????????????????????????????????????????
    /**
     * Incrementa el contador de reproducciones totales. Las subclases llaman a
     * este método desde su implementación de play().
     */
    protected void incrementarReproducciones() {
        totalReproducciones++;
    }

    /**
     * Método abstracto play(Reproducible). Cada subclase lo implementa de forma
     * diferente: - UsuarioGratis: añade publicidad y controla el límite diario.
     * - UsuarioPago: reproduce directamente sin restricciones.
     *
     * NOTA: resuelto con herencia/polimorfismo, NO con interfaces (punto 1c).
     *
     * @param r el contenido a reproducir
     * @throws LimiteDiarioException si el usuario gratuito supera su límite
     */
    public abstract void play(Reproducible r) throws LimiteDiarioException;

    /**
     * Sobrecarga de play() que acepta una lista de reproducción (punto 6). Si
     * la lista está vacía imprime aviso; si no, reproduce elemento a elemento.
     *
     * Al estar aquí en la clase base, tanto UsuarioGratis como UsuarioPago
     * heredan este comportamiento sin necesidad de duplicar código.
     *
     * @param lista la lista de reproducción a reproducir
     */
    public void play(ListaReproduccion lista) {
        if (lista.estaVacia()) {
            System.out.println("La lista de reproduccion esta vacia.");
            return;
        }

        System.out.println("Reproduciendo lista: " + lista.getNombre());
        for (Reproducible r : lista.getContenidos()) {
            try {
                play(r); // llamamos al play de cada subclase
            } catch (LimiteDiarioException e) {
                // Si el usuario gratuito supera el límite, paramos la reproducción
                System.out.println("Reproduccion detenida: " + e.getMessage());
                return;
            }
        }
    }

    // ?? Gestión de listas de reproducción ????????????????????????????????????
    /**
     * Añade un contenido reproducible a la lista identificada por su nombre. Si
     * no existe ninguna lista con ese nombre, informa al usuario (punto 5a).
     *
     * @param nombreLista nombre de la lista de reproducción destino
     * @param r el contenido a añadir
     */
    public void anyadirALista(String nombreLista, Reproducible r) {
        // Buscamos la lista por nombre
        for (ListaReproduccion lista : listas) {
            if (lista.getNombre().equals(nombreLista)) {
                lista.anyadir(r);
                System.out.println("Anyadido \"" + r.getNombre() + "\" a la lista \"" + nombreLista + "\".");
                return;
            }
        }
        // Si llegamos aquí, no se encontró la lista
        System.out.println("No existe ninguna lista llamada \"" + nombreLista + "\".");
    }

    /**
     * Crea y registra una nueva lista de reproducción con el nombre dado.
     *
     * @param nombreLista nombre de la nueva lista
     */
    public void crearLista(String nombreLista) {
        listas.add(new ListaReproduccion(nombreLista));
        System.out.println("Lista \"" + nombreLista + "\" creada.");
    }

    /**
     * Muestra todas las listas de reproducción del usuario ordenadas por
     * duración total de menor a mayor (punto 5b).
     *
     * Usa Collections.sort con un Comparator anónimo para ordenar.
     */
    public void verListasReproduccion() {
        if (listas.isEmpty()) {
            System.out.println(nombre + " no tiene listas de reproduccion.");
            return;
        }

        // Copiamos las listas para no alterar el orden original
        ArrayList<ListaReproduccion> ordenadas = new ArrayList<ListaReproduccion>(listas);

        // Ordenamos por duración total ascendente con un Comparator
        Collections.sort(ordenadas, new Comparator<ListaReproduccion>() {
            @Override
            public int compare(ListaReproduccion a, ListaReproduccion b) {
                return a.getDuracionTotal() - b.getDuracionTotal();
            }
        });

        System.out.println("Listas de reproduccion de " + nombre + " (ordenadas por duracion):");
        for (ListaReproduccion lista : ordenadas) {
            System.out.println("  " + lista);
        }
    }

    // ?? toString ??????????????????????????????????????????????????????????????
    /**
     * Al imprimir un usuario con println(usuario) muestra su nombre y el número
     * total de reproducciones realizadas (punto 4b).
     */
    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Reproducciones: " + totalReproducciones;
    }
}
