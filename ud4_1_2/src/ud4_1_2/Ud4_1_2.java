package ud4_1_2;

public class Ud4_1_2 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 32, 21, 5};
        double media = 0;
        System.out.println("Array original");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(" " + numbers[i] + " ");
        }
        System.out.println("");
        for (int n : numbers) {
            media += n;
        }
        media = media / numbers.length;
        System.out.println("Media: " + media);
        System.out.println("Valores mayores que la media");
        for (int n:numbers) {
            if (n > media) {
                System.out.println(" " + n+ " ");
            }
        }
    }
}
