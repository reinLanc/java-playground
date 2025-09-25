package ud4_1_4b;

import java.util.Scanner;

public class Ud4_1_4b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Introduce número para pasarlo a binario: ");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.println(Integer.toBinaryString(numero));
        System.out.println(binario(numero));

    }

    public static String binario(int n) {
        byte b[];
        String r = "";
        int i;

        b = new byte[(int) (Math.ceil(Math.log(n + 1) / Math.log(2)))];
        for (i = 0; i < b.length; i++) {
            b[i] = (byte) (n % 2);
            n = n / 2;
        }

        for (i = b.length - 1; i >= 0; i--) {
            r += b[i];
        }

        return r;
    }
}
