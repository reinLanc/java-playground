package ejercicio11;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        // a) Multiplicar por 8 sin usar el operador *
        int valor = 50;
        System.out.println("Valor inicial: " + valor);

        // Multiplicar por 8 usando desplazamiento de bits (<<)
        // Desplazar 3 bits a la izquierda equivale a multiplicar por 2³ = 8
        valor = valor << 3;
        System.out.println("Después de multiplicar por 8: " + valor);

        // b) Asignar a byte y mostrar
        byte valorByte = (byte) valor;
        System.out.println("Valor como byte: " + valorByte);

        System.out.println("\nExplicación del resultado:");
        System.out.println("400 en binario excede el rango de byte (-128 a 127)");
        System.out.println("Se produce overflow y el resultado es incorrecto");
    }
}

/* EXPLICACIÓN:
 * a) Operador << desplaza bits a la izquierda
 *    50 << 3 = 50 * 2³ = 50 * 8 = 400
 * 
 * b) byte solo almacena valores de -128 a 127
 *    400 excede este rango, causando overflow
 *    El resultado será: 400 - 256 = 144 (overflow circular)
 */
