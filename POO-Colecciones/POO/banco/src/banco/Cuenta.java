/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author gilguerei
 */
public abstract class Cuenta {

    protected double saldo;
    private int numeroCuenta;
    private double tipointeres;
    private Cliente cliente;

    public Cuenta(double saldo, int numeroCuenta, double tipointeres, Cliente cliente) {

        this.numeroCuenta = numeroCuenta;
        this.tipointeres = tipointeres;
        this.cliente = cliente;
        ingresar(saldo);

    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public int getNumeroCuenta()
    {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta)
    {
        this.numeroCuenta = numeroCuenta;
    }


    public double getTipoInteres()
    {
        return this.tipointeres;
    }

    public void setTipoInteres(double tipointeres)
    {
        this.tipointeres = tipointeres;
    }


    public Cliente getCliente()
    {
        return this.cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }


    public void ingresar(double importe)
    {
        if (importe > 0) 
        {    
            this.saldo = this.saldo + importe;
            cliente.setPuntos(cliente.getPuntos() + (int)(importe/6));
        }    
        else 
            System.out.println("Imposible realizar ingreso el importe debe ser mayor que cero.");
    }

    public void aplicarComision(double importeComision)
    {
        this.saldo = this.saldo - importeComision;
    }

     public void pagarInteres()
     {
         saldo = saldo * (1+this.getTipoInteres()/100);
     }

    public abstract void retirar(double importe);

}