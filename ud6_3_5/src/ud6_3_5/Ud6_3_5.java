package ud6_3_5;

import java.util.Scanner;

public class Ud6_3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion;
        int num;
        boolean existe;
        Menu menu = new Menu();
        TablaBaseDatos t = new TablaBaseDatos("Datos4.dat");
        do {
            opcion = menu.dameOpcion();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.print("Peso: ");
                    double peso = Double.parseDouble(sc.nextLine());
                    int nR = t.dameNumeroRegistros();
                    nR++;
                    t.escribeRegistro(nR, nombre, edad, peso);
                    break;

                case 2: //Da de baja un individuo:localizar poner a 0 el número
                    System.out.print("Número a eliminar: ");
                    num = Integer.parseInt(sc.nextLine());
                    existe = t.consultar(t.dameNumeroRegistros(), num);
                    if (existe) {
                        System.out.println("Está seguro (S/N)?");
                        char respuesta = sc.nextLine().toUpperCase().charAt(0);
                        if (respuesta == 'S') {
                            t.borrar(num);
                        } else {
                            System.out.println("Operación cancelada a petición del usuario");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Listado");
                    t.leeRegistro(t.dameNumeroRegistros());
                    break;
                case 4: //Modificación
                    System.out.print("Número a modificar: ");
                    num = Integer.parseInt(sc.nextLine());
                    existe = t.consultar(t.dameNumeroRegistros(), num);
                    if (existe) {
                        System.out.println("Está seguro (S/N)?");
                        char respuesta = sc.nextLine().toUpperCase().charAt(0);
                        if (respuesta == 'S') {
                            t.modificar(num);
                        } else {
                            System.out.println("Operación cancelada a petición del usuario");
                        }
                    }
                    break;
                case 5: //Busqueda .
                    System.out.print("Número a consultar: ");
                    num = Integer.parseInt(sc.nextLine());
                    t.consultar(t.dameNumeroRegistros(), num);
                    break;
                case 6:
                    System.out.println("Salir");
                    t.cierraTabla();
                    break;
                default:
                    System.out.println("La opcion es incorreta");
            }
        } while (opcion != 6);
    }

}
