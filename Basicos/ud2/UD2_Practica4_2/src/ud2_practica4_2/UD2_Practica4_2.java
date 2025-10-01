package ud2_practica4_2;

import java.util.Scanner;

public class UD2_Practica4_2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota, suma=0, conta=0;
        
        do {
            System.out.println("Introduce nota entre 0 y 10, 99 finaliza");
            nota = teclado.nextDouble();
            if (nota != 99) {//plantear soluciones alternativas, una con bucle y otra con if
                if (nota < 0 || nota > 10) {
                    System.out.println("Error, nota no válida");
                    continue;
                }
                suma += nota;
                conta++;
            }
        } while (nota != 99);
        if(conta>0)
            System.out.println("Media: "+(suma/conta));
    }

}
