/*
 * Una empresa aplica a sus productos tres tipos distintos de IVA (1 – 4%, 2 – 7%, 3 –
 16%). Suponiendo que se introducen por teclado los precios de adquisición de
 varios productos y el tipo de IVA a aplicar (1, 2, 3), calcula el precio de venta al
 público (resultante de sumar al precio de adquisición el margen y de aplicar al
 resultado el IVA correspondiente), sabiendo que el margen comercial viene dado en
 función del tipo de IVA y del precio de adquisición
 */
package ud2_practica3_3;

import java.util.*;

/**
 *
 * @author
 */
public class UD2_Practica3_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce precio del artículo (0 para salir): ");
        double precio = teclado.nextDouble();

        while (precio != 0) {

            System.out.print("Introduce IVA (1 – 4%, 2 – 7%, 3 – 16%): ");
            int iva = teclado.nextInt();
            // Seguimos pidiendo iva hasta que el usuario teclee 1, 2 o 3
            while (iva < 1 || iva > 3) {
                System.out.print("IVA incorrecto.Introduce IVA (1 – 4%, 2 – 7%, 3 – 16%): ");
                iva = teclado.nextInt();
            }

            int margen = 0; //Variable que guardará el margen
            // En función del tipo de iva y del precio, le asignamos el valor
            // correspondiente a la variable margen
            switch (iva) {
                case 1:
                    iva = 4;
                    if (precio <= 3000) {
                        margen = 30;
                    } else {
                        margen = 45;
                    }
                    break;
                case 2:
                    iva = 7;
                    if (precio <= 700) {
                        margen = 22;
                    } else {
                        margen = 50;
                    }
                    break;
                case 3:
                    iva = 16;
                    if (precio <= 180) {
                        margen = 75;
                    } else {
                        margen = 100;
                    }
                    break;
            }
            
            // Calculamos precio final incluyendo margen e iva
            double precioConMargen = precio + precio * margen / 100;
            double precioFinal = precioConMargen + precioConMargen * iva / 100;

            System.out.println("Precio de venta al público: " + precioFinal + "\n");

            System.out.print("Introduce precio del artículo (0 para salir): ");
            precio = teclado.nextDouble();
        }
    }

}
