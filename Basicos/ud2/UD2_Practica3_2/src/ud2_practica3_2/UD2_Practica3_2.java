/*
 * Programa que visualiza todos los años bisiestos comprendidos entre 2000 y 2100,
ambos inclusive
 */

package ud2_practica3_2;

/**
 *
 * @author
 */
public class UD2_Practica3_2 {

    public static void main(String[] args) {
        int ano;
        
        for (ano = 2000; ano <= 2100; ano++) {
            if (ano%4==0 && ano%100!=0 || ano%400==0) {
                System.out.print(ano+" ");
            }
        }
    }
}
