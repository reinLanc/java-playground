package ejemplopolimorfismo;

public class Circulo extends FiguraGeometrica {

    private final double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}
