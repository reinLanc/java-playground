/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_5_3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Introducir Fecha 1:");
        Scanner teclado = new Scanner(System.in);
        String fechaInicial = teclado.nextLine();

        LocalDate fecha = LocalDate.parse(fechaInicial, fechaFormateada);
        DateTimeFormatter fechaFormateada2
                = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Introducir Fecha 2:");
        String fechaInicial2 = teclado.nextLine();

        LocalDate fecha2 = LocalDate.parse(fechaInicial2, fechaFormateada2);
        System.out.println("Fecha 1: " + fecha);
        System.out.println("Fecha 2: " + fecha2);
        //suma de fechas
        Period period = Period.between(fecha, fecha2);
        System.out.println("Diferencia = " + period.getYears() + " años " + period.getMonths() + " meses " + period.getDays() + " días");
    }

}
