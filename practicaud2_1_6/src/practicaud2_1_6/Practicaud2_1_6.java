/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaud2_1_6;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Practicaud2_1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Salario Bruto
        System.out.println("Introduzca el Salario Bruto del trabajador");
        Scanner teclado1 = new Scanner(System.in);
        float salarioBruto = teclado1.nextFloat();
        //Numero de Hijos
        System.out.println("Introduzca el numero de Hijos del trabajador.");
        Scanner teclado2 = new Scanner(System.in);
        int hijos = teclado2.nextInt();
        int prestaciones = 0;
        double salarioNeto = salarioBruto - salarioBruto * prestaciones;
        double descuento = salarioBruto - salarioNeto;
        if (hijos >= 10) {
            prestaciones = 0;
            salarioNeto = salarioBruto - salarioBruto * prestaciones;
            descuento = salarioBruto - salarioNeto;
        } else if (hijos <= 9) {
            prestaciones = 5;
            salarioNeto = salarioBruto - salarioBruto * prestaciones/100;
            descuento = salarioBruto - salarioNeto;
        } else if (hijos <= 7) {
            prestaciones = 10;
            salarioNeto = salarioBruto - salarioBruto * prestaciones/100;
            descuento = salarioBruto - salarioNeto;
        } else if (hijos <= 5) {
            prestaciones = 15;
            salarioNeto = salarioBruto - salarioBruto * prestaciones/100;
            descuento = salarioBruto - salarioNeto;
        } else if (hijos <= 2) {
            prestaciones = 20;
            salarioNeto = salarioBruto - salarioBruto * prestaciones/100;
            descuento = salarioBruto - salarioNeto;
        }
        System.out.println("Salario Bruto " + salarioBruto + "€");
        System.out.println("Prestaciones " + prestaciones + "%");
        System.out.println("Descuento " + descuento + "€");
        System.out.println("Salario Neto " + salarioNeto + "€");
    }

}
