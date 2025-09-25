package ficheroweb7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.Vector;

public class Ficheroweb7 {

    public static void main(String[] args) {
        cargarCodigo("D:\\reinaldo\\programacion\\ud6\\ordena.txt");
    }

    static void cargarCodigo(String nombre) {

        // Propiedades
        FileReader fill = null;
        BufferedReader bF = null;
        FileWriter fW = null;
        BufferedWriter bW = null;
        String linea;
        Vector<String> cadena = new Vector<String>(); // Uso vector en vez de array por las posiciones variables
        Collator compara = Collator.getInstance(); // Permite un orden alfabético real
        compara.setStrength(Collator.PRIMARY); // Indicamos que trate igual a mayúsculas y minusculas lleven o no acento

        // Código
        try {
            fill = new FileReader(nombre);
            bF = new BufferedReader(fill);
            linea = bF.readLine();

            // Inserto lineas de fichero en el vector
            while (linea != null) {
                cadena.add(linea);
                linea = bF.readLine();
            }

            for (int i = 0; i < cadena.size(); i++) {
                for (int j = 0; j < cadena.size(); j++) {
                    /*
                      	 * Método compare devuelve:
                      	 *   <0 si primero < segundo
                      	 *   0 si iguales
                      	 *   >0 si primero > segundo
                     */
                    if (compara.compare(cadena.get(i), cadena.get(j)) < 0) {
                        linea = cadena.get(j);
                        cadena.set(j, cadena.get(i));
                        cadena.set(i, linea);
                    }
                } // Fin segundo for
            } // Fin primer for

            // Escribo el vector en el fichero
            fW = new FileWriter(nombre);
            bW = new BufferedWriter(fW);

            for (int i = 0; i < cadena.size(); i++) {
                bW.write(cadena.get(i));
                bW.newLine();
            }

            System.out.println("Ordenación completada");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bF.close();
                fill.close();
                bW.close();
                fW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
