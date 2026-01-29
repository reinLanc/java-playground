package ejerciciolibro7;

/**
 *
 * @author Reinaldo Gil
 */
public class Moneda {

    private String valor;    // 1c, 2c, 5c, 10c, 25c, 50c, 1€, 2€
    private String posicion; // "cara" o "cruz"

    /**
     * Constructor de la clase Moneda
     */
    public Moneda(String valor, String posicion) {
        this.valor = valor;
        this.posicion = posicion;
    }

    /**
     * Devuelve el valor de la moneda
     */
    public String getValor() {
        return valor;
    }

    /**
     * Devuelve la posición de la moneda
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * Representación en String de la moneda
     */
    @Override
    public String toString() {
        return valor + " - " + posicion;
    }
}
