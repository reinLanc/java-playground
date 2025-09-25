/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_8;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuadrados = 0;
        for (int i=1;i<=100;i++) {
            cuadrados += i * i;
        }
        System.out.println("cuadrados : " + cuadrados);
    }

}
