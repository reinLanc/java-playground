/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poogestioninventariotienda;

/**
 *
 * @author Reinaldo Gil
 */
public class ProductoNoPerecedero extends Producto {

    private int mesesGarantia;

    public ProductoNoPerecedero(String codigo, String nombre, double precio,
            int stock, int mesesGarantia) {
        super(codigo, nombre, precio, stock);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public String getDetallesEspecificos() {
        return String.format("Garantía: %d meses", mesesGarantia);
    }
}
