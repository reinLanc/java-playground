/*
 * Programa que calcula el sueldo semanal que recibirán un grupo de trabajadores,
 * introduciendo por teclado el número de horas trabajadas por cada uno y el precio
 * de cada hora. Si trabajan más de 40 horas semanales, las horas extra (por 
 * encima de 40) se pagan un 50% más del precio normal de la hora. El programa
 * finaliza al introducir horas menor que 0.
 */
package ud2_practica2_6;

import java.util.*;

public class UD2_Practica2_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas;
        double precio;

        System.out.print("Introduce número de horas (<0 para salir): ");
        horas = teclado.nextInt();

        while (horas >= 0) {
            System.out.print("Introduce precio de la hora: ");
            precio = teclado.nextDouble();

            if (horas > 40) {
                System.out.println("Sueldo: "
                        + (40 * precio + (horas - 40) * precio * 1.5) + " euros\n");
            } else {
                System.out.println("Sueldo: " + (horas * precio) + " euros\n");
            }

            System.out.print("Introduce número de horas (<0 para salir): ");
            horas = teclado.nextInt();

        }
    }

}
