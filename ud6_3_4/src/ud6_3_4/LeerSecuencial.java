package ud6_3_4;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import static ud6_3_4.LeerDirecto.t;

public class LeerSecuencial {
    static String datos;
    public static void  lector(File f) {
        try{
            t = new RandomAccessFile(f,"r");
            while(true){
                System.out.print("ID-" + t.readInt());
                System.out.println(",Nota:"+t.readDouble());
            }
        }
        catch (EOFException e){
            //llegó al final
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try
            {
                t.close();
            }
            catch(IOException e){
            }
        }
    }
}
