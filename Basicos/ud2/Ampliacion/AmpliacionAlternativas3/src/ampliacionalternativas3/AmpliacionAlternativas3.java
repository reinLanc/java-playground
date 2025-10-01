package ampliacionalternativas3;

import java.util.Scanner;

public class AmpliacionAlternativas3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        
        System.out.println("Introduce una cantidad");
        cantidad = teclado.nextInt();       
        if(cantidad<0)
            System.out.println("Error la cantidad no puede ser menor que cero");
        else if(cantidad<500)
            cantidad=cantidad+cantidad/2;
        else if(cantidad<1000)
            cantidad*=1.07;
        else if(cantidad<5000)
            cantidad*=1.15;
        else
            cantidad-=(int)(cantidad*0.05);
        
        if(cantidad>=0)
            System.out.println("Cantidad: "+cantidad);
        
    }
    
}
