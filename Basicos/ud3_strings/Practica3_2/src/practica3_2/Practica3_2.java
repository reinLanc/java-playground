package practica3_2;

import java.util.Scanner;

public class Practica3_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cuenta;

        System.out.println("Introduce cuenta bancaria (20 digitos)");
        cuenta = teclado.nextLine();
        
        System.out.println("Cuenta del Banco " + cuenta);

        System.out.println("cuenta cumple el patrón (20 dígitos)");

        String banco = "00" + cuenta.substring(0, 8);
        System.out.println("Banco (con 00) " + banco);

        int suma = Integer.parseInt(banco.substring(0, 1)) * 1
                + Integer.parseInt(banco.substring(1, 2)) * 2
                + Integer.parseInt(banco.substring(2, 3)) * 4
                + Integer.parseInt(banco.substring(3, 4)) * 8
                + Integer.parseInt(banco.substring(4, 5)) * 5
                + Integer.parseInt(banco.substring(5, 6)) * 10
                + Integer.parseInt(banco.substring(6, 7)) * 9
                + Integer.parseInt(banco.substring(7, 8)) * 7
                + Integer.parseInt(banco.substring(8, 9)) * 3
                + Integer.parseInt(banco.substring(9, 10)) * 6;

        int control = 11 - (suma % 11);
        System.out.println("control banco después del modulo 11 " + control);
        if (control == 10) {
            control = 1;
        } else if (control == 11) {
            control = 0;
        }

        System.out.println("control " + control);

        int controlBanco = Integer.parseInt(cuenta.substring(8, 9));
        if (controlBanco != control) {
            System.out.println("Dígito de control incorrecto");
        }
        else
            System.out.println("El control del banco está bien");

        System.out.println("cuenta " + cuenta.substring(10, 20));

        suma = Integer.parseInt(cuenta.substring(10, 11)) * 1
                + Integer.parseInt(cuenta.substring(11, 12)) * 2
                + Integer.parseInt(cuenta.substring(12, 13)) * 4
                + Integer.parseInt(cuenta.substring(13, 14)) * 8
                + Integer.parseInt(cuenta.substring(14, 15)) * 5
                + Integer.parseInt(cuenta.substring(15, 16)) * 10
                + Integer.parseInt(cuenta.substring(16, 17)) * 9
                + Integer.parseInt(cuenta.substring(17, 18)) * 7
                + Integer.parseInt(cuenta.substring(18, 19)) * 3
                + Integer.parseInt(cuenta.substring(19, 20)) * 6;

        control = 11 - (suma % 11);
        System.out.println("control cuenta después del modulo 11 " + control);
        if (control == 10) {
            control = 1;
        } else if (control == 11) {
            control = 0;
        }

        System.out.println("control " + control);

        int controlcuenta = Integer.parseInt(cuenta.substring(9, 10));
        if (controlcuenta != control) {
            System.out.println("Digito de control incorrecto");
        } else {
            System.out.println("Digito de control correcto");
        }

    }

}
