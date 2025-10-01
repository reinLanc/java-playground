/*
 * Programa que lee por teclado el importe de compras de una serie de clientes y
 * calcula el importe total de las mismas después de aplicar un descuento que 
 * depende del importe. También calcula el valor medio de las compras.
 */
package ud2_ampliacion2;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Ampliacion2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce importe de compras del cliente (<=0 para salir): ");
        double importe = teclado.nextDouble();

        double suma = 0;
        int clientes = 0;
        while (importe > 0) {

            int descuento = 0;
            // En función del importe, le asignamos el valor
            // correspondiente a la variable descuento
            if (importe >= 0 && importe < 600) {
                descuento = 0;
            } else if (importe >= 600 && importe <= 3000) {
                descuento = 5;
            } else if (importe > 3000 && importe <= 5000) {
                descuento = 10;
            } else {
                descuento = 15;
            }

            // Calculamos importe a cobrar teniendo en cuenta el descuento y lo
            // mostramos
            double importeCobrar = importe - importe * descuento / 100;
            System.out.println("Importe a cobrar: " + importeCobrar + "\n");

            // Vamos sumando el importe que se le cobra a cada cliente para
            // después obtener el valor medio y vamos contando el número de
            // clientes
            suma += importeCobrar;
            clientes++;

            System.out.print("Introduce importe de compras del cliente (<=0 para salir): ");
            importe = teclado.nextDouble();
        }

        // Mostramos el valor medio de las compras. Sólo lo sacamos si ha habido
        // al menos un cliente.
        if (clientes > 0) {
            System.out.println("\nNumero de clientes: " + clientes);
            System.out.println("Valor medio de las compras: " + (suma / clientes));
        }
    }

}
