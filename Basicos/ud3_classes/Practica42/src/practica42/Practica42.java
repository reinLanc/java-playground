package practica42;

import java.util.Scanner;

public class Practica42 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double angulo;
        
        System.out.println("Introduce ángulo en grados");
        angulo = Double.parseDouble(teclado.nextLine());
        angulo = Math.toRadians(angulo);
        System.out.println("Seno "+Math.sin(angulo));
        System.out.println("Coseno "+Math.cos(angulo));
        System.out.println("Tangente "+Math.tan(angulo));    }
    
}
