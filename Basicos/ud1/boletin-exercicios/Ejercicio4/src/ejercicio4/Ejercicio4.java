package ejercicio4;
/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Declaramos las variables char con las letras a y z
        char letraA = 'a';
        char letraZ = 'z';

        // Convertimos a int para ver el código Unicode
        int codigoA = (int) letraA;
        int codigoZ = (int) letraZ;

        // Mostramos los códigos
        System.out.println("Código Unicode de 'a': " + codigoA);
        System.out.println("Código Unicode de 'z': " + codigoZ);

        // Calculamos cuántas letras minúsculas hay
        int numeroLetras = codigoZ - codigoA + 1;
        System.out.println("Número de letras minúsculas: " + numeroLetras);
    }
}

/* EXPLICACIÓN:
 * - char almacena caracteres en Unicode (2 bytes)
 * - Al convertir char a int obtenemos el código numérico
 * - 'a' tiene el código 97 y 'z' el 122
 * - Como son contiguas: 122 - 97 + 1 = 26 letras
 */
