//CREA UN ARRAYLIST CON 4 CADENAS DE CARACTERES Y ORDENA CON METODO SORT POR LONGITUD DE CADENA
package javaapplication123;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaApplication123 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList(Arrays.asList("PROG", "CODE", "FOL", "SIN", "LXM"));
        nombres.sort(new ComparadorNombre());


    }
    
}
