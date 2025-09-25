
package ud3_8_2;
import java.util.Scanner;
public class Ud3_8_2 {
    static Scanner teclado = new Scanner(System.in);
    public static long fibonacci(int posicion) {
if(posicion == 0 || posicion ==1)
    return posicion;
else 
    return fibonacci(posicion-1) + fibonacci(posicion-2);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la posición");
        int posicion = teclado.nextInt();
        System.out.println("El número en la posición que has elegido es " +  fibonacci(posicion));
    }

}
