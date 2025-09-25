
package ud5_2_1;

import java.util.Scanner;

public class Ud5_2_1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce un numero entero: ");
        int nu = sc.nextInt();
        System.out.print((comprobaciones.esPrimo(nu) ? "Es" : "No es") + " primo, ");
        System.out.println(comprobaciones.esPerfecto(nu)? "Es perfecto." : "No es perfecto.");
        System.out.print((comprobaciones.esCapicua(nu) ? "Es" : "No es") + " capicúa, ");
        System.out.print((comprobaciones.esPar(nu) ? "Es" : "No es") + " par, ");
        System.out.print((comprobaciones.esAntiguo(nu) ? "Es" : "No es")
                + " menor de 1900, ");
        System.out.println((comprobaciones.esBisiesto(nu) ? "Es" : "No es")
                + " bisiesto, ");
        System.out.print((comprobaciones.estaIntervalo(500, 1000, nu) ? "Está" : "No está")
                + " en el intervalo 500-1000, ");
        System.out.println((comprobaciones.esTriangulo(50, 100, nu) ? "Forma" : "No forma")
                + " triángulo con 50 y 100");
    }
    
}
