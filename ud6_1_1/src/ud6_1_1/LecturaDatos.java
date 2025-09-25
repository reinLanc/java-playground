package ud6_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDatos {

    BufferedReader entrada;

    LecturaDatos() {
        this.entrada = new BufferedReader(new InputStreamReader(System.in));
    }

    public String leeTexto(String resultado) {
        boolean error = false;
        String texto = "";
        do {
            error = false;
            System.out.print(resultado + ":");
            try {
                texto = entrada.readLine();
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
                entero = Integer.parseInt(entrada.readLine());
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
                doble = Double.parseDouble(entrada.readLine());
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
                caracter = (entrada.readLine()).charAt(0);
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return caracter;
    }
}
