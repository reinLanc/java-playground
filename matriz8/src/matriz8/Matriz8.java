package matriz8;

import java.util.Scanner;

public class Matriz8 {
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
    public static void mostrarVector (int V [], int d)
    {
    for (int i = 1 ; i <= d ; i++)
    {
        System.out.print ("[" + V [i] + "]");
    }
    }
    public static void vectorA (int M [] [], int f, int c, int A [], int d)
    {
    for (int i = 1 ; i <= f ; i++)
    {
        int suma = 0;
        for (int j = 1 ; j <= c ; j++)
        {
        suma = suma + M [j] [i];
        }
        A [i] = suma;
    }
    }
    public static void vectorB (int M [] [], int f, int c, int B [], int d)
    {
    for (int i = 1 ; i <= f ; i++)
    {
        int suma = 0;
        for (int j = 1 ; j <= c ; j++)
        {
        suma = suma + M [i] [j];
        }
        B [i] = suma;
    }
    }

    public static void main(String[] args) {
            Scanner Leer = new Scanner(System.in);
    int Z [] [] = new int [20] [20];
    int A [] = new int [20];
    int B [] = new int [20];
    System.out.print("Inserte filas de la matriz: ");
    int f = Leer.nextInt();
    System.out.print("Inserte columnas de la matriz: ");
    int c = Leer.nextInt();
    System.out.print("nLLENANDO MATRIZ: n");
    llenarMatriz(Z, f, c);
    System.out.print("nLA MATRIZ Z: ");
    mostrarMatriz(Z, f, c);
    System.out.println("nnSUMA POR COLUMNAS DE LA MATRIZ (vector A): ");
    vectorA(Z, f, c, A, c);
    mostrarVector (A, c);
    System.out.println("nnSUMA POR FILAS DE LA MATRIZ (vector B): ");
    vectorB(Z, f, c, B, f);
    mostrarVector (B, f);

    }
    
}
