/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosistemahotel;

import java.time.LocalDate;

/**
 *
 * @author Reinaldo Gil
 */
enum TipoHabitacion {
    SIMPLE(50.0),
    DOBLE(80.0),
    SUITE(150.0);

    private double precioPorNoche;

    TipoHabitacion(double precio) {
        this.precioPorNoche = precio;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
}

public class Reserva {

    private String codigo;
    private String nombreHuesped;
    private TipoHabitacion tipo;
    private int numeroNoches;
    private LocalDate fechaEntrada;

    public Reserva(String codigo, String nombreHuesped, TipoHabitacion tipo, 
            int numeroNoches, LocalDate fechaEntrada) {
        this.codigo = codigo;
        this.nombreHuesped = nombreHuesped;
        this.tipo = tipo;
        this.numeroNoches = numeroNoches;
        this.fechaEntrada = fechaEntrada;
    }

    public String getCodigo() {
        return codigo;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public double calcularCosto() {
        return tipo.getPrecioPorNoche() * numeroNoches;
    }

    @Override
    public String toString() {
        return String.format("Reserva %s | %s | %s | %d noches | Entrada: %s | Costo: $%.2f",
                codigo, nombreHuesped, tipo, numeroNoches,
                fechaEntrada, calcularCosto());
    }
}
