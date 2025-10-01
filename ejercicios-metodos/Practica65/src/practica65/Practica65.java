package practica65;

import java.time.LocalDate;
import java.util.Scanner;

public class Practica65 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int dia, mes, año, maxDiasMes;
        String error = "";

        System.out.println("Introduce dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce año: ");
        año = teclado.nextInt();

        if (año < 0) {
            error += "Año incorrecto, menor que cero\n";
        }
        if (mes < 1) {
            error += "Mes incorrecto, menor que 1\n";
        }
        if (mes > 12) {
            error += "Mes incorrecto, mayor que 12\n";
        }
        if (dia < 1) {
            error += "Día incorrecto, menor que 1\n";
        }
        if (error.length() == 0) {
            maxDiasMes = diasMes(mes, año);
            if (dia > maxDiasMes) {
                error += "Día incorrecto, mayor que " + maxDiasMes;
            }
        }
        if (error.length() > 0) {
            System.out.println(error);
        } else {
            System.out.println("Fecha correcta");
        }
    }

    static int diasMes(int m, int a) {
        return LocalDate.of(a, m, 1).lengthOfMonth();
    }
}
