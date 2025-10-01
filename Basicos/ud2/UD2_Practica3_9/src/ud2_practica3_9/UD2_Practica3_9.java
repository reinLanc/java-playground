/* Se introduce por teclado las edades de un grupo de N personas. (N se introduce por
 * teclado al ejecutar el programa). El programa calcula y visualiza:
 * a) La media de edades.
 * b) La edad del mayor.
 * c) La edad del menor.
 */
package ud2_practica3_9;

import java.util.*;

/**
 *
 * @author 
 */
public class UD2_Practica3_9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leemos el número de personas
        System.out.print("¿Cuantas personas son?: ");
        int numPersonas=teclado.nextInt();
        while(numPersonas<=0) {
            System.out.print("ERROR. ¿Cuantas personas son?: ");
            numPersonas=teclado.nextInt();                
        }        
        
        // Vamos leyendo las edades de las personas, sumándolas en la variable
        // "suma" y almacenando en las variables "maximo" y "minimo" la edad máxima
        // y la mínima.
        int maximo = 0, minimo = 0;
        int suma = 0;
        for(int i=1; i <= numPersonas; i++) {
            System.out.print("Introduzca la edad de la persona número "+i+" : ");
            int edad=teclado.nextInt();
            while(edad<0){
                System.out.print("ERROR. Introduzca la edad de la persona número "+i+" : ");
                edad=teclado.nextInt();                
            }       
            
            // Inicializamos las variables maximo y minimo con la primera edad que se introduce
            if(i==1) {
                maximo=edad;
                minimo=edad;
            }
            
            // Si la edad de la persona es mayor que la máxima almacenada hasta
            // el momento, ésa será la nueva edad máxima
            if(edad>maximo) {
                maximo=edad;
            }
            
            // Si la edad de la persona es menor que la mínima almacenada hasta
            // el momento, ésa será la nueva edad mínima
            if(edad<minimo) {
                minimo=edad;
            }
            
            // Vamos acumulando en la variable "suma" la suma de las edades de
            // todas las personas
            suma = suma + edad;
        }
        
        // Finalmente mostramos los resultados
        System.out.println("\nMedia de edades: " + ((double)suma/numPersonas)); 
        System.out.println("Edad del mayor: " + maximo);
        System.out.println("Edad del menor: " + minimo);
    }
    
}
