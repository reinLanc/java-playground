package ejercicio15;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        int numero = 4321;

        // Millares: dividimos entre 1000
        int millares = numero / 1000;

        // Centenas: quitamos los millares y dividimos entre 100
        int centenas = (numero % 1000) / 100;

        // Decenas: quitamos millares y centenas, dividimos entre 10
        int decenas = (numero % 100) / 10;

        // Unidades: resto de dividir entre 10
        int unidades = numero % 10;

        System.out.println("Número: " + numero);
        System.out.println(millares + " millares");
        System.out.println(centenas + " centenas");
        System.out.println(decenas + " decenas");
        System.out.println(unidades + " unidades");
    }
}

/* EXPLICACIÓN:
 * 4321 / 1000 = 4 (millares)
 * 4321 % 1000 = 321, 321 / 100 = 3 (centenas)
 * 321 % 100 = 21, 21 / 10 = 2 (decenas)
 * 21 % 10 = 1 (unidades)
 */
