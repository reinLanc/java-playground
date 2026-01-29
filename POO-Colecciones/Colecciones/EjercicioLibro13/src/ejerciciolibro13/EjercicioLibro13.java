/*
Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes mejoras: 
• Utiliza unalistaenlugardeunarrayparaelalmacenamientodelosdatos. 
• Comprueba la existencia del código en el alta, la baja y la modificación de artículos para evitar errores.
• Cambia la opción "Salida de stock" por "Venta". 
Esta nueva opción permitirá hacer una venta de varios artículos y emitir la factura correspondiente. 
Se debe preguntar por los códigos y las cantidades de cada artículo que se quiere comprar. 
Aplica un 21% de IVA.
 */
package ejerciciolibro13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro13 {

    // ArrayList para almacenar todos los artículos
    private static ArrayList<Articulo> almacen = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);
    private static final double IVA = 0.21; // 21% de IVA

    public static void main(String[] args) {
        int opcion;

        // Añadimos algunos artículos de ejemplo
        almacen.add(new Articulo("A001", "Teclado mecánico", 45.00, 75.00, 15));
        almacen.add(new Articulo("A002", "Ratón inalámbrico", 12.00, 25.00, 30));
        almacen.add(new Articulo("A003", "Monitor 24 pulgadas", 120.00, 200.00, 8));

        do {
            mostrarMenu();
            opcion = leerEntero();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    alta();
                    break;
                case 2:
                    baja();
                    break;
                case 3:
                    modificacion();
                    break;
                case 4:
                    entrada();
                    break;
                case 5:
                    venta();
                    break;
                case 6:
                    listado();
                    break;
                case 7:
                    System.out.println("\n¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción no válida.");
            }

        } while (opcion != 7);

        teclado.close();
    }

    /**
     * Muestra el menú principal
     */
    private static void mostrarMenu() {
        System.out.println("\n???????????????????????????????????????");
        System.out.println("         GESTISIMAL v2.0            ");
        System.out.println("???????????????????????????????????????");
        System.out.println("1. Alta de artículo");
        System.out.println("2. Baja de artículo");
        System.out.println("3. Modificación de artículo");
        System.out.println("4. Entrada de mercancía");
        System.out.println("5. Venta (emitir factura)");
        System.out.println("6. Listado de artículos");
        System.out.println("7. Salir");
        System.out.print("\nElige una opción: ");
    }

    /**
     * Da de alta un nuevo artículo
     */
    private static void alta() {
        System.out.println("\n--- ALTA DE ARTÍCULO ---");

        // Pedimos el código y verificamos que no exista
        System.out.print("Código: ");
        String codigo = teclado.nextLine().toUpperCase();

        if (buscarArticulo(codigo) != null) {
            System.out.println("ERROR: Ya existe un artículo con ese código.");
            return;
        }

        System.out.print("Descripción: ");
        String descripcion = teclado.nextLine();

        System.out.print("Precio de compra: ");
        double precioCompra = leerDouble();

        System.out.print("Precio de venta: ");
        double precioVenta = leerDouble();

        System.out.print("Stock inicial: ");
        int stock = leerEntero();
        teclado.nextLine(); // Limpiar buffer

        Articulo nuevo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        almacen.add(nuevo);

        System.out.println("\nArticulo dado de alta correctamente.");
    }

    /**
     * Da de baja un artículo
     */
    private static void baja() {
        System.out.println("\n--- BAJA DE ARTÍCULO ---");

        System.out.print("Código del artículo a eliminar: ");
        String codigo = teclado.nextLine().toUpperCase();

        Articulo articulo = buscarArticulo(codigo);

        if (articulo == null) {
            System.out.println("ERROR: No existe ningún artículo con ese código.");
            return;
        }

        System.out.println("Artículo encontrado: " + articulo.getDescripcion());
        System.out.print("¿Confirmas la eliminación? (S/N): ");
        String confirmacion = teclado.nextLine();

        if (confirmacion.equalsIgnoreCase("S")) {
            almacen.remove(articulo);
            System.out.println("\nArticulo eliminado correctamente.");
        } else {
            System.out.println("\nOperación cancelada.");
        }
    }

    /**
     * Modifica los datos de un artículo
     */
    private static void modificacion() {
        System.out.println("\n--- MODIFICACIÓN DE ARTÍCULO ---");

        System.out.print("Código del artículo: ");
        String codigo = teclado.nextLine().toUpperCase();

        Articulo articulo = buscarArticulo(codigo);

        if (articulo == null) {
            System.out.println("ERROR: No existe ningún artículo con ese código.");
            return;
        }

        System.out.println("\nDatos actuales:");
        System.out.println(articulo);
        System.out.println("\nIntroduce los nuevos datos (Enter para mantener):");

        System.out.print("Nueva descripción [" + articulo.getDescripcion() + "]: ");
        String descripcion = teclado.nextLine();
        if (!descripcion.isEmpty()) {
            articulo.setDescripcion(descripcion);
        }

        System.out.print("Nuevo precio de compra [" + articulo.getPrecioCompra() + "]: ");
        String precioCompraStr = teclado.nextLine();
        if (!precioCompraStr.isEmpty()) {
            articulo.setPrecioCompra(Double.parseDouble(precioCompraStr));
        }

        System.out.print("Nuevo precio de venta [" + articulo.getPrecioVenta() + "]: ");
        String precioVentaStr = teclado.nextLine();
        if (!precioVentaStr.isEmpty()) {
            articulo.setPrecioVenta(Double.parseDouble(precioVentaStr));
        }

        System.out.println("\nArticulo modificado correctamente.");
    }

    /**
     * Registra una entrada de mercancía
     */
    private static void entrada() {
        System.out.println("\n--- ENTRADA DE MERCANCÍA ---");

        System.out.print("Código del artículo: ");
        String codigo = teclado.nextLine().toUpperCase();

        Articulo articulo = buscarArticulo(codigo);

        if (articulo == null) {
            System.out.println("ERROR: No existe ningún artículo con ese código.");
            return;
        }

        System.out.println("Artículo: " + articulo.getDescripcion());
        System.out.println("Stock actual: " + articulo.getStock());

        System.out.print("Cantidad a añadir: ");
        int cantidad = leerEntero();
        teclado.nextLine();

        articulo.incrementarStock(cantidad);
        System.out.println("\nEntrada registrada. Nuevo stock: " + articulo.getStock());
    }

    /**
     * Realiza una venta y emite la factura
     */
    private static void venta() {
        System.out.println("\n???????????????????????????????????????????????????????????????");
        System.out.println("                      NUEVA VENTA                              ");
        System.out.println("???????????????????????????????????????????????????????????????");

        // ArrayList para almacenar los artículos vendidos con sus cantidades
        ArrayList<Articulo> articulosVendidos = new ArrayList<>();
        ArrayList<Integer> cantidadesVendidas = new ArrayList<>();

        String continuar = null;

        do {
            System.out.print("\nCódigo del artículo: ");
            String codigo = teclado.nextLine().toUpperCase();

            Articulo articulo = buscarArticulo(codigo);

            if (articulo == null) {
                System.out.println("ERROR: No existe ningún artículo con ese código.");
                continue;
            }

            System.out.println("Artículo: " + articulo.getDescripcion());
            System.out.println("Precio: " + articulo.getPrecioVenta() + "€");
            System.out.println("Stock disponible: " + articulo.getStock());

            System.out.print("Cantidad a vender: ");
            int cantidad = leerEntero();
            teclado.nextLine();

            if (articulo.decrementarStock(cantidad)) {
                articulosVendidos.add(articulo);
                cantidadesVendidas.add(cantidad);
                System.out.println("Añadido a la venta.");
            } else {
                System.out.println("ERROR: Stock insuficiente.");
            }

            System.out.print("\n¿Añadir más artículos? (S/N): ");
            continuar = teclado.nextLine();

        } while (continuar.equalsIgnoreCase("S"));

        // Si hay artículos vendidos, emitimos la factura
        if (!articulosVendidos.isEmpty()) {
            emitirFactura(articulosVendidos, cantidadesVendidas);
        } else {
            System.out.println("\nNo se ha realizado ninguna venta.");
        }
    }

    /**
     * Emite la factura de una venta
     */
    private static void emitirFactura(ArrayList<Articulo> articulos, ArrayList<Integer> cantidades) {
        System.out.println("\n???????????????????????????????????????????????????????????????");
        System.out.println("                         FACTURA                               ");
        System.out.println("???????????????????????????????????????????????????????????????");
        System.out.println("Artículo                    Cant.  Precio Unit.  Subtotal");
        System.out.println("???????????????????????????????????????????????????????????????");

        double subtotal = 0;

        for (int i = 0; i < articulos.size(); i++) {
            Articulo art = articulos.get(i);
            int cant = cantidades.get(i);
            double precio = art.getPrecioVenta();
            double lineaTotal = precio * cant;
            subtotal += lineaTotal;

            System.out.printf("%-25s   %3d   %8.2f€   %8.2f€%n",
                    art.getDescripcion(), cant, precio, lineaTotal);
        }

        double importeIVA = subtotal * IVA;
        double total = subtotal + importeIVA;

        System.out.println("???????????????????????????????????????????????????????????????");
        System.out.printf("Subtotal:                                        %8.2f€%n", subtotal);
        System.out.printf("IVA (21%%):                                       %8.2f€%n", importeIVA);
        System.out.println("???????????????????????????????????????????????????????????????");
        System.out.printf("TOTAL:                                           %8.2f€%n", total);
        System.out.println("???????????????????????????????????????????????????????????????");
        System.out.println("\nVenta realizada correctamente.");
    }

    /**
     * Muestra el listado de todos los artículos
     */
    private static void listado() {
        System.out.println("\n???????????????????????????????????????????????????????????????");
        System.out.println("                   LISTADO DE ARTÍCULOS                        ");
        System.out.println("???????????????????????????????????????????????????????????????");

        if (almacen.isEmpty()) {
            System.out.println("\nNo hay artículos en el almacén.");
            return;
        }

        System.out.println();
        System.out.println("Código     Descripción              P.Compra  P.Venta Stock");
        System.out.println("???????????????????????????????????????????????????????????????");

        for (Articulo art : almacen) {
            System.out.println(art);
        }

        System.out.println("???????????????????????????????????????????????????????????????");
        System.out.println("Total de artículos: " + almacen.size());
    }

    /**
     * Busca un artículo por su código
     *
     * @return El artículo si existe, null si no existe
     */
    private static Articulo buscarArticulo(String codigo) {
        for (Articulo art : almacen) {
            if (art.getCodigo().equalsIgnoreCase(codigo)) {
                return art;
            }
        }
        return null;
    }

    /**
     * Lee un número entero con validación
     */
    private static int leerEntero() {
        while (!teclado.hasNextInt()) {
            System.out.print("Error. Introduce un número entero: ");
            teclado.next();
        }
        return teclado.nextInt();
    }

    /**
     * Lee un número decimal con validación
     */
    private static double leerDouble() {
        while (!teclado.hasNextDouble()) {
            System.out.print("Error. Introduce un número válido: ");
            teclado.next();
        }
        return teclado.nextDouble();
    }
}

