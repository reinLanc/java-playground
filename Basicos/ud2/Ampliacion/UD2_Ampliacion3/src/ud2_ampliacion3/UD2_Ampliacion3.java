/*
 * Un ordenador se deprecia cada año uno 40% sobre el valor del año anterior. 
 * El programa obtiene un listado de la depreciación a lo largo de los años, 
 * suponiendo que por debajo de los 300 euros no se deprecia.
 */
package ud2_ampliacion3;
import java.util.*;

/**
 *
 * @author 
 */
public class UD2_Ampliacion3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Precio de adquisición del ordenador: ");
        double precio = teclado.nextDouble();
        
        System.out.println("\nAÑOS\t\t\tVALOR ORDENADOR");
        System.out.println("PRECIO ADQUISICIÓN\t" + precio);
        
        int anos = 0;
        // Vamos calculando y mostrando la depreciación anual
        while (precio >= 300) {
            anos++;
            precio -= precio * 40 / 100;
            System.out.println(anos + "\t\t\t" + precio);
        }
        
        // Mostramos en cuantos años se ha depreciado (cuántos años se han
        // necesitado para que su valor disminuya por debajo de 300 euros
        System.out.println("\nEl ordenador se depreció en " + anos + " años.");
        
    }
    
}
