/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_3_2;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Años bisiestos entre 2000 y 2100");
        for(int i = 2000; i<=2100; i++) {
            if(i%4==0 && i%100!=0 || i%400==0) {
                System.out.println(i);
            }
        }
    }
    
}
