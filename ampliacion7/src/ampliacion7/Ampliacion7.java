package ampliacion7;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ampliacion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduzca el código del articulo " + i + ":");
            int codArticulo = teclado.nextInt();
            System.out.println("Introduzca el precio del articulo " + codArticulo);
            double precio = teclado.nextDouble();
            while (precio < 0) {
                System.out.println("El precio debe ser mayor que 0...");
                precio = teclado.nextDouble();
            }
            System.out.println("Introduzca la cantidad de unidades del articulo");
            int cantidad = teclado.nextInt();
            while (cantidad < 0) {
                System.out.println("Debe haber al menos una unidad...");
                cantidad = teclado.nextInt();
            }
            int descuento = 0;
            if (cantidad < 10) {
                descuento = 0;
            } else if (cantidad >= 10 && cantidad < 20) {
                if (precio > 150) {
                    descuento = 10;
                } else {
                    descuento = 5;
                }
            } else if (cantidad >= 20) {
                if (precio > 150) {
                    descuento = 20;
                } else {
                    descuento = 15;
                }
            }
            double precio2 = precio*cantidad;
            double precioFinal = precio2 - (precio2 * descuento/100);
            System.out.println("Articulo: " + codArticulo);
            System.out.println("Precio: " + precio + " €");
            System.out.println("Unidades:" + cantidad);
            System.out.println("Descuento: " + descuento + "%");
            System.out.println("Precio total: " + precioFinal + " €");
        }
    }

}
