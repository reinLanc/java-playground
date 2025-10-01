/*
 * Programa que pide por teclado un mes y visualiza el número de días de ese mes.
 */
package ud2_practica1_7;

import java.util.*;

public class UD2_Practica1_7 {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Scanner para leer datos por teclado 
        // (el objeto está referenciado por el identificador "teclado")
        Scanner teclado = new Scanner(System.in);
        
        // Pedimos al usuario que teclee un número de mes entre 1 y 12
        System.out.print("Introduce mes [1-12]: ");
        int mes = teclado.nextInt();
        
        // Dependiendo del número de mes, mostramos su número de días
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes número " + mes + " tiene 31 días."); 
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes número " + mes + " tiene 30 días."); 
                break;
            case 2:
                System.out.println("El mes número " + mes + " tiene 28 días "
                                    + "si el año no es bisiesto y 29 si lo es."); 
                break;
            default:
                System.out.println("Error: El mes debe estar entre 1 y 12.");
        }
        
    }
    
}