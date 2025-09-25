package ud6_2_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ud6_2_3 {

    public static void main(String[] args) {
        BufferedReader br = null;
        String[] valores;
        double nota = 0;
        double suma = 0;
        int contador = 0;

        try {
            br = new BufferedReader(new FileReader("D:\\reinaldo\\programacion\\ud6\\Alumnos\\Alumnos.txt"));
            String linea;
            System.out.println("Alumnos con notas mayor a 5:");
            while ((linea = br.readLine()) != null) {
                valores = linea.split(",");
                suma += Double.parseDouble(valores[2]);
                if (Double.parseDouble(valores[2]) > 5) {
                    System.out.println(valores[0] + " " + valores[1] + " " + " -> Nota: " + valores[2]);
                    contador++;
                } else {
                    contador++;
                }
            }
            System.out.printf("Nota media: %4.2f", (double) suma / contador);
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el fichero.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
