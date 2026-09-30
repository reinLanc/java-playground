/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Reinaldo Gil
 */
public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(double saldo, int numeroCuenta, Cliente cliente) {
        super(saldo, numeroCuenta, 0.1, cliente);
    }

    @Override
    public void retirar(double importe) {
        if (importe <= saldo) {
            saldo -= importe;
            getHistorial().addLast("RETIRADA -" + String.format("%.2f", importe)
                    + "  => Saldo: " + String.format("%.2f", saldo));
        } else {
            System.out.println("No se puede realizar la transacción.");
            System.out.println("En una cuenta corriente el saldo no puede quedar negativo.");
        }
    }
}
