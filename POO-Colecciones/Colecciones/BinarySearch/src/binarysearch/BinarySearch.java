/*
El programa va pidiendo números al usuario y los guarda en una lista ordenada de menor a mayor.
Cada vez que introduces un número, lo inserta en la posición correcta y muestra la lista actualizada.
Cuando introduces 0, el programa termina. Importante usar Busqueda Binaria
 */
package binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        int n;

        System.out.println("Introduce un número para añadir a la lista (0 salir)");
        n = teclado.nextInt();
        while (n != 0) {
            insertarLista(lista, n);
            mostrarLista(lista);

            System.out.println("Introduce un número para añadir a la lista (0 salir)");
            n = teclado.nextInt();
        }
    }

    public static void insertarLista(ArrayList l, int num) {
        //int i;

        //for(i=0; i<l.size() && (Integer)(l.get(i))<num; i++);
        //l.add(i,num);
        int pos = Collections.binarySearch(l, num);
        if (pos < 0) {
            pos = (pos + 1) * -1;
        }
        l.add(pos, num);

    }

    public static void mostrarLista(ArrayList l) {
        int i;

        System.out.print("Lista: ");
        for (i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }
}
