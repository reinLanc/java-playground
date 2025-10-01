package hyperpar;

import java.util.Scanner;

public class Hyperpar {

    public static void main(String[] args) {
        System.out.println("Introduce un numero:");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if (hyperpar(n)) {
            System.out.println("Es Hyperpar");
        } else {
            System.out.println("no es Hyperpar");
        }
    }

    public static boolean hyperpar(int n) {
        String caracter;
        Integer numero;
        boolean hyper = false;
        String nstring = String.valueOf(n);
        for (int i = 0; i < nstring.length(); i++) {
            caracter = nstring.substring(i, i + 1);
            numero = Integer.valueOf(caracter);
            if (numero % 2 == 0) {
                hyper = true;
            } else {
                return false;
            }
        }
        return hyper;
    }

}
