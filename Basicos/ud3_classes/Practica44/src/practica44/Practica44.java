package practica44;

import java.util.Scanner;

public class Practica44 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double c1,c2;
        
        System.out.println("Introduce cateto 1");
        c1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce cateto 2");
        c2 = Double.parseDouble(teclado.nextLine());  
        
        System.out.println("Hipotenusa "+Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2)));
    }
    
}
