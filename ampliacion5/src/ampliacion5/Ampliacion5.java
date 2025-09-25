/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion5;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ampliacion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigo = 0;
        int i = 0;
        int toxicity = 0;
        for (i = 1; i <= 5; i++) {
            System.out.println("Introduce el código del producto (" + i + "/5)");
            Scanner teclado = new Scanner(System.in);
            codigo = teclado.nextInt();
            System.out.println("Introduce el Grado de toxicidad");
            toxicity = teclado.nextInt();
            while (toxicity < 0) {
                System.out.println("Nivel de toxicidad debe ser número positivo...");
                toxicity = teclado.nextInt();
            }
            if (toxicity <= 10) {
                System.out.println("El producto " + codigo + " \"No es toxico\" ");
            } else if (toxicity == 11) {
                System.out.println("El producto " + codigo + " es de \"Baja toxicidad.\"");
            } else if (toxicity == 12) {
                System.out.println("El producto " + codigo + " es de \"Toxicidad media.\"");
            } else if (toxicity == 13) {
                System.out.println("El producto " + codigo + " es de \"Alta toxicidad.\"");
            } else {
                System.out.println("El producto " + codigo + " es de \"¡ALTAMENTE PELIGROSO!.\"");
            }
        }
    }

}
