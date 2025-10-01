package practica5_2_n;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practica5_2_N {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String cadea;
        LocalDate fecha,fechaX;

        System.out.println("Introduce la fecha de nacimiento:");
        cadea = teclado.nextLine();
        fecha = LocalDate.parse(cadea, formato);
        fechaX = fecha.plusYears(67);
        System.out.println(fechaX.format(formato));
    }
    
}
