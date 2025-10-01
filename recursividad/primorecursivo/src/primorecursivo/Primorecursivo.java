package primorecursivo;

import java.util.Scanner;

public class Primorecursivo {
    public static void main(String[] args) {
        System.out.println("Introduce un numero entero");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if(primo(n))
            System.out.println("Es primo.");
        else 
            System.out.println("No es primo.");
    }
    public static boolean primo(int n) {
        if(n <=1)
            return false;
        int contador = 0;
        for(int i = (int) Math.sqrt(n); i > 1; i--){
            if(n%i == 0){
                contador++;
            }
        }
        return contador < 1;
    }
}
