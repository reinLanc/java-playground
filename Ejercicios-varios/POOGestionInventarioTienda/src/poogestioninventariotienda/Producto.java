/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poogestioninventariotienda;

/**
 *
 * @author Reinaldo Gil
 */
abstract class Producto {

    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    public double valorEnInventario() {
        return precio * stock;
    }

    public abstract String getDetallesEspecificos();

    @Override
    public String toString() {
        return String.format("[%s] %s | $%.2f | Stock: %d | %s",
                codigo, nombre, precio, stock, getDetallesEspecificos());
    }

    String getNombre() {
        return nombre;
    }
}
