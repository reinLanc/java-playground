package ud6_3_1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ud6_3_1 {

    public static void main(String[] args) {
        int numPrimes = 0;
        //comenzamos en 2
        int candidate = 2;
        try {

            FileOutputStream file = new FileOutputStream("D:\\reinaldo\\programacion\\primos.dat");
            DataOutputStream data = new DataOutputStream(file);
            while (numPrimes < 400) {
                if (isPrime(candidate)) {
                    data.writeInt(candidate);
                    numPrimes++;
                }
                candidate++;
            }
            data.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }

    }

    public static boolean isPrime(int checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}
