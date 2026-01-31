
package pruebasumfechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import static java.util.Calendar.MONTH;

public class Pruebasumfechas {

    public static void main(String[] args) {
        LocalDate a = LocalDate.of(MONTH, Month.MARCH, MONTH);
        int contador = 0;
        for(int i = 1; i<=12;i++)
            for(int j = 1; j<= a.lengthOfMonth();j++){
                for(int x = 2021; x<=2021;x++){
                a = LocalDate.of(1997,11,j);
                if(a.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                    contador++;
                }
            }
    }
        System.out.println(contador);
    }
}
