package ejerciciolibro12;

/**
 *
 * @author Reinaldo Gil
 */
public abstract class Carta {

    protected String figura;
    protected String palo;

    public Carta(String figura, String palo) {
        this.figura = figura;
        this.palo = palo;
    }

    public String getFigura() {
        return figura;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public abstract String toString();

    public abstract int obtenerValor();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Carta otra = (Carta) obj;
        return this.figura.equals(otra.figura) && this.palo.equals(otra.palo);
    }
}
