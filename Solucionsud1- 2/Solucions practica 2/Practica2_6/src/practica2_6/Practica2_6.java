/*
 * Cálculo del dinero que tendremos después de un año tras ingresar
 * 5000 euros a un 6% de interés
 */
package practica2_6;

/**
 *
 * @author 
 */
public class Practica2_6 {

    public static void main(String[] args) {
        
        double ingreso = 5000; // Cantidad ingresada en el banco
        
        double interes = ingreso * 6 / 100; //Calculamos los interes
        
        // Mostramos el resultado
        System.out.println("Dentro de un año tendremos " + (ingreso + interes) 
                            + " €.");
    }
    
}
