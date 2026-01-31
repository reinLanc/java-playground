package pruebaaleatoria;

public class PruebaAleatoria {

    public static void main(String[] args) {
        System.out.println("Aleatorios");
        for (int i = 0; i <= 8; i++) {
            int numero = (int) Math.floor(Math.random() * 5 + 1);
            System.out.print(numero + "-");
        }
        System.out.println("\n");
        System.out.println("Rango");
        for (int i = 0; i <= 8; i++) {
            int rangos = (int) Math.floor(Math.random() * (5 - 10) + 10);
            System.out.print(rangos + "-");
        }
        System.out.println("\n");
        System.out.println("Rangos entre A y B");
        for (int i = 0; i <= 8; i++) {
            int rangos2 = (int) Math.floor(Math.random() * (5 - (10 + 1)) + (10 + 1));
            System.out.print(rangos2 + "-");
        }
        System.out.println("\n");
        System.out.println("Caracteres minusculas");
        for (int i = 0; i <= 15; i++) {
            char rangosMin = (char)((int) Math.floor(Math.random() * (97-123) + 123));
            System.out.print(rangosMin + "-");
        }
        System.out.println("\n");
        System.out.println("Caracteres mayusculas");
        for (int i = 0; i <= 8; i++) {
            char rangosMay = (char)((int) Math.floor(Math.random() * (65-91) + 91));
            System.out.print(rangosMay + "-");
        }
    }

}
