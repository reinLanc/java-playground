package tutorialficheros2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TutorialFicheros2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca ruta del archivo");
        String ruta = br.readLine();
        System.out.println("Introduzca texto para el archivo");
        String texto = br.readLine();
        escribir(ruta,texto);
        mostrarFichero(ruta);
        //String ruter = "C:\\Users\\34669\\OneDrive\\Escritorio\\fp-daw\\java\\ud6\\cera.txt";
    }

    public static void escribir(String nom, String texto) {
        try {
            FileWriter fw = new FileWriter(nom);
            fw.write(texto);
            fw.close();
        } catch (IOException e) {
            System.out.println("Problemas con la escritura." + e.getMessage());
        }

    }
      public static void mostrarFichero(String nom) throws FileNotFoundException {
        try {
            FileReader fr = new FileReader(nom);
            int aux = fr.read();
            while(aux != -1) {
                char caracter = (char)aux;
                if(caracter >= 97 && caracter <= 122) {
                    caracter -= 32;
                } else if(caracter >= 65 && caracter <= 97) {
                    caracter += 32;
                }
                System.out.print(caracter);
                aux=fr.read();
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
