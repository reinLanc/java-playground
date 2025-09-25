/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_8_4;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_8_4 {

    static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    private static int sumatoria(int n) {
  if(n < 10)
      return n;
  else 
      return sumatoria(n/10) + (n%10);
    }

    public static void main(String[] args) {
        System.out.println("Introduce el numero: ");
        int n = teclado.nextInt();

        System.out.println("La suma de " + n + " es: " + sumatoria(n));

    }

}
