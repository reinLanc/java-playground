package ud3_4_4;
import java.util.Scanner;
public class Ud3_4_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir cateto opuesto: ");
        int a = teclado.nextInt();
        System.out.println("Introducir cateto adyacente: ");
        int b = teclado.nextInt();
        System.out.println("La hipotenusa de un triangulo de lado a = " + a
                + " y de lado b = " + b + " es : " + hipotenusa(a,b));    
    }
    public static double hipotenusa(int a, int b) {
        double hipotenusa = 0;
        a = a * a;
        b = b * b;
        double c = a + b;
        c = Math.sqrt(c);
        hipotenusa = c;
        return hipotenusa;
    }
}
