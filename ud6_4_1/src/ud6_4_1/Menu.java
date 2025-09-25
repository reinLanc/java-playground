package ud6_4_1;

import java.util.Scanner;

public class Menu {

    byte opcion;
    Scanner teclado;

    public byte dameOpcion() {
        teclado = new Scanner(System.in);
        System.out.println("\nOpciones \n");
        System.out.println("1.-Altas");
        System.out.println("2.-Bajas");
        System.out.println("3.-Listados");
        System.out.println("4.-Modificación");
        System.out.println("5.-Búsqueda");
        System.out.println("6.-Salir");
        System.out.println("Selecciona una opción");
        opcion = Byte.parseByte(teclado.nextLine());
        return opcion;
    }
}
