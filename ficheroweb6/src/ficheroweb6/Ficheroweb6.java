package ficheroweb6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheroweb6 {

    public static void main(String[] args) {
        String[] cadena = {"hola", "¿que tal?", "y vos?"};
        vuelcaCadena(cadena, "D:\\reinaldo\\programacion\\ud6\\hola.txt");
        cargaCodigo("D:\\reinaldo\\programacion\\ud6\\hola.txt");
    }

    static void vuelcaCadena(String[] cadena, String nombre) {

        int i;
        FileWriter fill = null;
        BufferedWriter bW = null;

        try {
            fill = new FileWriter(nombre);
            bW = new BufferedWriter(fill);
            for (i = 0; i < cadena.length; i++) {
                bW.write(cadena[i]);
                bW.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bW.close();
                fill.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static void cargaCodigo(String nombre) {
        FileReader fill = null;
        BufferedReader bF = null;
        String linea;
        try {
            fill = new FileReader(nombre);
            bF = new BufferedReader(fill); // Creo buffer dependiente del fichero
            linea = bF.readLine(); // Cada linea cargará el buffer actual

            while (linea != null) { // Cuando no pueda cargar texto del buffer habrá acabado el fichero
                System.out.println(linea);
                linea = bF.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bF.close();
                fill.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
