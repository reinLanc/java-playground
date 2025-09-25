package ud6_2_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ud6_2_2 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = null;
        FileWriter fw = null;
        int aux = 0;
        try {
            System.out.println("Introduzca nombre del archivo a leer:");
            fr = new FileReader(br.readLine());
            System.out.print("Nombre del archivo a crear: ");
            String nombrefichero = br.readLine();
            File fichero = new File(nombrefichero);
            fw = new FileWriter(fichero);
            while ((aux = fr.read()) != -1) {
                if (!((char) aux >= '0' && (char) aux <= '9')) {
                    fw.write(Character.toUpperCase(aux));
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
