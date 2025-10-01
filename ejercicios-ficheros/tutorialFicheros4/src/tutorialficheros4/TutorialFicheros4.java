package tutorialficheros4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TutorialFicheros4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el archivo de origen:");
        String origen = teclado.nextLine();
        System.out.println("Introduce el archivo de destino:");
        String destino = teclado.nextLine();

    }
       public static void copiaFicheros (String origen,String destino) {
        try {
            FileInputStream  fis = new FileInputStream(origen);
            FileOutputStream fos = new FileOutputStream(destino);
            byte bytea[] = new byte[fis.available()];
            fis.read(bytea);
            fos.write(bytea);
            fos.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


