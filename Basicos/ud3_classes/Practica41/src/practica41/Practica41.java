package practica41;

import java.util.Scanner;

public class Practica41 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        
        System.out.println("Introduce número");
        numero = Double.parseDouble(teclado.nextLine());
        System.out.println("Redondeo hacia arriba "+Math.ceil(numero));
        System.out.println("Redondeo hacia abajo "+Math.floor(numero));
        System.out.println("Redondeo al más cercano "+Math.round(numero));
        
    }
    
}
