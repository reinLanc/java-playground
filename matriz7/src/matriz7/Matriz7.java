
package matriz7;

import java.util.Scanner;

public class Matriz7 {
   public static void llenarMatriz (int M [] [], int f, int c)
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
    public static void mostrarMatriz (int M [] [], int f, int c)
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
    public static void llenarVector (int V [], int d)
    {
        Scanner Leer = new Scanner(System.in);
    for (int i = 1 ; i <= d ; i++)
    {
        System.out.print ("Inserte pos.[" + i + "]: ");
        V [i] = Leer.nextInt();
    }
    }
    public static void mostrarVector (int V [], int d)
    {
    for (int i = 1 ; i <= d ; i++)
    {
        System.out.print ("[" + V [i] + "]");
    }
    }
    public static void procedure (int M [] [], int f, int c, int V [], int d)
    {
    for (int i = 1 ; i <= f ; i++)
    {
        int sw = 1;
        for (int j = 1 ; j <= c ; j++)
        {
        for (int k = 1 ; k <= d ; k++)
        {
            if (M [j] [i] != V [k])
            sw = 0;
        }
        }
        if (sw == 1)
        System.out.println ("nnLa columna " + i + " es igual al vector");
    }
    }

    public static void main(String[] args) {
           Scanner Leer = new Scanner(System.in);
    int M [] [] = new int [20] [20];
    int V [] = new int [20];
    System.out.print ("Inserte filas de la matriz: ");
    int f = Leer.nextInt();
    System.out.print ("Inserte dimension del vector: ");
    int d = Leer.nextInt();
    System.out.print ("nLLENANDO MATRIZ: n");
    llenarMatriz(M, f, d);
    System.out.print ("nLLENANDO EL VECTOR: n");
    llenarVector (V, d);
    System.out.print ("nLA MATRIZ: ");
    mostrarMatriz(M, f, d);
    System.out.print ("nnEL VECTOR: n");
    mostrarVector (V, d);
    procedure (M, f, d, V, d);

    }
    
}
