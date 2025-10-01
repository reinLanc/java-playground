package practica64;

import java.time.LocalDate;
import java.util.Scanner;

public class Practica64 {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int mes,año;
        
        System.out.println("Introduce mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce año: ");
        año = teclado.nextInt();    
        System.out.println("Número de dias: "+diasMes(mes,año));
        
    }
    
    static int diasMes(int m, int a)
    {
        return LocalDate.of(a, m, 1).lengthOfMonth();
    }
     
}
