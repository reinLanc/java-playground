/*
Un supermercado nos pide que hagamos una pequeña aplicación que almacene los productos 
pasados por el escaner.
La aplicación debe almacenar Productos (clase), cada producto al crearse contiene una cantidad, un precio
(estos dos generados aleatoriamente). El nombre del producto será básico
(producto1, producto2, producto3, etc.).

El precio ya viene con los impuestos incluidos.

Calcular el precio total de una lista de entre 1 y 8 productos (aleatorio).
Mostrar un ticket con todo lo vendido y el precio final como se hacen en los supermercados. 
Más o menos con este formato, lo importante son los datos, no el estilo:

                        Cantidad          Precio                        Total

Producto1           5                    3.5                             17.5

Producto2           7                    2.5                             17.5

Precio final                                                                    35
 */
package Ejercicio3;

import common.Producto;
import java.util.LinkedList;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        //Creamos la lista de productos
        LinkedList<Producto> productos = new LinkedList<>();

        //Generamos los productos
        generarProductos(productos);

        //Declaramos variables que necesitaremos
        String ticket = "             Cantidad   Precio   Total\n";
        double precioTotal = 0;
        Producto productoActual;

        //Recorremos la lista
        for (int i = 0; !productos.isEmpty(); i++) {

            productoActual = productos.poll();
            precioTotal += productoActual.precioFinal();
            ticket += "Producto" + (i + 1) + "\t" + productoActual.getCantidad()
                    + "\t" + productoActual.getPrecio()
                    + "\t" + productoActual.precioFinal() + "\n";

        }

        ticket += "Precio final\t \t \t" + precioTotal;

        System.out.println(ticket);

    }

    /**
     * Genera productos que se almacenan en la lista
     *
     * @param lista
     */
    public static void generarProductos(LinkedList<Producto> lista) {

        int numeroPersonas = generaNumeroAleatorio(1, 8);

        int cantidad;
        double precio;

        for (int i = 0; i < numeroPersonas; i++) {
            cantidad = generaNumeroAleatorio(1, 10);;
            precio = generaNumeroRealAleatorio(0.05, 50);
            lista.addLast(new Producto(cantidad, precio));
        }

    }

    /**
     * Genera un numero aleatorio entre dos numeros. Entre el minimo y el maximo
     * incluidos
     *
     * @param minimo Número mínimo
     * @param maximo Número máximo
     * @return Número entre minimo y maximo
     */
    public static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

    /**
     * Genera un numero aleatorio entre dos numeros reales. Entre el minimo y el
     * maximo incluidos Devuelve un numero con dos decimales.
     *
     * @param minimo Número mínimo
     * @param maximo Número máximo
     * @return Número entre minimo y maximo
     */
    public static double generaNumeroRealAleatorio(double minimo, double maximo) {

        //double num = Math.rint(Math.floor(Math.random() * (minimo - ((maximo * 100) + 1)) + ((maximo * 100) + 1))) / 100;
        //    return num;
        double num = Math.rint(Math.floor(Math.random() * (minimo - ((maximo * 100) + 1)) + ((maximo * 100) + 1))) / 100;
        return Math.round(num * 100.0) / 100.0;

    }
}
