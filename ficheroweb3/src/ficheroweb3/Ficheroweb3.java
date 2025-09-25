package ficheroweb3;

import java.io.FileWriter;
import java.io.IOException;

public class Ficheroweb3 {

    public static void main(String[] args) {
        // Código de prueba ya que el ejercicio solo pide el método
        String[] palabras = new String[]{"Uno", "Dos", "Tres"};
        escribeArray(palabras, "D:\\reinaldo\\programacion\\ud6\\pruebaArrays.txt");
    }

    public static void escribeArray(String[] palabras, String nombre) {
        // Propiedades
        FileWriter fich = null;

        // Código
        try {
            fich = new FileWriter(nombre);
            for (int i = 0; i < palabras.length; i++) {
                fich.write(palabras[i]);
                // Condicion que evita insertar un * al final del todo
                if (i + 1 != palabras.length) {
                    fich.write("*");
                }
            }
            // Muestra por pantalla proceso finalizado
            System.out.println("Palabras insertadas correctamente");
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
