package ud4_3_1;

public class Cronometro {

    private long inicio, fin;

    public void arrancar() {
        inicio = System.currentTimeMillis();
    }

    public void arrancar(long tiempo) {
        inicio = tiempo;
    }

    public void parar() {
        fin = System.currentTimeMillis();
    }

    public void parar(long tiempo) {
        fin = tiempo;
    }

    public long getInicio() {
        return inicio;
    }

    public long getFin() {
        return fin;
    }

    public long tiempo() {
        return fin - inicio;
    }
}
