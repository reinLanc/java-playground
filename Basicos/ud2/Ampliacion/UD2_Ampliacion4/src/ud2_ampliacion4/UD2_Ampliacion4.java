/*
 * En una clínica de rehabilitación se atienden pacientes de tres tipos de seguros (1, 2
 * y 3). Hay 3 tipos de tratamiento distintos y su precio por sesión es diferente según
 * el tipo de seguro.
 * Datos de entrada:
 * . Numero de seguro del paciente.
 * . Tipo de seguro (Se admitiran solamente los tipos 1, 2, 3).
 * . Tipo de tratamiento (Se admitiran solamente los tipos 1,2,3). Un mismo
 * paciente solo puede recibir un tipo de tratamiento.
 * ◦ Número de sesiones de tratamiento recibidas.
 * El proceso termina al introducir el número de seguro del paciente 0.
 * El programa calcula:
 * ◦ Importe a pagar por cada paciente en función del tipo de seguro, del
 * tratamiento y del número de sesiones recibidas..
 * ◦ Importe a pagar por todos los pacientes del tipo de seguro 1.
 * ◦ Número de pacientes de cada tipo de seguro.
 */
package ud2_ampliacion4;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Ampliacion4 {

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
