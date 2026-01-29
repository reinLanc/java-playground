package exameud5_2;
/**
 *
 * @author Reinaldo Gil
 */
public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return ancho * alto;
    }
}
