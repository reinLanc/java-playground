package ud6_3_3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Crear {

 RandomAccessFile t;
    Scanner sc = new Scanner(System.in);

    public boolean crear(File f) {
        boolean control = true;
        int opcion;
        try {
            if (f.exists()) {
                System.out.println("El fichero ya existe.Pulse 1 si desea sobrescribirlo,2 si desea" + " " +
                        "añadir datos y 3 si desea cancelar el proceso");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        control = true; 
                        f.delete();
                        t = new RandomAccessFile(f.getName(), "rw");
                        break;
                    case 2:
                        control = true;
                        t = new RandomAccessFile(f.getName(), "rw");
                        t.seek(f.length());                   
                        break;
                    case 3:
                        control = false;
                        break;
                }

            } else
            {
                System.out.println("El fichero no existe.Se procederá a su creación");
                t = new RandomAccessFile(f.getName(), "rw");
                control = true;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return control;
    }

    public void grabar() {
        double nota;
        int codigo;
        try {
            codigo = (int)(t.length()/12);
            codigo++;
            System.out.println("Introduce una nota");
            nota = Double.parseDouble(sc.nextLine());
            while (nota >= 0) {
                t.writeInt(codigo);
                t.writeDouble(nota);
                codigo++;
                System.out.println("Introduce una nota");
                nota = Double.parseDouble(sc.nextLine());
            }
            t.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
