package ud6_3_2;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ud6_3_2 {

    public static void main(String[] args) {
        try {
            FileInputStream file = new   FileInputStream("D:\\reinaldo\\programacion\\primos.dat");
            DataInputStream data = new   DataInputStream(file);

            try {
                while (true) {
                    int in = data.readInt();
                    System.out.print(in + " ");
                }
            } catch (EOFException eof) {
                 data.close();
                
             }
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());//aparece el tipo de excepción, además del mensaje
        }
    }

}


