/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.LinkedList;

/**
 * Clase abstracta Cuenta. Usa un LinkedList<String> como historial de
 * movimientos.
 */
public abstract class Cuenta {

    protected double saldo;
    private int numeroCuenta;
    private double tipoInteres;
    private Cliente cliente;

    //  COLECCIÓN: LinkedList para historial de movimientos
    private LinkedList<String> historialMovimientos = new LinkedList<>();

    public Cuenta(double saldo, int numeroCuenta, double tipoInteres, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.cliente = cliente;
        ingresar(saldo);
    }

    // Getters / Setters
    public double getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int n) {
        this.numeroCuenta = n;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double t) {
        this.tipoInteres = t;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
    }

    // Historial 
    public LinkedList<String> getHistorial() {
        return historialMovimientos;
    }

    public void mostrarHistorial() {
        if (historialMovimientos.isEmpty()) {
            System.out.println("   Sin movimientos registrados.");
        } else {
            historialMovimientos.forEach(m -> System.out.println("   " + m));
        }
    }

    // Operaciones
    public void ingresar(double importe) {
        if (importe > 0) {
            this.saldo += importe;
            cliente.setPuntos(cliente.getPuntos() + (int) (importe / 6));
            historialMovimientos.addLast("INGRESO  +" + String.format("%.2f", importe)
                    + "  => Saldo: " + String.format("%.2f", saldo));
        } else {
            System.out.println("Imposible realizar ingreso: el importe debe ser mayor que cero.");
        }
    }

    public void aplicarComision(double importeComision) {
        this.saldo -= importeComision;
        historialMovimientos.addLast("COMISION -" + String.format("%.2f", importeComision)
                + "  => Saldo: " + String.format("%.2f", saldo));
    }

    public void pagarInteres() {
        double intereses = saldo * (tipoInteres / 100);
        saldo += intereses;
        historialMovimientos.addLast("INTERES  +" + String.format("%.2f", intereses)
                + "  => Saldo: " + String.format("%.2f", saldo));
    }

    public abstract void retirar(double importe);
}
