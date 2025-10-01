/*
 * Programa que calcula el salario neto que percibirá un trabajador, 
 * teniendo en cuenta que al salario bruto tenemos que descontarle las retenciones.
 *
 *Datos de entrada: salario bruto de tipo float y número de hijos de tipo int.
 * Visualizar: salario bruto, descuento en euros y salario neto.
 */
package ud2_practica1_6;

import java.util.*;

public class UD2_Practica1_6 {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Scanner para leer datos por teclado 
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario el salario bruto y el número de hijos:
        System.out.print("Introduce el salario bruto: ");
        float salarioBruto = teclado.nextFloat();
        System.out.print("Introduce el número de hijos: ");
        int numHijos = teclado.nextInt();
        
        // Variable para almacenar las retenciones. Le asignaremos un valor
        // en la siguiente estructura if.
        int retenciones;
        
        // Dependiendo del número de hijos, asignamos a la variable
        // retenciones el valor correspondiente
        if (numHijos <= 2){
            retenciones = 20;
        } else if (numHijos <= 5){
            retenciones = 15;
        } else if (numHijos <= 7){
            retenciones = 10;
        } else if (numHijos <= 9){
            retenciones = 5;
        } else{
            retenciones = 0;
        }
        
        // Calculamos el descuento y el salario neto
        float descuento = salarioBruto * retenciones / 100;
        float salarioNeto = salarioBruto - descuento;
        
        // Mostramos el salario bruto, el descuento y el salario neto.
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Descuento: " + descuento 
                           + " (" + retenciones + "%)");
        System.out.println("Salario neto: " +  salarioNeto);
    }
}
