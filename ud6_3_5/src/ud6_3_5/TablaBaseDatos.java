package ud6_3_5;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class TablaBaseDatos {

    private RandomAccessFile miTabla;
    private int numeroRegistros, edad, nRegistro, longitudRegistro = 56;
    private double peso;
    private String nombre;

    TablaBaseDatos(String tabla) {
        try {
            miTabla = new RandomAccessFile(tabla, "rw");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int dameNumeroRegistros() {
        try {
            if (miTabla.length() == 0) {
                numeroRegistros = 0;
            } else {
                numeroRegistros = (int) (miTabla.length() / longitudRegistro);

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return numeroRegistros;
    }

    public void borrar(int num) {
        try {//acceder al registro y cambiar el número a 0
            miTabla.seek((num - 1) * longitudRegistro);
            nRegistro = 0;
            miTabla.writeInt(nRegistro);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean consultar(int numeroRegistros, int num) {
        boolean existe = false;
        //al ir los números de registro ordenados, podría accederse directamente
//        con seek en lugar de buscar desde el principio. En otro caso, no sería posible
        try {
            miTabla.seek((num - 1) * longitudRegistro);
            nRegistro = miTabla.readInt();
            for (int i = 0; i < 20; i++) {
                nombre += miTabla.readChar();
            }
            edad = miTabla.readInt();
            peso = miTabla.readDouble();
            if (nRegistro != 0 && nRegistro == num) {
                existe = true;
                System.out.println("Número: " + nRegistro);
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Peso: " + peso);
            }
            // miTabla.seek(0);
            //sale del bucle al localizar el registro, ya que el número es único
            /* for ( int i=1;i<=numeroRegistros && !existe;i++)
             {
             nombre = "";
             nRegistro = miTabla.readInt();
             for (int j = 0; j < 20; j++) {
             nombre += miTabla.readChar();
             }
             edad = miTabla.readInt();
             peso = miTabla.readDouble();
             if (nRegistro!=0 && nRegistro==num)
             {
             existe=true;
             System.out.println("Número: " + nRegistro);
             System.out.println("Nombre: " + nombre);
             System.out.println("Edad: " + edad);
             System.out.println("Peso: " + peso);
             }
             }*/
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (!existe) {
            System.out.println("No existe");
        }
        return existe;
    }

    public void modificar(int num) {
        Scanner teclado = new Scanner(System.in);
        boolean existe = false;
        int opcion;
        try {
            miTabla.seek((num - 1) * longitudRegistro);
            do {
                System.out.println("1. Nombre ");
                System.out.println("2. Edad ");
                System.out.println("3. Peso ");
                System.out.println("0. Fin");
                System.out.println("Introduzca opción a modificar, 0 finaliza");
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        nombre = teclado.nextLine();
                        break;
                    case 2:
                        System.out.print("Edad: ");
                        edad = Integer.parseInt(teclado.nextLine());
                        break;
                    case 3:
                        System.out.print("Peso: ");
                        peso = Double.parseDouble(teclado.nextLine());
                        break;
                    case 0:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("La opcion es incorreta");
                }
            } while (opcion != 0);
            miTabla.writeInt(nRegistro);//almacena el que se acaba de consultar
            for (int i = 0; i < 20; i++) {
                if (i < nombre.length()) {
                    miTabla.writeChar(nombre.charAt(i));
                } else {
                    miTabla.writeChar(' '); //rellena con espacios en blanco hasta 20
                }
            }
            miTabla.writeInt(edad);
            miTabla.writeDouble(peso);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        if (!existe) {
            System.out.println("No existe");
        }

    }

    public void leeRegistro(int numeroRegistros) {
        try {
            miTabla.seek(0);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        for (int num = 1; num <= numeroRegistros; num++) {
            try {
                nombre = ""; //inicializa para cada registro
                nRegistro = miTabla.readInt();
                for (int i = 0; i < 20; i++) {
                    nombre += miTabla.readChar();
                }
                edad = miTabla.readInt();
                peso = miTabla.readDouble();
                if (nRegistro != 0)//para bajas lo pongo a 0
                {
                    System.out.println("Número: " + nRegistro);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Edad: " + edad);
                    System.out.println("Peso: " + peso);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void escribeRegistro(int nRegistro, String nombre, int edad,
            double peso) {
        try {
            miTabla.seek(miTabla.length());
            miTabla.writeInt(nRegistro);
            for (int i = 0; i < 20; i++) {
                if (i < nombre.length()) {
                    miTabla.writeChar(nombre.charAt(i));
                } else {
                    miTabla.writeChar(' '); //rellena con espacios en blanco hasta 20
                }
            }
            miTabla.writeInt(edad);
            miTabla.writeDouble(peso);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public void cierraTabla() {
        try {
            miTabla.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
