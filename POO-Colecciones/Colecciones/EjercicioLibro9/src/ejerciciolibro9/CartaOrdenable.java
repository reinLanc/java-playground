package ejerciciolibro9;

/**
 *
 * @author Reinaldo Gil
 */
public class CartaOrdenable {

    private int numero;
    private String palo;

    public CartaOrdenable(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    /**
     * Devuelve un valor numérico para ordenar los palos bastos=1, copas=2,
     * espadas=3, oros=4
     */
    public int getOrdenPalo() {
        switch (palo) {
            case "bastos":
                return 1;
            case "copas":
                return 2;
            case "espadas":
                return 3;
            case "oros":
                return 4;
            default:
                return 0;
        }
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

    @Override
    public String toString() {
        return getNombreNumero() + " de " + palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        CartaOrdenable otra = (CartaOrdenable) obj;
        return this.numero == otra.numero && this.palo.equals(otra.palo);
    }
}
