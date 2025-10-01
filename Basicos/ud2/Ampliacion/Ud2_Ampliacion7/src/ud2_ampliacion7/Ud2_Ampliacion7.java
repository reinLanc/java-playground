/*
 * Se introducen por teclado el código, precio y número de unidades vendidas de un
 * conjunto de 10 artículos El precio y las unidades deben ser mayores que 0. Si los
 * datos no son correctos se pedirán de nuevo. El programa calcula la cantidad a pagar por cada
 * artículo teniendo en cuenta que se aplicará un descuento dependiendo del número
 * de unidades y del precio.
 */
package ud2_ampliacion7;

import java.util.*;

/**
 *
 * @author
 */
public class Ud2_Ampliacion7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce código de artículo: ");
            int codigo = teclado.nextInt();

            System.out.print("Introduce precio de artículo: ");
            double precio = teclado.nextDouble();
            while (precio <= 0) {
                System.out.print("ERROR. Introduce precio de artículo: ");
                precio = teclado.nextInt();
            }

            System.out.print("Introduce número de unidades vendidas: ");
            int unidades = teclado.nextInt();
            while (unidades <= 0) {
                System.out.print("ERROR. Introduce número de unidades vendidas: ");
                unidades = teclado.nextInt();
            }

            int descuento = 0;
            // En función del importe, le asignamos el valor
            // correspondiente a la variable descuento
            if (unidades < 10) {
                descuento = 0;
            } else if (unidades >= 10 && unidades < 20) {
                if (precio > 150){
                    descuento = 10;
                } else {
                    descuento = 5;
                }
            } else if (unidades > 20) {
                if (precio > 150){
                    descuento = 20;
                } else {
                    descuento = 15;
                }
            }

            // Calculamos precio final del artículo teniendo en cuenta el descuento y lo
            // mostramos
            double precioFinal = precio * unidades;
            precioFinal = precioFinal - precioFinal * descuento / 100;
            System.out.println("Precio final: " + precioFinal + "\n");
        }
    }

}
