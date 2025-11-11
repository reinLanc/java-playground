package exame4;
import java.util.Scanner;
/**
 Numero de Perrin calcular la sucesión
 * @author Reinaldo Gil
 */
public class Exame4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor de n: ");
        int n = teclado.nextInt();

        int p0 = 3, p1 = 0, p2 = 2, pn = 0;

        if (n == 0) {
            pn = p0;
        } else if (n == 1) {
            pn = p1;
        } else if (n == 2) {
            pn = p2;
        } else {
            for (int i = 3; i <= n; i++) {
                pn = p0 + p1;
                p0 = p1;
                p1 = p2;
                p2 = pn;
            }
        }

        System.out.println("El término P(" + n + ") = " + pn);
    }

}
