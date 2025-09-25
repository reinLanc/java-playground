
package ud4_1_7;

import java.util.Scanner;

public class Ud4_1_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla1[][], tabla2[][];
        int tablaSuma[][], tablaResta[][];
        int i,j;
        
        tabla1 = new int[3][3];
        tabla2 = new int[3][3];
        System.out.println("INTRODUCE PRIMERA TABLA 3X3");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                System.out.println("Introduce posicion "+i+" "+j);
                tabla1[i][j]=Integer.parseInt(teclado.nextLine());
            }    
        System.out.println("INTRODUCE SEGUNDA TABLA 3X3");
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                System.out.println("Introduce posicion "+i+" "+j);
                tabla2[i][j]=Integer.parseInt(teclado.nextLine());
            }         
        
        tablaSuma = new int[3][3];
        tablaResta = new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                tablaSuma[i][j]=tabla1[i][j]+tabla2[i][j];       
            System.out.println();
        }        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                tablaResta[i][j]=tabla1[i][j]-tabla2[i][j];       
            System.out.println();
        }          
        System.out.println("TABLA 1");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                System.out.printf("%6d",tabla1[i][j]);          
            System.out.println();
        }        
        System.out.println("TABLA 2");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                System.out.printf("%6d",tabla2[i][j]);          
            System.out.println();
        }               
        System.out.println("TABLA SUMA");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                System.out.printf("%6d",tablaSuma[i][j]);          
            System.out.println();
        }
        System.out.println("TABLA RESTA");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
                System.out.printf("%6d",tablaResta[i][j]);          
            System.out.println();
        }        

    }
    
}
