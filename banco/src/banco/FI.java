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
public class FI extends Cuenta{

    public FI(double saldo, int numeroCuenta, Cliente cliente)
    {
        super(saldo,numeroCuenta,0.34,cliente);
    }


     @Override
     public  void retirar(double importe)
     {
        if (importe <= saldo + 500)
            saldo = saldo - importe;
        else
        {
            System.out.println("No se puede realizar la transacción.");
            System.out.println("En un fondo de inversión el saldo negativo no puede superar 500€.");
        }
     }


     

}
