package ficheroweb1;

import java.io.FileWriter;

public class Ficheroweb1 {

    public static void main(String[] args) {
        // Propiedades
        FileWriter fich = null;
        int i;

        // Programa
        try {
            fich = new FileWriter("D:\\reinaldo\\programacion\\ud6\\numNaturales.txt");

            for (i = 0; i < 101; i++) {
                fich.write(i + " ");
            }

            System.out.println("Fichero escrito correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fich.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
