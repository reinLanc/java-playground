/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafechas;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Pruebafechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha;
        for (int i = 2000; i <= 3000; i++) {
            fecha = LocalDate.of(i, Month.JANUARY, 1);
            if (fecha.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                System.out.println("Año: " + fecha.getYear());
            }
        }
        System.out.println("-------------");
    }
}
