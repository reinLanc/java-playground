package ejerciciolibro12;

import java.util.HashMap;

/**
 *
 * @author Reinaldo Gil
 */
public class CartaBrisca extends Carta {

    private static final HashMap<String, Integer> VALORES_BRISCA;

    static {
        VALORES_BRISCA = new HashMap<>();
        VALORES_BRISCA.put("as", 11);
        VALORES_BRISCA.put("tres", 10);
        VALORES_BRISCA.put("rey", 4);
        VALORES_BRISCA.put("caballo", 3);
        VALORES_BRISCA.put("sota", 2);
        VALORES_BRISCA.put("dos", 0);
        VALORES_BRISCA.put("cuatro", 0);
        VALORES_BRISCA.put("cinco", 0);
        VALORES_BRISCA.put("seis", 0);
        VALORES_BRISCA.put("siete", 0);
    }

    public CartaBrisca(String figura, String palo) {
        super(figura, palo);
    }

    @Override
    public int obtenerValor() {
        return VALORES_BRISCA.getOrDefault(figura, 0);
    }

    @Override
    public String toString() {
        return figura + " de " + palo;
    }

}
