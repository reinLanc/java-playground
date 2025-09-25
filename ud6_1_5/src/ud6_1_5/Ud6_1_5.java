package ud6_1_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ud6_1_5 {

    public static void main(String[] args) {
        BufferedReader br = null;
        String[] valores;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Introduzca el nombre del archivo a leer: ");
            br = new BufferedReader(new FileReader(b.readLine()));
            String linea;
            while ((linea = br.readLine()) != null) {
                valores = linea.split(";");
                System.out.println(valores[0] + " " + valores[1] + " "
                        + valores[2] + " " + valores[3] + " "
                        + valores[4] + " " + valores[5]);
            }
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
