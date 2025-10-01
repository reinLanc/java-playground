/*
 * Cálculo del precio al que se debe vender un artículo para obtener una
 * ganancia del 30%
 */
package practica3_4;

public class Practica3_4 {

    public static void main(String[] args) {
        double precio = 114.50; // Precio de compra del artículo
        double ganancia = 30; // Ganancia a conseguir
        
        // Cálculo y visualización del precio de venta final
        double precioVenta = precio + precio * ganancia /100;
        double precioVenta2 = precio/0.7;
        System.out.println("Calculado sobre precio de compra");
        System.out.println("Precio de venta: " + precioVenta + " euros.");
        System.out.println("Calculado sobre precio de venta");
        System.out.println("Precio de venta: " + precioVenta2 + " euros.");        
    }
    
}
