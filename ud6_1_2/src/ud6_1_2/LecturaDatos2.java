package ud6_1_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LecturaDatos2 {
        static Scanner entrada = new Scanner(System.in);

    LecturaDatos2() {
        entrada = new Scanner(System.in);
    }

    public String leeTexto(String resultado) {
        boolean error = false;
        String texto = "";
        do {
            error = false;
            System.out.print(resultado + ":");
            try {
                texto = entrada.nextLine();
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return texto;
    }

    public int leeEntero(String resultado) {
        boolean error = false;
        int entero = 0;
        do {
            error = false;
            try {
                System.out.println(resultado + ":");
                entero = entrada.nextInt();
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return entero;
    }

    public double leeDoble(String resultado) {
        boolean error = false;
        double doble = 0;
        do {
            error = false;
            try {
                System.out.println(resultado + ":");
                doble = entrada.nextDouble();
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return doble;

    }

    public char leeCaracter(String resultado) {
        boolean error = false;
        char caracter = ' ';
        do {
            error = false;
            try {
                System.out.println(resultado + ":");
                caracter = entrada.nextLine().charAt(0);
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return caracter;
    }
}
