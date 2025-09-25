package ud4_1_1;
public class Ud4_1_1 {
    public static void main(String[] args) {
       int[] numbers = {10, 20, 32, 21, 5};
        System.out.println("Array original:");
        for(int j = 0; j <= numbers.length-1;j++) {
            System.out.print(" " + numbers[j] + " ");
        }
        System.out.println("\nArray Invertido:");
          for(int i = numbers.length-1; i >=0;i--) {
              System.out.print( " " + numbers[i] + " ");
          }
    }
    
}
