/*
 * Programa que crea un objeto elipse y compruebe si los puntos dados por teclado
 * (coordenadas x e y) están dentro o fuera de esta elipse llamando al método contains.
 * El programa terminará cuando se introduzca el valor -1 para la coordenada x.
 */
package ud3_practica1_1;

import java.awt.geom.Ellipse2D;
import java.util.Scanner;

public class UD3_Practica1_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ellipse2D.Double elipse = new Ellipse2D.Double(0, 0, 200, 55);

        System.out.print("Coordenada x de la elipse: ");
        int x = teclado.nextInt();

        while (x != -1) {
            System.out.print("Coordenada y de la elipse: ");
            int y = teclado.nextInt();
            boolean estaDentro = elipse.contains(x, y);
            if (estaDentro) {
                System.out.println("El punto (" + x + ", " + y + ")"
                                    + " está dentro de la elipse");
            } else {
                System.out.println("El punto (" + x + ", " + y + ")"
                                    + " está fuera de la elipse");
            }
            System.out.print("\nCoordenada x de la elipse: ");
            x = teclado.nextInt();
        }
        
    }

}
