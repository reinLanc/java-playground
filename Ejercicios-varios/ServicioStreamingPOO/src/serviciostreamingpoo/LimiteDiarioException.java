/**
 * Clase LimiteDiarioException
 * ============================
 * Excepción personalizada que se lanza cuando un usuario gratuito
 * intenta reproducir más contenidos de los permitidos en un día.
 *
 * Hereda de Exception (excepción comprobada - checked exception),
 * lo que obliga al código que llame a play() a tratarla con try-catch.
 *
 * Punto del enunciado: 2c — "Si un usuario intenta escuchar más contenidos
 * de los que puede, se lanzará una excepción."
 */
package serviciostreamingpoo;

/**
 *
 * @author Reinaldo Gil
 */
public class LimiteDiarioException extends Exception {

    /**
     * Constructor con mensaje descriptivo. El mensaje se puede recuperar con
     * getMessage() en el catch.
     *
     * @param mensaje descripción del error
     */
    public LimiteDiarioException(String mensaje) {
        super(mensaje);
    }
}
