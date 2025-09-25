package ejemplopolimorfismo;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[5];
        figuras[0] = new Rectangulo(5, 10);
        figuras[1] = new Rectangulo(10, 10);
        figuras[2] = new Rectangulo(15, 11);
        figuras[3] = new Circulo(10);
        figuras[4] = new Circulo(50);
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i].getArea());
        }

    }

}
