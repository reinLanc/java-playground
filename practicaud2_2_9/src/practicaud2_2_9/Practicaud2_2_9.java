/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_2_9;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un número para N");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int total = 0;
        int menorquince = 0;
        int igualquinceocincuenta = 0;
        int mayorcincuenta = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Introduce un Número (" + i + "/" + num + ")");
            int num2 = teclado.nextInt();
            total++;
            if (num2 < 15) {
                menorquince++;
            } else if (num2 >= 15 && num2 <= 50) {
                igualquinceocincuenta++;
            } else {
                mayorcincuenta++;
            }
        }
        System.out.println("Total numeros: " + num );
        System.out.println("Total menor quince:  " + menorquince);
        System.out.println("Total mayor de 15 o menor 50:  " + igualquinceocincuenta);
        System.out.println("Total mayor que 50:  " + mayorcincuenta);
    }

}
