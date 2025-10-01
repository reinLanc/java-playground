/*
 * Programa que calcula el cuadrado de los 10 primeros números pares (del 2 al 20).
 */
package ud2_practica2_7;

public class UD2_Practica2_7 {

    public static void main(String[] args) {
        int i;
        
        for(i = 2; i<=20; i += 2)
          System.out.println(i + " al cuadrado = " + (i*i));
    }
}
