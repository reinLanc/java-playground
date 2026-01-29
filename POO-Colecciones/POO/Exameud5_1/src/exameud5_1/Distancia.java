package exameud5_1;
/**
 *
 * @author Reinaldo Gil
 */
public class Distancia {

    private double distancia;

    // Constructor sin argumento (distancia = 0)
    public Distancia() {
        this.distancia = 0;
    }

    // Constructor con un argumento
    public Distancia(double distancia) {
        this.distancia = distancia;
    }

    // Setter
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Getter
    public double getDistancia() {
        return distancia;
    }

    // Método de visualización
    public void visualizar() {
        System.out.println("Distancia: " + distancia + " metros");
    }

    // Método que agrega dos objetos de distancia y devuelve el objeto de distancia agregado
    public Distancia agregar(Distancia otra) {
        return new Distancia(this.distancia + otra.distancia);
    }
}
