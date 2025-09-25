package arrayfinal;
import java.util.Scanner;
public class Arrayfinal {
    public static void main(String[] args) {
        System.out.println("Introduce numero n");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int arr[] = new int[n];
        int ld;
        do {
            System.out.println("Introduce digito final:");
            ld = teclado.nextInt();
        } while (ld < 0 && ld > 0);
        rellenaRandom(arr, 9);
        int terminadosen[] = numterminados(arr, ld);
        mostrar(arr);
        System.out.println("  ");
        mostrarindicado(terminadosen);

    }

    public static void rellenaRandom(int n[], int d) {
        d = 10;
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (300 * Math.random() + 1);
        }
    }

    public static void mostrar(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void mostrarindicado(int n[]) {
        int contador = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] != 0) {
                System.out.println(n[i] + " acaba en el indicado");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("El array no contiene numeros que acaben en lo indicado.");
        }
    }

    public static int[] numterminados(int num[], int lasd) {
        int terminadosen[] = new int[num.length];
        int numerofinal = 0;
        for (int i = 0; i < terminadosen.length; i++) {
            numerofinal = num[i] - (num[i] / 10 * 10);
            if (numerofinal == lasd) {
                terminadosen[i] = num[i];
            }
        }
        return terminadosen;
    }

}
