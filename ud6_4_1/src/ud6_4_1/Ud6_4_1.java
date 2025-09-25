package ud6_4_1;

import java.util.Scanner;

public class Ud6_4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        boolean existe;
        int num, np;
        String nombre;
        double nota;
        Menu menu = new Menu();
        Actualizar t = new Actualizar();
        //recuperar datos
        t.recuperarDatos();
        do {
            opcion = menu.dameOpcion();
            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduce el nombre: ");
                    nombre = sc.nextLine();
                    do {
                        System.out.print("Introduce el nº del alumno: ");
                        np = Integer.parseInt(sc.nextLine());
                    } while (t.comprobarExiste(np));
                    System.out.print("Introduce nota media: ");
                    nota = Double.parseDouble(sc.nextLine());
                    Alumno alu = new Alumno(nombre, np, nota);
                    t.escribeArray(alu);
                    break;

                case 2: //Da de baja:localizar poner a null
                    System.out.print("Número a eliminar: ");
                    num = Integer.parseInt(sc.nextLine());
                    t.borrar(num);
                    break;
                case 3:
                    System.out.println("Listado");
                    t.listado();
                    break;
                case 4: //Modificación
                    System.out.print("Número a modificar: ");
                    num = Integer.parseInt(sc.nextLine());
                    t.modificar(num);
                    break;
                case 5: //Busqueda .
                    System.out.print("Número a consultar: ");
                    num = Integer.parseInt(sc.nextLine());
                    t.consultar(num);
                    break;
                case 6:
                    System.out.println("Salir");
                    t.grabarDatos();
                    break;
                default:
                    System.out.println("La opcion es incorreta");
            }
        } while (opcion != 6);
    }

}
