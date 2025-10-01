package ampliacionalternativas2;

import java.util.Scanner;

public class AmpliacionAlternativas2 {

    public static void main(String[] args) {
        int unidades;
        double precio,preciototal,descuento;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce número de unidades");
        unidades = teclado.nextInt();
        System.out.println("Introduce precio por unidad");
        precio = teclado.nextDouble();
        preciototal=precio*unidades;
        if(preciototal>60)
            descuento=preciototal*0.15;
        else
            descuento=preciototal*0.10;
        System.out.println("Numero de unidades vendidas: "+unidades);
        System.out.println("Precio por unidad: "+precio);
        System.out.println("Descuento: "+descuento);
        System.out.println("Cantidad a pagar: "+(preciototal-descuento));
        
    }
    
}
