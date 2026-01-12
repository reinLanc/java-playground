package bisiesto;

import java.util.GregorianCalendar;

public class Bisiesto {

    public static void main(String[] args) {
        /*   int contador = 0;
       for(int i = 2000; i<= 3000;i++) {
           if((i % 4 == 0) && ((i % 100 != 0) || (i% 400 == 0))){
               System.out.println(i);
           contador++;
           }
           if(contador == 10)
               break;
       }*/
        GregorianCalendar calendar = new GregorianCalendar();
        int contador = 0;
        for (int i = 2000; i <= 3000; i++) {
            if (calendar.isLeapYear(i)) {
                System.out.println(i);
                contador++;
                if (contador == 10) {
                    break;
                }
            }
        }

    }
}
