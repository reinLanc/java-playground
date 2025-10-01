package ejemploficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploFicheros {

    public static void main(String[] args) {

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Nombre de fichero: ");
            String nombrefichero = br.readLine();
            File fichero = new File(nombrefichero);
            System.out.println("Nombre " + fichero.getName());
            System.out.println("Ruta " + fichero.getPath());
            if (fichero.exists()) {
                System.out.println(fichero.canRead() ? "Se puede leer" : "");
                System.out.println(fichero.canWrite() ? "Se puede modificar" : "");
                System.out.println("Bytes " + fichero.length());
            } else {
                System.out.println("El fichero no existe");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }*/

        // create an abstract pathname (File object)
        File f = new File("D:\\reinaldo\\bada\\ud7\\Folla1");
  
        // check if the directory can be created
        // using the abstract path name
        if (f.mkdir()) {
  
            // display that the directory is created
            // as the function returned true
            System.out.println("Directory is created");
        }
        else {
            // display that the directory cannot be created
            // as the function returned false
            System.out.println("Directory cannot be created");
        }
    }

}
