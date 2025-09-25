package rectangulorecursivo;

import java.util.Scanner;

public class Rectangulorecursivo {
    public static void main(String[] args) {
        System.out.println("Introduce la altura del rectangulo:");
        Scanner teclado = new Scanner(System.in);
        int altura = teclado.nextInt();
        System.out.println("Introduce la base del rectangulo:");
        int base = teclado.nextInt();
        cuad(altura,base);
    }
    static void cuad(int altura, int base) {
        if(altura>0) {
        cuad2(base);
        cuad(altura-1,base);
    }
    }
    static void cuad2(int n) {
        if(n>0){
            System.out.print("*");
            cuad2(n-1);
        }else {
            System.out.println();
        }
    }
    
}
