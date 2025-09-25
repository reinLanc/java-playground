package tutorialficheros1;

import java.io.FileReader;
import java.io.IOException;

public class TutorialFicheros1 {
    public static void main(String[] args) {
         final String fichero = "D:\\reinaldo\\programacion\\ud6\\cerati.txt";
        try {
            FileReader fr = new FileReader(fichero);
            int aux = fr.read();
            while(aux != -1) {
                if(aux != 32) {
                    System.out.print((char)aux);
                }
                aux=fr.read();
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
