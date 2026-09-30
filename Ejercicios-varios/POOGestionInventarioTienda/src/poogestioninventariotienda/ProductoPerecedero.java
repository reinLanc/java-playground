/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poogestioninventariotienda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Reinaldo Gil
 */
public class ProductoPerecedero extends Producto {

    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String codigo, String nombre, double precio,
            int stock, LocalDate fechaVencimiento) {
        super(codigo, nombre, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public long diasParaVencer() {
        return ChronoUnit.DAYS.between(LocalDate.now(), fechaVencimiento);
    }

    @Override
    public String getDetallesEspecificos() {
        long dias = diasParaVencer();
        return String.format("Vence: %s (%d días)", fechaVencimiento, dias);
    }
}
