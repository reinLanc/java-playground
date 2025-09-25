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
public class CuentaCorriente extends Cuenta
{

     public CuentaCorriente(double saldo, int numeroCuenta, Cliente cliente)
     {
        super(saldo,numeroCuenta,0.1,cliente);
     }


     @Override
     public  void retirar(double importe)
     {
        if (importe <= saldo)
            saldo = saldo - importe;
        else
        {
            System.out.println("No se puede realizar la transacción.");
            System.out.println("En una cuenta corriente el saldo no puede quedar negativo.");
        }
     }
    
}
