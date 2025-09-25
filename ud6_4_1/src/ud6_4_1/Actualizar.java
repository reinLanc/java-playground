package ud6_4_1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Actualizar implements Serializable {

    Scanner sc = new Scanner(System.in);
    private int nAlumno = 0;
    Alumno al;
    Alumno listaAlumnos[] = new Alumno[100];

    public void recuperarDatos() {
        try {
            FileInputStream fe = new FileInputStream("alumnos2");
            ObjectInputStream fie = new ObjectInputStream(fe);
            try {
                al = (Alumno) fie.readObject();
                while (al != null) {
                    listaAlumnos[nAlumno] = al;
                    nAlumno++;
                    al = (Alumno) fie.readObject();
                }
            } catch (EOFException eof) {//si no la capturo sale error, ya que alcanzó el final del fichero leyendo
                fie.close();
            }
//            fe.close();}
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
//          for (int i=0;i<nAlumno;i++)
//          {
//             if (listaAlumnos[i]!=null)
//              System.out.println(listaAlumnos[i].dameNumero()+ " "+listaAlumnos[i].dameNombre() +" "+listaAlumnos[i].dameNota());
//          }

    }

    public void grabarDatos() {
        FileOutputStream f = null;
        ObjectOutputStream fis = null;
        try {
            f = new FileOutputStream("alumnos2");
            fis = new ObjectOutputStream(f);
            for (int i = 0; i < nAlumno; i++) {
                if (listaAlumnos[i] != null) {
                    fis.writeObject(listaAlumnos[i]);
                }
            }
            fis.close();
//                 f.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void borrar(int num) {
        boolean existe = false;
        int i;
        for (i = 0; i < nAlumno && !existe; i++) {
            if (listaAlumnos[i] != null && num == listaAlumnos[i].dameNumero()) {
                System.out.println(listaAlumnos[i].dameNumero() + " " + listaAlumnos[i].dameNombre() + " " + listaAlumnos[i].dameNota());
                existe = true;
                System.out.println("Está seguro (S/N)?");
                char respuesta = sc.nextLine().toUpperCase().charAt(0);
                if (respuesta == 'S') {
                    listaAlumnos[i] = null;
                } else {
                    System.out.println("Operación cancelada a petición del usuario");
                }
            }
        }
        if (!existe) {
            System.out.println("Error, el alumno no existe");
        }
    }
//

    public boolean comprobarExiste(int num) {
        boolean existe = false;

        for (int i = 0; i < nAlumno && !existe; i++) {
            if (listaAlumnos[i] != null && num == listaAlumnos[i].dameNumero()) {
                existe = true;
            }

        }
        if (existe) {
            System.out.println("Error, el número ya existe en el fichero");
        }
        return existe;
    }

    public void consultar(int num) {
        boolean existe = false;

        for (int i = 0; i < nAlumno && !existe; i++) {
            if (listaAlumnos[i] != null && num == listaAlumnos[i].dameNumero()) {
                System.out.println(listaAlumnos[i].dameNumero() + " " + listaAlumnos[i].dameNombre() + " " + listaAlumnos[i].dameNota());
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("Error, el alumno no existe en el fichero");
        }

    }

    public void modificar(int num) {
        boolean existe = false;
        int opcion, i;
        for (i = 0; i < nAlumno && !existe; i++) {
            if (listaAlumnos[i] != null && num == listaAlumnos[i].dameNumero()) {
                System.out.println(listaAlumnos[i].dameNumero() + " " + listaAlumnos[i].dameNombre() + " " + listaAlumnos[i].dameNota());
                existe = true;
                do {
//                 Alumno al=new Alumno();
                    System.out.println("1. Nombre ");
                    System.out.println("2. Nota ");
                    System.out.println("0. Fin");
                    System.out.println("Introduzca opción a modificar, 0 finaliza");
                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();
                            listaAlumnos[i].ponNombre(nombre);
                            break;
                        case 2:
                            System.out.print("Nota: ");
                            double nota = Integer.parseInt(sc.nextLine());
                            listaAlumnos[i].ponNota(nota);
                            break;
                        case 0:
                            System.out.println("Salir");
                            break;
                        default:
                            System.out.println("La opcion es incorreta");
                    }
                } while (opcion != 0);
            }
        }
        if (!existe) {
            System.out.println("No existe");
        }

    }

    public void listado() {
        for (int i = 0; i < nAlumno; i++) {
            if (listaAlumnos[i] != null) {
                System.out.println(listaAlumnos[i].dameNumero() + " " + listaAlumnos[i].dameNombre() + " " + listaAlumnos[i].dameNota());
            }
        }
    }

    public void escribeArray(Alumno alu) {
        listaAlumnos[nAlumno] = alu;
        nAlumno++;

    }

}
