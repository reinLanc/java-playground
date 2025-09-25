package ficheroweb4;

import java.io.FileReader;
import java.io.IOException;

public class Ficheroweb4 {

    public static void main(String[] args) {
        // Código de prueba ya que sólo pide el método
        leerCadenas("D:\\reinaldo\\programacion\\ud6\\pruebaArrays.txt");
    }

    public static void leerCadenas(String nombre) {
        // Propiedades
        FileReader fich = null;
        int letra;

        // Código
        try {
            fich = new FileReader(nombre);
            letra = fich.read();

            while (letra != -1) { // Al no haber más caracteres que leer, retorna un -1 para saber cuando acabar
                if (letra == '*') {
                    letra = '\n';
                }
                System.out.print((char) letra); // Realizo la conversión de entero a caracter
                letra = fich.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fich.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
