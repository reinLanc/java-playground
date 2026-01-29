/*
Escribe un programa que defina una clase abstracta FiguraGeometrica con un constructor que dé valor a los
atributos ancho y alto y un método abstracto area().

Define dos subclases, Triangulo y Rectangulo, que calculen el área de la figura geométrica implementando
el método area().

Finalmente, crea dos objetos, un triángulo y un rectángulo, y luego llama al método area() de los dos.
 */
package exameud5_2;

/**
 *
 * @author Reinaldo Gil
 */
public class Exameud5_2 {
    public static void main(String[] args) {
          // Crear un triángulo
        Triangulo triangulo = new Triangulo(10, 8);
        System.out.println("=== TRIÁNGULO ===");
        System.out.println("Base: " + triangulo.ancho);
        System.out.println("Altura: " + triangulo.alto);
        System.out.println("Área del triángulo: " + triangulo.area());
        
        // Crear un rectángulo
        Rectangulo rectangulo = new Rectangulo(12, 5);
        System.out.println("\n=== RECTÁNGULO ===");
        System.out.println("Base: " + rectangulo.ancho);
        System.out.println("Altura: " + rectangulo.alto);
        System.out.println("Área del rectángulo: " + rectangulo.area());
        
        // Llamar al método area() de los dos objetos
        System.out.println("\n=== LLAMADA A MÉTODO AREA() ===");
        System.out.println("Área triángulo: " + triangulo.area());
        System.out.println("Área rectángulo: " + rectangulo.area());
        
        // Demostrar polimorfismo
        System.out.println("\n=== POLIMORFISMO ===");
        FiguraGeometrica figura1 = new Triangulo(6, 4);
        FiguraGeometrica figura2 = new Rectangulo(8, 3);
        
        System.out.println("Figura 1 (Triángulo): " + figura1.area());
        System.out.println("Figura 2 (Rectángulo): " + figura2.area());
    }
    
}
