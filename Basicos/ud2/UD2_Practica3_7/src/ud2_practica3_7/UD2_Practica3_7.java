/**
    * Programa que visualiza el resultado de la suma de la siguiente serie de N
    * términos:
    * 0/2 + 5/6 +10/18 +15/54 +20/162.............................
    * Si el número de términos (N) es menor o igual que cero, debe pedirse de nuevo.
    */
package ud2_practica3_7;

import java.util.*;


/**
 *
 * @author 
 */
public class UD2_Practica3_7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Leemos el número de términos a sumar
        System.out.print("¿Cuantos términos de la sucesión quieres sumar?: ");
        int numTerminos=teclado.nextInt();
        
        while(numTerminos<=0) {
            System.out.print("ERROR. ¿Cuantos términos de la sucesión quieres sumar?: ");
            numTerminos=teclado.nextInt();                
        }
        
        // Calculamos la suma. En cada nuevo término, el numerador es el numerador
        // anterior incrementado en 5. El denominador es el anterior denominador
        // multiplicado por 2.
        double numerador = 0, denominador = 2;
        double suma = 0;
        System.out.println(System.currentTimeMillis());
        for(int i=1; i <= numTerminos; i++) {
            //System.out.print(numerador+" / ");
            //System.out.println(denominador);            
            suma = suma + numerador/denominador;
            numerador = numerador + 5;
            denominador = denominador * 3;
        }    
        System.out.println(System.currentTimeMillis());
        
        
        
        // Mostramos el resultado
        System.out.println("La suma de los " + numTerminos
                + " primeros términos de la serie es: " + suma);

    }
    
}
