package practica5_1_n;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practica5_1_N {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoDiaSemana = DateTimeFormatter.ofPattern("EEEE");
        String cadea;
        LocalDate fecha;

        System.out.println("Introduce la fecha de nacimiento:");
        cadea = teclado.nextLine();
        fecha = LocalDate.parse(cadea, formato);
        System.out.println("Naciste un "+fecha.format(formatoDiaSemana));
        System.out.println(fecha.getDayOfWeek());
    }

}
