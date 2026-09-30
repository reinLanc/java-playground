/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poogestioninventariotienda;

import java.util.TreeMap;

/**
 *
 * @author Reinaldo Gil
 */
public class Inventario {

    private TreeMap<String, Producto> productos;

    public Inventario() {
        productos = new TreeMap<>();
    }

    public void agregarProducto(Producto producto) {
        if (productos.containsKey(producto.getCodigo())) {
            System.out.println("Ya existe un producto con ese código");
        } else {
            productos.put(producto.getCodigo(), producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        }
    }

    public boolean venderProducto(String codigo, int cantidad) {
        Producto producto = productos.get(codigo);

        if (producto == null) {
            System.out.println("Producto no encontrado");
            return false;
        }

        if (producto.vender(cantidad)) {
            System.out.printf("Venta realizada: %d unidades de %s\n",
                    cantidad, producto.nombre);
            return true;
        } else {
            System.out.println("Stock insuficiente. Disponible: " + producto.getStock());
            return false;
        }
    }

    public void listarStockBajo(int umbral) {
        System.out.println("\n=== PRODUCTOS CON STOCK BAJO (menos de " + umbral + ") ===");
        boolean encontrado = false;

        for (Producto producto : productos.values()) {
            if (producto.getStock() < umbral) {
                System.out.println(producto);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos con stock bajo");
        }
    }

    public void listarProximosAVencer(int diasUmbral) {
        System.out.println("\n=== PRODUCTOS PRÓXIMOS A VENCER (menos de "
                + diasUmbral + " días) ===");
        boolean encontrado = false;

        for (Producto producto : productos.values()) {
            if (producto instanceof ProductoPerecedero) {
                ProductoPerecedero perecedero = (ProductoPerecedero) producto;
                if (perecedero.diasParaVencer() < diasUmbral
                        && perecedero.diasParaVencer() >= 0) {
                    System.out.println(perecedero);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos próximos a vencer");
        }
    }

    public void mostrarValorInventario() {
        System.out.println("\n=== VALOR DEL INVENTARIO ===");
        double valorTotal = 0;
        double valorPerecederos = 0;
        double valorNoPerecederos = 0;

        for (Producto producto : productos.values()) {
            double valor = producto.valorEnInventario();
            valorTotal += valor;

            if (producto instanceof ProductoPerecedero) {
                valorPerecederos += valor;
            } else {
                valorNoPerecederos += valor;
            }
        }

        System.out.printf("Valor total: $%.2f\n", valorTotal);
        System.out.printf("  Perecederos: $%.2f\n", valorPerecederos);
        System.out.printf("  No perecederos: $%.2f\n", valorNoPerecederos);
    }

    public void listarTodosLosProductos() {
        System.out.println("\n=== INVENTARIO COMPLETO (ordenado por código) ===");
        for (Producto producto : productos.values()) {
            System.out.println(producto);
        }
    }
}
