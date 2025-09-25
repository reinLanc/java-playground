/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_5_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ud3_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter fechaFormateada
                = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Introducir Fecha de nacimiento:");
        Scanner teclado = new Scanner(System.in);
        String fechaInicial = teclado.nextLine();

        LocalDate fecha = LocalDate.parse(fechaInicial, fechaFormateada);
        System.out.println("Fecha de nacimiento: " + fecha);
        //sumamos 67 años...
        LocalDate fechaJub = fecha.plusYears(67);
        System.out.println("Fecha de Jubilación: " + fechaJub);
    }

}
