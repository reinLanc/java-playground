package ampliacionalternativas1;

import java.util.Scanner;

public class AmpliacionAlternativas1 {

    public static void main(String[] args) {
        int codigoCliente, ultimaLectura, lecturaActual, potenciaContratada;
        double precioKw = 0.15, iva = 16, precio=0;
        boolean error = false;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce código cliente");
        codigoCliente = teclado.nextInt();
        System.out.println("Introduce última lectura del contador en Kw/h");
        ultimaLectura = teclado.nextInt();
        System.out.println("Lectura actual en Kw/h");
        lecturaActual = teclado.nextInt();
        System.out.println("Potencia   contratada");
        potenciaContratada = teclado.nextInt();
        switch (potenciaContratada) {
            case 3300:
                precio = 4;
                break;
            case 4400:
                precio = 6;
                break;
            case 5500:
                precio = 8;
                break;
            case 6600:
                precio = 10;
                break;
            case 7000:
                precio = 12;
                break;
            default:
                System.out.println("Potencia contratada errónea");
                error = true;
        }
        if (error==false) {
            precio = precio + (lecturaActual-ultimaLectura)*precioKw;
            precio = precio + precio*iva/100;
            System.out.println("Precio total: "+precio);
        }

    }

}
