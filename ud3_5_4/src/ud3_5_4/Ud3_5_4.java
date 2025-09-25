/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_5_4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author gilguerei
 */
public class Ud3_5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.of(2007, Month.NOVEMBER, 1);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM yyy");
        LocalDate fechaInicioMes = LocalDate.of(fechaActual.getYear(), fechaActual.getMonth(), 1);
        int primerDia;
        int diasMes;

        primerDia = fechaInicioMes.getDayOfWeek().getValue();
        diasMes = fechaActual.lengthOfMonth();

        System.out.println("             " + fechaActual.format(formato));
        System.out.println("   Lu   Ma   Mi   Ju   Vi   Sa   Do");

        for (int i = 1; i < primerDia; i++) {
            System.out.print("     ");
        }

        for (int i = 1; i <= diasMes; i++) {
            System.out.printf("%5d", i);

            if ((i + primerDia - 1) % 7 == 0) {
                System.out.println();
            }

        }

    }

}
