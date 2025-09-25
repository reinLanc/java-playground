/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_10;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        int suma = 0;
        int sumapar =0;
        for(i=1;i<=100;i++) {
            if(i%2 != 0){
                suma += i;               
            }
        }
        for(j=1;j<=100;j++) {
            if(j%2==0){
                sumapar += j;               
            }
        }
        System.out.println("Total Numeros impares " + suma);
        System.out.println("Total Numeros pares " + sumapar);
    }
    
}
