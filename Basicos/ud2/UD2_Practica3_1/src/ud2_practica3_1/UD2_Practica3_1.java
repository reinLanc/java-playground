/*
 * Programa que calcula las potencias desde 1 hasta 5 de los números del 1 al 10
 */
package ud2_practica3_1;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Practica3_1 {

    public static void main(String[] args) {
        int acumulador;

        for (int i = 1; i <= 10; i++) {
            acumulador=1;
            for (int j = 1; j <= 5; j++) {
                acumulador=acumulador*i;
                System.out.println(i + " elevado a " + j + " = "
                        + acumulador);
            }
            System.out.println("");
        }
    }
}
