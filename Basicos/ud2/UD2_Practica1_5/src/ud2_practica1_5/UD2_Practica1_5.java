/*
 * Programa que calcula el importe final a pagar por una compra teniendo en 
 * cuenta que se introducen por teclado el precio del artículo (tipo float) y el
 * número de unidades (tipo int) y que existen los siguientes descuentos:
 *  -Si compramos mas de 100 unidades de un mismo articulo, el descuento es del 40%.
 *  -Si compramos entre 25 y 100, el descuento es del 20%.
 *  -Si compramos entre 10 y 25, el descuento es de un 10%.
 *  -No hay descuento por la compra de menos de 10 unidades.
 */
package ud2_practica1_5;

import java.util.*;

public class UD2_Practica1_5 {

    public static void main(String[] args) {
        float precio;
        int numUnidades;
        // Variable que contendrá el descuento dependiendo del número de unidades
        int descuento;         
        // Creamos un objeto de tipo Scanner para leer datos por teclado 
        Scanner teclado = new Scanner(System.in);
        float importeSinDescuento;
        float importeConDescuento;
        
        // Pedimos al usuario el precio del artículo y el número de unidades:
        System.out.print("Introduce el precio del artículo: ");
        precio = teclado.nextFloat();
        System.out.print("Introduce el número de unidades: ");
        numUnidades = teclado.nextInt();
        
        // Dependiendo del número de unidades, asignamos a la variable
        // descuento el valor correspondiente
        if (numUnidades > 100){
             descuento = 40;
        } else if (numUnidades >= 25){
            descuento = 20;
        } else if (numUnidades >= 10){
            descuento = 10;
        } else{
            descuento = 0;
        }
        
        // Calculamos el importe final sin y con descuento
        importeSinDescuento = precio * numUnidades;
        importeConDescuento = importeSinDescuento 
                              - importeSinDescuento * descuento / 100;
        
        // Mostramos el importe final de la compra
        System.out.println("El importe final de la compra es " 
                            + importeConDescuento);
        
    }
    
}