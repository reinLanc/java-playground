/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz5;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Matriz5 {
  public static void llenar (int M [] [], int f, int c)
    {
        Scanner Leer = new Scanner(System.in);
    for (int i = 1 ; i <= f ; i++)
    {
        for (int j = 1 ; j <= c ; j++)
        {
        System.out.print ("Inserte pos[" + i + "][" + j + "]: ");
        M [i] [j] = Leer.nextInt();
        }
    }
    }
    public static void mostrar (int M [] [], int f, int c)
    {
    for (int i = 1 ; i <= f ; i++)
    {
        System.out.println ();
        for (int j = 1 ; j <= c ; j++)
        {
        System.out.print ("[" + M [i] [j] + "]");
        }
    }
    }
    public static void intercambiar (int M [] [], int f, int c)
    {
    for (int i = 1 ; i <= f ; i++)
    {
        int aux = M [i] [1];
        M [i] [1] = M [i] 1;
        M [i] 1 = aux;
    }
    }


    public static void main(String[] args) {
          Scanner Leer = new Scanner(System.in);
    int M [] [] = new int [20] [20];
    System.out.print ("Inserte filas de la matriz: ");
    int f = Leer.nextInt();
    System.out.print ("Inserte columnas de la matriz: ");
    int c = Leer.nextInt();
    System.out.print ("nLLENANDO MATRIZ : n");
    llenar (M, f, c);
    System.out.print ("nLA MATRIZ ORIGINAL : ");
    mostrar (M, f, c);
    System.out.print ("nnLA MATRICES INTERCAMBIADA : ");
    intercambiar (M, f, c);
    mostrar (M, f, c);

    }
    
}
