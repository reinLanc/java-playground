package exameud5_2;

/**
 *
 * @author Reinaldo Gil
 */
abstract class FiguraGeometrica {

    protected double ancho;
    protected double alto;

    // Constructor
    public FiguraGeometrica(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método abstracto area()
    public abstract double area();
}
