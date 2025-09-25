package ud3_2;

public class Ud3_2 {

    public static void main(String[] args) {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        for (int i = 1; i <= 1000; i++) {
            double numero = Math.random() * 6 + 1;
            double aleatorio = Math.floor(numero);
            if (aleatorio == 1) {
                contador1++;
            } else if (aleatorio == 2) {
                contador2++;
            } else if (aleatorio == 3) {
                contador3++;
            } else if (aleatorio == 4) {
                contador4++;
            } else if (aleatorio == 5) {
                contador5++;
            } else if (aleatorio == 6) {
                contador6++;
            }
        }
        System.out.println("Lanzamientos totales: "
                + (contador1 + contador2 + contador3 + contador4
                + contador5 + contador6));
        System.out.println("Lanzamientos de resultado 1 : " + contador1);
        System.out.println("Lanzamientos de resultado 2 : " + contador2);
        System.out.println("Lanzamientos de resultado 3 : " + contador3);
        System.out.println("Lanzamientos de resultado 4 : " + contador4);
        System.out.println("Lanzamientos de resultado 5 : " + contador5);
        System.out.println("Lanzamientos de resultado 6 : " + contador6);
    }
}
