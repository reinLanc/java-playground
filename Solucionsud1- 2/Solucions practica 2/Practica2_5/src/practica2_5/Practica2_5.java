/*
 * Cálculo del área y el perímetro de un cuadrado de lado 5cm
 */
package practica2_5;

/**
 *
 * @author 
 */
public class Practica2_5 {

    public static void main(String[] args) {
        double lado = 5;
        
        // Calculamos el área y el perímetro
        double area = lado * lado;
        double perimetro = 4 * lado;
        
        // Mostramos los resultados por pantalla
        System.out.println("Área: " + area + " cm cuadrados.");
        System.out.println("Perímetro: " + perimetro + " cm.");
    }
    
}
