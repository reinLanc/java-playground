package pruebaarrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class PruebaArrays {

    public static void main(String[] args) {
       int arr[] = new int[5];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = (int) (Math.random() * 5 + 1);
        }
        System.out.printf("El arreglo es: %s\n", Arrays.toString(arr));
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int x = 0; x < arr.length; x++) {
            int numero = arr[x];
            if (mapa.containsKey(numero)) {
                mapa.put(numero, mapa.get(numero) + 1);
            } else {
                mapa.put(numero, 1);
            }
        }

        int moda = 0, mayor = 0;
        for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > mayor) {
                mayor = entry.getValue();
                moda = entry.getKey();
            }
        }
        System.out.print("La moda es " + moda + " porque se repite " + mayor +"  veces");
    }
}
