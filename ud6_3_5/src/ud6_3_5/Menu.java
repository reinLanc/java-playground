package ud6_3_5;

import java.util.Scanner;

public class Menu {
    byte opcion;
    Scanner teclado;
    
    public byte dameOpcion() {
        teclado = new Scanner(System.in);
        System.out.println("\nOpciones \n");
        System.out.println("1-Altas");
        System.out.println("2-Bajas");
        System.out.println("3-Listados");
        System.out.println("4-Modificacion");
        System.out.println("5-Busqueda");
        System.out.println("6-Salir!");
        System.out.println("Selecciona una opcion");
        opcion = Byte.parseByte(teclado.nextLine());
        return opcion;
    }
}
