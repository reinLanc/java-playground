package pruebafechas3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pruebafechas3 {

    public static void main(String[] args) {
 LocalDate fecha = LocalDate.of(2028,Month.FEBRUARY,1);
        System.out.println("Febrero de " + fecha.getYear() +  " tiene " + fecha.lengthOfMonth() + " dias.");
    }
}
