package practica5_4_n;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practica5_4_N {

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM yyy");
        LocalDate fechaInicioMes = LocalDate.of(fechaActual.getYear(), fechaActual.getMonth(), 1);
        int primerDia;
        int diasMes;
        
        primerDia = fechaInicioMes.getDayOfWeek().getValue();
        diasMes = fechaActual.lengthOfMonth();
        
        System.out.println("             "+fechaActual.format(formato));
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
