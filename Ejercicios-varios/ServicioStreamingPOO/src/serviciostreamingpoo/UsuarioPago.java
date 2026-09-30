/**
 * Clase UsuarioPago
 * ==================
 * Usuario con suscripción de pago. Puede reproducir contenido sin límite
 * y sin publicidad. Requiere obligatoriamente un número de cuenta bancaria
 * válido (punto 3b: "no puede haber un usuario registrado sin número de cuenta").
 *
 * El número de cuenta tiene 4 partes (todas String - punto 3a):
 *   - entidad : 4 dígitos
 *   - oficina : 4 dígitos
 *   - dc      : 2 dígitos (dígitos de control)
 *   - cuenta  : 10 dígitos
 *
 * La validación se delega en la clase ValidadorCuenta (biblioteca de clases).
 */
package serviciostreamingpoo;

/**
 *
 * @author Reinaldo Gil
 */
public class UsuarioPago extends Usuario {

    // ?? Atributos del número de cuenta ???????????????????????????????????????
    private String entidad; // 4 dígitos
    private String oficina; // 4 dígitos
    private String dc;      // 2 dígitos de control
    private String cuenta;  // 10 dígitos

    // ?? Constructores ?????????????????????????????????????????????????????????
    /**
     * Constructor con nombre, email y número de cuenta completo. Valida el
     * número de cuenta antes de asignarlo. Si no es válido lanza
     * IllegalArgumentException (punto 3b: nunca sin cuenta).
     *
     * @param nombre nombre del usuario
     * @param email correo electrónico válido
     * @param entidad campo entidad (4 dígitos)
     * @param oficina campo oficina (4 dígitos)
     * @param dc dígitos de control (2 dígitos)
     * @param cuenta número de cuenta (10 dígitos)
     * @throws IllegalArgumentException si la cuenta no supera la validación
     */
    public UsuarioPago(String nombre, String email,
            String entidad, String oficina, String dc, String cuenta) {
        super(nombre, email);
        setCuenta(entidad, oficina, dc, cuenta); // validamos en el setter
    }

    /**
     * Constructor solo con nombre y cuenta (sin email explícito).
     *
     * @param nombre nombre del usuario
     * @param entidad campo entidad (4 dígitos)
     * @param oficina campo oficina (4 dígitos)
     * @param dc dígitos de control (2 dígitos)
     * @param cuenta número de cuenta (10 dígitos)
     */
    public UsuarioPago(String nombre,
            String entidad, String oficina, String dc, String cuenta) {
        super(nombre); // usa el constructor de un solo parámetro de Usuario
        setCuenta(entidad, oficina, dc, cuenta);
    }

    // ?? Getter y Setter de cuenta ?????????????????????????????????????????????
    /**
     * Devuelve el número de cuenta formateado. Ejemplo:
     * "0049-2265-91-2300369715"
     */
    public String getNumeroCuenta() {
        return ValidadorCuenta.formatear(entidad, oficina, dc, cuenta);
    }

    /**
     * Asigna y valida el número de cuenta. Se llama desde el constructor para
     * garantizar que nunca haya un UsuarioPago sin cuenta válida (punto 3b).
     *
     * @throws IllegalArgumentException si la validación falla
     */
    public void setCuenta(String entidad, String oficina, String dc, String cuenta) {
        if (!ValidadorCuenta.validar(entidad, oficina, dc, cuenta)) {
            throw new IllegalArgumentException(
                    "Numero de cuenta no valido. Formato: 4-4-2-10 digitos. "
                    + "Recibido: " + entidad + "-" + oficina + "-" + dc + "-" + cuenta);
        }
        this.entidad = entidad;
        this.oficina = oficina;
        this.dc = dc;
        this.cuenta = cuenta;
    }

    // ?? Implementación de play() ???????????????????????????????????????????????
    /**
     * Reproduce un contenido como usuario de pago (punto 4c opción 1).
     *
     * Sin límite diario ni publicidad: simplemente llama a r.play() y
     * contabiliza la reproducción.
     *
     * Al ser el mismo código para Cancion y Podcast (solo se llama a r.play()),
     * cumple el requisito del enunciado: "no se admite código distinto para
     * cada elemento reproducible".
     *
     * @param r el contenido a reproducir
     */
    @Override
    public void play(Reproducible r) throws LimiteDiarioException {
        // Reproducción directa sin publicidad ni restricciones
        r.play();

        // Incrementamos el contador total de reproducciones (método de la clase padre)
        incrementarReproducciones();
    }

    // ?? toString ??????????????????????????????????????????????????????????????
    /**
     * Muestra nombre, reproducciones totales, tipo y número de cuenta.
     */
    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: PAGO"
                + " | Cuenta: " + getNumeroCuenta();
    }
}
