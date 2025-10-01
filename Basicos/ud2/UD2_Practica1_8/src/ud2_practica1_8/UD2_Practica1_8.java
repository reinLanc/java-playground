/*
 * Programa que visualiza distintas opciones y permite seleccionar una 
 * introduciendo el número correspondiente. Una vez tecleada la opción, 
 * se muestra un mensaje indicando cual es la opción elegida o un mensaje de 
 * error en caso de que ésta no sea válida.
 */
package ud2_practica1_8;

import java.util.*;

public class UD2_Practica1_8 {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Scanner para leer datos por teclado 
        // (el objeto está referenciado por el identificador "teclado")
        Scanner teclado = new Scanner(System.in);
        
        // Mostramos al usuario el menú de opciones
        System.out.println("1. CADRADO");
        System.out.println("2. RECTÁNGULO");
        System.out.println("3. TRIÁNGULO");
        System.out.println("4. CÍRCULO");
        System.out.println();
        
        // Pedimos al usuario que teclee una opción
        System.out.print("   INTRODUCE OPCIÓN:");
        int opcion = teclado.nextInt();
        
        // Mostramos la opción elegida por el usuario
        switch(opcion){
            case 1:
                System.out.println("   OPCIÓN ELEGIDA: CADRADO"); 
                break;
            case 2:
                System.out.println("   OPCIÓN ELEGIDA: RECTÁNGULO"); 
                break;
            case 3:
                System.out.println("   OPCIÓN ELEGIDA: TRIÁNGULO");  
                break;
            case 4:
                System.out.println("   OPCIÓN ELEGIDA: CÍRCULO"); 
                break;
            default:
                System.out.println("   ERROR: Opción non válida!");
        }
        
    }
    
}