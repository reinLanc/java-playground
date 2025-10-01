package practica682;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Practica68_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String hora1,hora2;
        Duration d;
        LocalDateTime ld1,ld2;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("Introduza a primeira hora: ");
        hora1 = teclado.nextLine();
        while(!comprobar(Integer.parseInt(hora1.substring(0,2)),
                         Integer.parseInt(hora1.substring(3,5)),
                         Integer.parseInt(hora1.substring(6,8))))
        {
            System.out.println("Hora incorrecta. Introduza a primeira hora de novo: ");
            hora1 = teclado.nextLine();
        }
        
        System.out.println("Introduza a segunda hora: ");
        hora2 = teclado.nextLine();
        while(!comprobar(Integer.parseInt(hora2.substring(0,2)),
                         Integer.parseInt(hora2.substring(3,5)),
                         Integer.parseInt(hora2.substring(6,8))))
        {
            System.out.println("Hora incorrecta. Introduza a segunda hora de novo: ");
            hora2 = teclado.nextLine();
        }     

        ld1=LocalDateTime.parse("01/01/2000 "+hora1,formato);
        ld2=LocalDateTime.parse("01/01/2000 "+hora2,formato);
        d = Duration.between(ld1, ld2);
        desglosarHora((int)(Math.abs(d.getSeconds())));  
    }
    
    
    public static boolean comprobar(int h, int m, int s)
    {
        return !(h<0 || h>23 || m<0 || m>59 || s<0 || s>59);
    }
    
    
    public static void desglosarHora(int diferencia)
    {
        int h,m,s;
        
        s = diferencia%60;
        diferencia = diferencia/60;
        m = diferencia%60;
        h = diferencia/60; 
        
        System.out.printf("%02d:%02d:%02d",h,m,s);
    }
    
}