/*
 * MEJORAS IMPLEMENTADAS EN ESTA VERSIÓN:
 * 
 * 1. Uso de ArrayList en lugar de array:
 *    - No hay límite de capacidad
 *    - Métodos add(), remove() simplifican el código
 *    - No hay espacios "vacíos" que gestionar
 * 
 * 2. Validación de códigos:
 *    - Alta: verifica que el código no exista antes de crear
 *    - Baja: verifica que el código exista antes de eliminar
 *    - Modificación: verifica que el código exista
 *    - Método buscarArticulo() centraliza la búsqueda
 * 
 * 3. Sistema de ventas con factura:
 *    - Permite vender múltiples artículos en una transacción
 *    - Emite factura detallada con todos los artículos
 *    - Calcula y aplica IVA del 21%
 *    - Actualiza el stock automáticamente
 *    - Verifica stock disponible antes de vender
 * 
 * 4. Mejoras adicionales:
 *    - Interfaz más amigable con caracteres mejorados
 *    - Validación de entrada numérica
 *    - Confirmación antes de eliminar
 *    - Formato de moneda mejorado
 *    - Mensajes de error más descriptivos
 * 
 * VENTAJAS DEL ARRAYLIST:
 * - Código más simple y limpio (200 líneas menos aprox.)
 * - No necesitamos controlar posiciones vacías
 * - Fácil añadir/eliminar elementos
 * - El tamaño se ajusta automáticamente
 */
