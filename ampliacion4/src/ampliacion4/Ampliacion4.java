/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion4;

import java.util.Scanner;

/**
 *
 * @author gilguerei
 */
public class Ampliacion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce número de seguro del paciente (0 para salir): ");
        int numSeguro = teclado.nextInt();

        int segurosTipo1 = 0; // Contador de los seguros tipo 1
        int segurosTipo2 = 0; // Contador de los seguros tipo 2
        int segurosTipo3 = 0; // Contador de los seguros tipo 3
        double importeTotalSeguro1 = 0; // Guardará el importe total de los pacientes 
        // de seguro tipo1 
        while (numSeguro != 0) {

            System.out.print("Introduce tipo de seguro (1 – 3): ");
            int tipoSeguro = teclado.nextInt();
            // Seguimos pidiendo tipo de seguro hasta que el usuario teclee 1, 2 o 3
            while (tipoSeguro < 1 || tipoSeguro > 3) {
                System.out.print("ERROR.Introduce tipo de seguro (1 – 3): ");
                tipoSeguro = teclado.nextInt();
            }

            System.out.print("Introduce tipo de tratamiento (1 – 3): ");
            int tipoTratamiento = teclado.nextInt();
            // Seguimos pidiendo tipo de tratamiento hasta que el usuario teclee 1, 2 o 3
            while (tipoTratamiento < 1 || tipoTratamiento > 3) {
                System.out.print("ERROR.Introduce tipo de tratamiento (1 – 3): ");
                tipoTratamiento = teclado.nextInt();
            }

            System.out.print("Introduce número de sesiones de tratamiento (>0): ");
            int numSesiones = teclado.nextInt();
            // Seguimos pidiendo tipo de tratamiento hasta que el usuario teclee 1, 2 o 3
            while (numSesiones <= 0) {
                System.out.print("ERROR.Introduce número de sesiones de tratamiento (>0): ");
                numSesiones = teclado.nextInt();
            }

            double importe = 0;
            // En función del tipo de seguro y de tratamiento, calculamos el importe.
            // Además, incrementamos contadores, en el caso del tipo de seguro 1,
            // sumamos el importe total.

            switch (tipoSeguro) {
                case 1:
                    segurosTipo1++;
                    switch (tipoTratamiento) {
                        case 1:
                            importe = 15 * numSesiones;
                            break;
                        case 2:
                            importe = 20 * numSesiones;
                            break;
                        case 3:
                            importe = 16 * numSesiones;
                            break;
                    }
                    importeTotalSeguro1 += importe;
                    break;
                case 2:
                    segurosTipo2++;
                    switch (tipoTratamiento) {
                        case 1:
                            importe = 20 * numSesiones;
                            break;
                        case 2:
                            importe = 25 * numSesiones;
                            break;
                        case 3:
                            importe = 18 * numSesiones;
                            break;
                    }
                    break;
                case 3:
                    segurosTipo3++;
                    switch (tipoTratamiento) {
                        case 1:
                            importe = 25 * numSesiones;
                            break;
                        case 2:
                            importe = 30 * numSesiones;
                            break;
                        case 3:
                            importe = 20 * numSesiones;
                            break;
                    }
                    break;
            }

            // Mostramos importe a pagar por el paciente
            System.out.println("Importe a pagar por el paciente"
                    + " de número de seguro " + numSeguro
                    + ": " + importe + "\n");

            System.out.print("Introduce número de seguro del paciente (0 para salir): ");
            numSeguro = teclado.nextInt();
        }

        System.out.println("\nImporte a pagar por todos los pacientes del tipo de seguro 1: "
                + importeTotalSeguro1);
        System.out.println("Número de pacientes del tipo de seguro 1: " + segurosTipo1);
        System.out.println("Número de pacientes del tipo de seguro 2: " + segurosTipo2);
        System.out.println("Número de pacientes del tipo de seguro 3: " + segurosTipo3);
    }

}
