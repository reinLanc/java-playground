package factura1;

import java.util.LinkedList;
import java.util.Scanner;

public class Factura1 {

    public static void main(String[] args) {
        LinkedList<Producto> productos = new LinkedList<>();
        generarProductos(productos);
        String ticket = "Nombre*****Cantidad***Precio***Total\n";
        double precioTotal = 0;
        Producto productoActual;

        //Recorremos la lista
        for (int i = 0; !productos.isEmpty(); i++) {

            productoActual = productos.pop();
            precioTotal += productoActual.precioFinal();
            ticket += productoActual.getNombre() + "\t \t" + productoActual.getCantidad()
                    + "\t" + (double)productoActual.getPrecio()
                    + "\t" + (double)productoActual.precioFinal() + "\n";

        }

        ticket += "Precio final\t\t\t" + precioTotal;

        System.out.println(ticket);

    }

    /**
     * Genera productos que se almacenan en la lista
     *
     * @param lista
     */
    public static void generarProductos(LinkedList<Producto> lista) {

        int numeroPersonas = generaNumeroAleatorio(1, 3);
        String nombre;
        int cantidad;
        double precio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Presiona enter para iniciar la compra");
        for (int i = 0; i <= 2; i++) {
            teclado.nextLine();
            System.out.println("Introduce nombre del producto:");
            nombre = teclado.nextLine();
            System.out.println("Introduce la cantidad del articulo");
            cantidad = teclado.nextInt();
            precio = (double)(generaNumeroRealAleatorio(1, 10) * cantidad);
            lista.addLast(new Producto(nombre, cantidad, (double)precio));
        }

    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

    public static double generaNumeroRealAleatorio(double minimo, double maximo) {

        double num = Math.rint(Math.floor(Math.random() * (minimo - ((maximo * 100) + 1)) + ((maximo * 100) + 1))) / 100;
        return num;

    }

}
