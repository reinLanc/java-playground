package practica45;

import java.util.Scanner;

public class Practica45 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado;
        
        System.out.println("Introduce lado del cubo");
        lado = Double.parseDouble(teclado.nextLine());
        System.out.println("Volumen "+Math.pow(lado, 3));
    }
    
}
