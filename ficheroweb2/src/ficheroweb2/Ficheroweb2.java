package ficheroweb2;

import java.io.File;
import java.util.Scanner;

public class Ficheroweb2 {

    public static void main(String[] args) {
        Scanner sc = null;
        File fichero;
        int total = 0;
        try {
            System.out.println("Escribe el fichero a leer");
            sc = new Scanner(System.in); // Escaner de entrada
            fichero = new File(sc.nextLine()); // Fichero = entrada del usuario
            sc.close();
            total = 0;

            sc = new Scanner(fichero); // Escaner que leerá el fichero
            // Mientras haya una nueva linea en el fichero, el scanner devolverá resultados
            while (sc.hasNext()) {
                total += sc.nextInt(); // Convierto linea leída a un entero
            }

            System.out.println("Total:" + total);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

}
