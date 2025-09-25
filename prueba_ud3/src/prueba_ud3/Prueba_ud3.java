package prueba_ud3;
public class Prueba_ud3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            double numero = Math.random() * 9 + 1;
            double aleatorio = Math.floor(numero);
            System.out.print((int)aleatorio + " ");
        }
    }
}
