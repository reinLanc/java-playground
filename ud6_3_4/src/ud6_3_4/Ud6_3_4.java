package ud6_3_4;

import java.io.File;
import java.util.Scanner;

public class Ud6_3_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte opcion;
        String nombreFichero;
        
        System.out.println("Introduce el nombre del fichero:");
        nombreFichero = teclado.nextLine();
        File f = new File(nombreFichero);        
        System.out.println("1 SECUENCIAL ,2 DIRECTA.");
        opcion = Byte.parseByte(teclado.nextLine());
        switch (opcion) {
            case 1:
                LeerSecuencial.lector(f);
                break;
            case 2:
                LeerDirecto.lector(f);
                break;
        }  

    }
}
