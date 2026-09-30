/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Reinaldo Gil
 */
public class FI extends Cuenta {

    public FI(double saldo, int numeroCuenta, Cliente cliente) {
        super(saldo, numeroCuenta, 0.34, cliente);
    }

    @Override
    public void retirar(double importe) {
        if (importe <= saldo + 500) {
            saldo -= importe;
            getHistorial().addLast("RETIRADA -" + String.format("%.2f", importe)
                    + "  => Saldo: " + String.format("%.2f", saldo));
        } else {
            System.out.println("No se puede realizar la transacción.");
            System.out.println("En un fondo de inversión el saldo negativo no puede superar 500€.");
        }
    }
}
