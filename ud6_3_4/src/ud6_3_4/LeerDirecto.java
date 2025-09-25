package ud6_3_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class LeerDirecto {
    static RandomAccessFile t;

    public static void lector(File f) {
        int id;
        Scanner teclado = new Scanner(System.in);
        
        try{
            //Abrese o ficheiro en modo lectura
             t = new RandomAccessFile(f.getName(),"r");
            System.out.println("Introducir id");
            id = Integer.parseInt(teclado.nextLine());
            
            //Posicionar o punteiro do ficheiro
            t.seek((id-1)*12);

            System.out.print("ID:" + t.readInt());
            System.out.println(",Nota:"+t.readDouble());
                
            //Cerrar o ficheiro
            t.close();

        }catch(Exception e){
            System.out.println("Error de acceso al ficheiro"+e);
        }
    }
}
