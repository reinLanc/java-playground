package ud6_3_3;

import java.io.File;
import java.util.Scanner;

public class Ud6_3_3 {

    public static void main(String[] args) {
        String nombreFichero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de un fichero:");
        nombreFichero = sc.nextLine();
        File f = new File("D:\\reinaldo\\"+nombreFichero);
        Crear obj = new Crear();
        if (obj.crear(f))
            obj.grabar();

    }

}
