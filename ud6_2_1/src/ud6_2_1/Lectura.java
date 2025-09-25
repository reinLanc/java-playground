package ud6_2_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    FileReader fr = null;
    int aux = 0;



    public void leer() throws IOException {
        try {
            System.out.println("Introduzca nombre del archivo a leer:");
            fr = new FileReader(br.readLine());
            while ((aux = fr.read()) != -1) {
                System.out.print((char) aux);
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
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}