/*
 * Programa que lee por teclado el código de 5 productos y su nivel de toxicidad
 * y muestra el grado de toxicidad de cada uno.
 */
package ud2_ampliacion5;

import java.util.*;

/**
 *
 * @author 
 */
public class UD2_Ampliacion5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("\nIntroduce código de producto " + i + ": ");
            int codigo = teclado.nextInt();
            
            System.out.print("Introduce nivel de toxicidad (>=0): ");
            int nivel = teclado.nextInt();
            while (nivel <0) {
                System.out.print("ERROR. Introduce nivel de toxicidad (>=0): ");
                nivel = teclado.nextInt();
            }
            
            if (nivel <= 10) {
                System.out.println("No tóxico.");
            } else if (nivel == 11) {
                System.out.println("Baja toxicidad");
            } else if (nivel == 12) {
                System.out.println("Toxicidad media");
            } else if (nivel == 13) {
                System.out.println("Alta toxicidad");
            } else {
                System.out.println("Altamente peligroso");
            }
        }
    }
    
}
