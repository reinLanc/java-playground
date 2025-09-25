/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binariorecursivo;

import java.util.Scanner;

public class BinarioRecursivo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n = teclado.nextInt();
        System.out.println("El número " + n + " en binario es: " + binarioRecursivo(n));
    }

    public static int binarioRecursivo(int n) {
      if(n<2)
         return n;
      else 
          return n%2+10*binarioRecursivo(n/2);
    }
}
