package ud4_1_3;

import java.util.Scanner;

public class Ud4_1_3 {

    public static void main(String[] args) {
        System.out.println("Introduzca numero de cifras a introducir");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int numeros[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el numero (" + (i + 1) + "/" + num + ")");
            numeros[i] = teclado.nextInt();
        }
        posicion(numeros);
    }

    public static void posicion(int[] pos) {
        int contador = 0;
        for (int j = 0; j < pos.length; j++) {
            if(pos[j] == 10) {
                System.out.println("El array contiene el numero 10 en la posición: " + (j+1));
            contador++;
            } 
        }
        if(contador<=0) {
            System.out.println("El array no contiene el numero 10");
        }
        System.out.println("El array contiene " + contador + " veces el numero 10");
    }
}
