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
public class CuentaVivienda extends Cuenta{
    
    
     public CuentaVivienda(double saldo, int numeroCuenta, Cliente cliente)
     {
        super(saldo,numeroCuenta,0.2,cliente);
     }


     @Override
     public  void retirar(double importe)
     {
        System.out.println("No se puede realizar la transacción.");
        System.out.println("En una cuenta vivienda no se puede retirar dinero.");
     }

    public void aplicarComision(double importeComision)
    {

    }     
    
}
