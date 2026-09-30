/*
Crear un sistema de inventario para una tienda usando TreeMap (para ordenar productos por código) y 
herencia.
Hay dos tipos de productos: Perecederos (con fecha de vencimiento) y NoPerecederos 
(con garantía en meses). El sistema debe:

Agregar productos al inventario
Vender productos (reducir stock)
Listar productos con stock bajo (menos de 5 unidades)
Mostrar productos perecederos próximos a vencer (menos de 7 días)
Calcular valor total del inventario
 */
package poogestioninventariotienda;

import java.time.LocalDate;

/**
 *
 * @author Reinaldo Gil
 */
public class POOGestionInventarioTienda {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        // Agregar productos perecederos
        inventario.agregarProducto(new ProductoPerecedero(
            "P001", "Leche", 2.50, 20, LocalDate.of(2026, 2, 8)));
        inventario.agregarProducto(new ProductoPerecedero(
            "P003", "Yogurt", 1.80, 15, LocalDate.of(2026, 2, 12)));
        inventario.agregarProducto(new ProductoPerecedero(
            "P005", "Pan", 1.20, 3, LocalDate.of(2026, 2, 6)));
        
        // Agregar productos no perecederos
        inventario.agregarProducto(new ProductoNoPerecedero(
            "N002", "Arroz", 3.50, 50, 0));
        inventario.agregarProducto(new ProductoNoPerecedero(
            "N004", "Licuadora", 45.00, 8, 12));
        inventario.agregarProducto(new ProductoNoPerecedero(
            "N006", "Tostadora", 35.00, 4, 24));
        
        inventario.listarTodosLosProductos();
        
        // Realizar ventas
        System.out.println();
        inventario.venderProducto("P001", 5);
        inventario.venderProducto("N004", 3);
        inventario.venderProducto("P005", 2);
        
        inventario.listarStockBajo(5);
        inventario.listarProximosAVencer(7);
        inventario.mostrarValorInventario();
    }
    }


