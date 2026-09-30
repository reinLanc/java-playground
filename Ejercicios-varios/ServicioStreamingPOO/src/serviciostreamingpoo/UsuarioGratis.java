/**
 * Clase UsuarioGratis
 * ====================
 * Usuario sin suscripción de pago. Tiene las siguientes restricciones:
 *   - Solo puede reproducir MAX_ESCUCHAS_DIA contenidos por día (punto 2a).
 *   - Lleva un registro de cuántas escuchas hizo cada día (punto 2b).
 *   - Si supera el límite, se lanza LimiteDiarioException (punto 2c).
 *   - Al reproducir, muestra el contenido + publicidad + el contenido de nuevo.
 *
 * Usa HashMap<LocalDate, Integer> para registrar escuchas por fecha. LocalDate
 * representa una fecha (año, mes, día) sin hora.
 */
package serviciostreamingpoo;

import java.time.LocalDate;
import java.util.HashMap;

/**
 *
 * @author Reinaldo Gil
 */
public class UsuarioGratis extends Usuario {

    // ?? Constante de límite diario ????????????????????????????????????????????
    /**
     * Número máximo de escuchas permitidas por día. Es static (pertenece a la
     * clase, no a cada instancia) y final (no se puede cambiar una vez
     * establecido). Punto 2a: "este valor límite estará registrado en la
     * aplicación".
     */
    public static final int MAX_ESCUCHAS_DIA = 5;

    // ?? Atributos ?????????????????????????????????????????????????????????????
    /**
     * Mapa que registra cuántas escuchas hizo el usuario en cada fecha. Clave:
     * LocalDate (la fecha del día) Valor: Integer (número de escuchas ese día)
     *
     * Punto 2b: "cada instancia sabrá para cada fecha cuántas escuchas hizo".
     */
    private HashMap<LocalDate, Integer> escuchasPorFecha;

    // ?? Constructores ?????????????????????????????????????????????????????????
    /**
     * Constructor con nombre y email.
     *
     * @param nombre nombre del usuario
     * @param email correo electrónico válido
     */
    public UsuarioGratis(String nombre, String email) {
        super(nombre, email);
        this.escuchasPorFecha = new HashMap<LocalDate, Integer>();
    }

    /**
     * Constructor solo con nombre.
     *
     * @param nombre nombre del usuario
     */
    public UsuarioGratis(String nombre) {
        super(nombre);
        this.escuchasPorFecha = new HashMap<LocalDate, Integer>();
    }

    // ?? Getters ????????????????????????????????????????????????????????????????
    /**
     * Devuelve cuántas escuchas ha hecho el usuario en una fecha concreta.
     *
     * @param fecha la fecha a consultar
     * @return número de escuchas ese día (0 si no hay registro)
     */
    public int getEscuchasEnFecha(LocalDate fecha) {
        // getOrDefault devuelve 0 si la fecha no existe en el mapa todavía
        return escuchasPorFecha.getOrDefault(fecha, 0);
    }

    // ?? Implementación de play() ???????????????????????????????????????????????
    /**
     * Reproduce un contenido como usuario gratuito (punto 2 y punto 4c).
     *
     * Proceso: 1. Obtiene la fecha de hoy con LocalDate.now(). 2. Comprueba
     * cuántas escuchas lleva hoy. 3. Si ya llegó al límite, lanza
     * LimiteDiarioException. 4. Si puede reproducir: muestra el contenido,
     * luego publicidad, luego el contenido de nuevo (comportamiento de usuario
     * gratis). 5. Registra la escucha en el HashMap y en el contador total.
     *
     * @param r el contenido a reproducir
     * @throws LimiteDiarioException si se supera el límite diario
     */
    @Override
    public void play(Reproducible r) throws LimiteDiarioException {
        LocalDate hoy = LocalDate.now();

        // Obtenemos las escuchas de hoy (0 si es la primera del día)
        int escuchasHoy = escuchasPorFecha.getOrDefault(hoy, 0);

        // Si ya llegamos al límite, lanzamos la excepción
        if (escuchasHoy >= MAX_ESCUCHAS_DIA) {
            throw new LimiteDiarioException(
                    "Limite diario alcanzado (" + MAX_ESCUCHAS_DIA + " escuchas). "
                    + "Espera a manyana o suscribete para escuchar mas.");
        }

        // Reproducción con publicidad (formato de usuario gratis - punto 4c)
        r.play();                           // primera reproducción
        System.out.println("  Publicidad"); // bloque de publicidad
        r.play();                           // segunda reproducción tras el anuncio

        // Registramos la escucha: incrementamos el contador del día de hoy
        escuchasPorFecha.put(hoy, escuchasHoy + 1);

        // Incrementamos el contador total de reproducciones (de la clase padre)
        incrementarReproducciones();
    }

    // ?? toString ??????????????????????????????????????????????????????????????
    /**
     * Muestra nombre, reproducciones totales y escuchas de hoy.
     */
    @Override
    public String toString() {
        int escuchasHoy = escuchasPorFecha.getOrDefault(LocalDate.now(), 0);
        return super.toString()
                + " | Tipo: GRATIS"
                + " | Escuchas hoy: " + escuchasHoy + "/" + MAX_ESCUCHAS_DIA;
    }
}
