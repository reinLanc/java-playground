/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Reinaldo Gil
 */
public class CuentaVivienda extends Cuenta {

    public CuentaVivienda(double saldo, int numeroCuenta, Cliente cliente) {
        super(saldo, numeroCuenta, 0.2, cliente);
    }

    @Override
    public void retirar(double importe) {
        System.out.println("No se puede realizar la transacción.");
        System.out.println("En una cuenta vivienda no se puede retirar dinero.");
    }

    /**
     * La cuenta vivienda está exenta de comisión mensual.
     */
    @Override
    public void aplicarComision(double importeComision) {
        // Sin comisión
    }
}
