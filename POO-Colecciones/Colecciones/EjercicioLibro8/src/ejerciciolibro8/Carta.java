package ejerciciolibro8;

/**
 *
 * @author Reinaldo Gil
 */
public class Carta {

    private int numero;  // 1-12 (1=As, 10=Sota, 11=Caballo, 12=Rey)
    private String palo; // "bastos", "copas", "espadas", "oros"

    /**
     * Constructor de la clase Carta
     */
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * Devuelve el número de la carta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Devuelve el palo de la carta
     */
    public String getPalo() {
        return palo;
    }

    /**
     * Convierte el número a su nombre
     */
    private String getNombreNumero() {
        switch (numero) {
            case 1:
                return "As";
            case 10:
                return "Sota";
            case 11:
                return "Caballo";
            case 12:
                return "Rey";
            default:
                return String.valueOf(numero);
        }
    }

    /**
     * Representación en String de la carta
     */
    @Override
    public String toString() {
        return getNombreNumero() + " de " + palo;
    }

    /**
     * Compara si dos cartas son iguales (mismo número y palo)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Carta otra = (Carta) obj;
        return this.numero == otra.numero && this.palo.equals(otra.palo);
    }
}
