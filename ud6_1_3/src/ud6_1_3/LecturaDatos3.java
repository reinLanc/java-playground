package ud6_1_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LecturaDatos3 {

    BufferedReader entrada;

    LecturaDatos3() {
        this.entrada = new BufferedReader(new InputStreamReader(System.in));
    }

    public double leeMinimo(String resultado) {
        boolean error = false;
        double minimo = 0;
        do {
            error = false;
            try {
                System.out.println(resultado + ":");
                minimo = Double.parseDouble(entrada.readLine());
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return minimo;

    }

    public double leeMaximo(String resultado) {
        boolean error = false;
        double maximo = 0;
        do {
            error = false;
            try {
                System.out.println(resultado + ":");
                maximo = Double.parseDouble(entrada.readLine());
            } catch (Exception e) {
                error = true;
                System.out.println(e.getMessage());
            }
        } while (error);
        return maximo;

    }

    public static void conversor(double minimo, double maximo) {
        double resultado = 0;
        System.out.printf("Celsius         Farenheit\n");
        for (double i = minimo; i <= maximo; i++) {
            resultado = (i - 32) / 1.8;
            //System.out.printf(i + " " + resultado + "%10.2f");
            System.out.printf("%8.2f   %8.2f\n", i, resultado);
        }
    }
}
