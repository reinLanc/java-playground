package ud4_1_6;

import java.util.Scanner;

public class Ud4_1_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla[][];
        int i,j;
        int suma=0;
        
        tabla = new int[4][4];
        System.out.println("INTRODUCE TABLA 4X4");
        for(i=0;i<4;i++)
            for(j=0;j<4;j++)
            {
                System.out.println("Introduce posicion "+i+" "+j);
                tabla[i][j]=Integer.parseInt(teclado.nextLine());
            }    
        
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.printf("%6d",tabla[i][j]);
                suma+=tabla[i][j];
            }          
            System.out.println();
        }
        System.out.println("Suma total "+suma);

    }

}
