/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forholamundo;

import java.util.Scanner;

public class Forholamundo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número. Por favor -1 para salir.");
        int n = teclado.nextInt();
        while (n != -1) {
            if (perfectoRecursivo(n)) {
                System.out.println(n + " es un número perfecto.");
            } else {
                System.out.println(n + " no es un número perfecto.");
            }
            System.out.println("Introduce un número. Por favor -1 para salir.");
            n = teclado.nextInt();
        }
    }

    public static boolean perfectoRecursivo(int n) {
        int suma = 0;
        boolean perfecto = true;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        if (n == suma) {
            perfecto = true;
        } else {
            perfecto = false;
        }
        return perfecto;
    }

}
