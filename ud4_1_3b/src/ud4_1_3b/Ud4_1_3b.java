package ud4_1_3b;

import java.util.Arrays;
import java.util.Scanner;

public class Ud4_1_3b {

    public static void main(String[] args) {
        System.out.println("Introduzca numero de cifras a introducir");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int numeros[] = new int[num];
        int buscado = 10;
        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el numero (" + (i + 1) + "/" + num + ")");
            numeros[i] = teclado.nextInt();
        }
        int indice1 = Arrays.binarySearch(numeros, buscado);
        System.out.println((indice1));
        //busqueda ordenada. altera la posición
        Arrays.sort(numeros);
        int indice = Arrays.binarySearch(numeros, buscado);
        System.out.println((indice));
    }

}
