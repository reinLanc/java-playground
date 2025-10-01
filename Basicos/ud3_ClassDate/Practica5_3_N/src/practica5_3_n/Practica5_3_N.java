package practica5_3_n;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practica5_3_N {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String cadea;
        LocalDateTime fecha1,fecha2;
        Duration intervalo;

        System.out.println("Introduce la fecha primera fecha:");
        cadea = teclado.nextLine();
        fecha1 = LocalDateTime.parse(cadea, formato);
        System.out.println("Introduce la fecha segunda fecha:");
        cadea = teclado.nextLine();
        fecha2 = LocalDateTime.parse(cadea, formato);
        intervalo = Duration.between(fecha1, fecha2);
        System.out.println(intervalo.toDays()+" dias");
    }
    
}
