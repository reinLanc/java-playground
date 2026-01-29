package exameud5_2;

/**
 *
 * @author Reinaldo Gil
 */
public class Triangulo extends FiguraGeometrica {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return (ancho * alto) / 2;
    }
}
