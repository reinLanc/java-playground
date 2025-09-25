/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_8_3;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_8_3 {

    static Scanner teclado = new Scanner(System.in);

    public static int invertir(int n, int m) {
        if (n == 0) {
            return m;
        }
        return invertir(n / 10, m * 10 + n % 10);
    }

    public static int invertir(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10 * magnitud(n) + invertir(n / 10));
    }

    public static int magnitud(int n) {
        if (n < 10) {
            return 1;
        }
        return 10 * magnitud(n / 10);

    }

    public static void main(String[] args) {
        System.out.println("Introduce el numero: ");
        int n = teclado.nextInt();
        System.out.println(invertir(n));
    }

}
