package ud4_1_5;

import java.util.Scanner;

public class Ud4_1_5 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entre 1 y 10");
        Scanner teclado = new Scanner(System.in);
        int numDia = teclado.nextInt();
        while(numDia < 1 || numDia > 10) {
            System.out.println("Error. Debe introducir solo numero entre 1 y 10");
            System.out.println("Introduzca un numero entre 1 y 10");
            numDia = teclado.nextInt();
        }
        String nombres[] = {"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"};
        System.out.println("El " + numDia + " se escribe " + nombres[numDia-1]);
    }
    
}
