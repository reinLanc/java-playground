package fichero9;

import java.util.Scanner;

public class Fichero9 {

    static boolean responde(String pregunta) {

        boolean r = false;
        boolean salida = false; // Lo uso para salir del do while
        Scanner sc = new Scanner(System.in);
        String linea = null;

        System.out.println(pregunta);
        do {
            linea = sc.nextLine();
            if (linea.equals("s") || linea.equals("S")) {
                r = true;
                salida = true;
            } else if (linea.equals("n") || linea.equals("N")) {
                r = false;
                salida = true;
            } else {
                System.out.println("Respuesta no válida.");
            }
        } while (salida == false);

        sc.close();

        return r;
    }

    public static void main(String[] args) {

        if (responde("¿No es verdad angel de amor que en esta apartada orilla si viene tu novio y nos pilla la ostia que me llevo es mayor?")) {
            System.out.println("Cierto, cierto");
        } else {
            System.out.println("Pues va a ser que no");
        }

    }

}
