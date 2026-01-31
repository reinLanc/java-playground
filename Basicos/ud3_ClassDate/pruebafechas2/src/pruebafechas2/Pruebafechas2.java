package pruebafechas2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Pruebafechas2 {

    public static void main(String[] args) {
        int contador = 0;
        LocalDate fecha = LocalDate.of(2023, Month.FEBRUARY,1);
        for (int i = 1; i <= fecha.lengthOfMonth(); i++) {
            fecha = LocalDate.of(2024, Month.DECEMBER, i);
            if (fecha.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                contador++;
            }
        }
        System.out.println("El año  "+ fecha.getYear()+" tiene " + fecha.getDayOfYear() + " dias");
    }
}
