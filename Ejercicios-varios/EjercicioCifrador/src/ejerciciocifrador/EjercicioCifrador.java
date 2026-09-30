/**
 * EJERCICIO 11 — Cifrador de mensajes con matriz de sustitucion
 *
 * El programa implementa un cifrado por sustitucion usando una matriz 5x5.
 *
 * COMO FUNCIONA:
 *   1. Se tiene una matriz 5x5 que contiene las letras A-Y (25 letras, sin la Z).
 *      Cada letra ocupa una posicion (fila, columna) en la matriz.
 *
 *   2. Para CIFRAR una letra del mensaje, buscamos su posicion (i,j)
 *      en la matriz y la sustituimos por la letra que esta en la posicion
 *      ROTADA: (j, 4-i). Es decir, intercambiamos fila y columna
 *      y ademas "invertimos" la fila.
 *
 *   3. Para DESCIFRAR aplicamos la operacion inversa.
 *
 * Ejemplo con la matriz estandar en orden alfabetico:
 *   A B C D E      A esta en (0,0) -> cifrada: letra en (0,4) = E
 *   F G H I J      B esta en (0,1) -> cifrada: letra en (1,4) = J
 *   K L M N O      M esta en (2,2) -> cifrada: letra en (2,2) = M  (centro, se cifra a si misma)
 *   P Q R S T
 *   U V W X Y
 *
 * Ademas el programa usa:
 *   - HashMap<Character, int[]> para buscar la posicion de cada letra rapidamente
 * - ArrayList<Character> para guardar las letras del mensaje cifrado
 */
package ejerciciocifrador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioCifrador {

    static final int TAM = 5; // la matriz es siempre 5x5

    /**
     * Construye un HashMap que mapea cada letra a su posicion [fila, col] en la
     * matriz. Esto permite buscar la posicion de cualquier letra en O(1) en
     * lugar de recorrer toda la matriz cada vez.
     *
     * Ejemplo: posiciones.get('A') devuelve {0, 0} posiciones.get('G') devuelve
     * {1, 1}
     */
    static HashMap<Character, int[]> construirPosiciones(char[][] matriz) {
        HashMap<Character, int[]> posiciones = new HashMap<Character, int[]>();
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                posiciones.put(matriz[i][j], new int[]{i, j});
            }
        }
        return posiciones;
    }

    /**
     * Cifra un unico caracter usando la matriz y el mapa de posiciones. Si el
     * caracter no esta en la matriz (espacios, signos de puntuacion, Z...), lo
     * devuelve sin modificar.
     *
     * Formula de cifrado: la letra en (i,j) se cifra con la letra en (j,
     * TAM-1-i)
     */
    static char cifrarLetra(char letra, char[][] matriz, HashMap<Character, int[]> posiciones) {
        // Convertimos a mayuscula para uniformidad
        char mayus = Character.toUpperCase(letra);

        // Si la letra no esta en nuestra matriz, la devolvemos sin cambios
        if (!posiciones.containsKey(mayus)) {
            return letra;
        }

        // Obtenemos la posicion (i, j) de la letra en la matriz
        int[] pos = posiciones.get(mayus);
        int i = pos[0];
        int j = pos[1];

        // Aplicamos la formula de rotacion: nueva posicion es (j, TAM-1-i)
        return matriz[j][TAM - 1 - i];
    }

    /**
     * Descifra un caracter aplicando la operacion inversa. Si ciframos (i,j) ->
     * (j, TAM-1-i), para deshacer el cifrado aplicamos la misma formula dos
     * veces mas (la operacion tiene orden 4, es decir, aplicarla 4 veces
     * devuelve la letra original). La inversa directa es: la letra en (i,j) se
     * descifra con la letra en (TAM-1-j, i)
     */
    static char descifrarLetra(char letra, char[][] matriz, HashMap<Character, int[]> posiciones) {
        char mayus = Character.toUpperCase(letra);
        if (!posiciones.containsKey(mayus)) {
            return letra;
        }

        int[] pos = posiciones.get(mayus);
        int i = pos[0];
        int j = pos[1];

        // Formula inversa: (i,j) -> (TAM-1-j, i)
        return matriz[TAM - 1 - j][i];
    }

    /**
     * Imprime la matriz de cifrado con formato de tabla.
     */
    static void mostrarMatriz(char[][] matriz) {
        System.out.println("Matriz de cifrado:");
        System.out.println("    0   1   2   3   4");
        for (int i = 0; i < TAM; i++) {
            System.out.print(i + " [ ");
            for (int j = 0; j < TAM; j++) {
                System.out.print(matriz[i][j] + " ");
                if (j < TAM - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // ---------------------------------------------------------------
        // CONSTRUCCION DE LA MATRIZ 5x5
        // El usuario puede introducir su propia clave (una permutacion de A-Y)
        // o usamos el orden alfabetico por defecto.
        // ---------------------------------------------------------------
        char[][] matriz = new char[TAM][TAM];

        System.out.println("¿Usar la matriz alfabetica por defecto (A-Y)? (s/n): ");
        String opcion = teclado.nextLine().trim().toLowerCase();

        if (opcion.equals("s")) {
            // Rellenamos en orden alfabetico: A=65 en ASCII
            char letra = 'A';
            for (int i = 0; i < TAM; i++) {
                for (int j = 0; j < TAM; j++) {
                    matriz[i][j] = letra;
                    letra++;
                }
            }
        } else {
            // El usuario introduce su propia clave: 25 letras distintas A-Y
            System.out.println("Introduce las 25 letras de la matriz (sin Z, sin repetir):");
            for (int i = 0; i < TAM; i++) {
                for (int j = 0; j < TAM; j++) {
                    System.out.print("Posicion (" + i + "," + j + "): ");
                    String entrada = teclado.nextLine().trim().toUpperCase();
                    matriz[i][j] = entrada.charAt(0);
                }
            }
        }

        mostrarMatriz(matriz);

        // Construimos el HashMap de posiciones una sola vez (eficiencia)
        HashMap<Character, int[]> posiciones = construirPosiciones(matriz);

        // ---------------------------------------------------------------
        // MENU PRINCIPAL: cifrar o descifrar
        // ---------------------------------------------------------------
        System.out.println("¿Que quieres hacer?");
        System.out.println("  1. Cifrar un mensaje");
        System.out.println("  2. Descifrar un mensaje");
        System.out.print("Opcion: ");
        int modoOpcion = teclado.nextInt();
        teclado.nextLine(); // consumimos el salto de linea

        System.out.print("Introduce el mensaje: ");
        String mensaje = teclado.nextLine();

        // ---------------------------------------------------------------
        // PROCESAMOS EL MENSAJE caracter a caracter
        // Guardamos el resultado en un ArrayList<Character>
        // ---------------------------------------------------------------
        ArrayList<Character> resultado = new ArrayList<Character>();

        for (int pos = 0; pos < mensaje.length(); pos++) {
            char c = mensaje.charAt(pos);

            if (modoOpcion == 1) {
                resultado.add(cifrarLetra(c, matriz, posiciones));
            } else {
                resultado.add(descifrarLetra(c, matriz, posiciones));
            }
        }

        // ---------------------------------------------------------------
        // Construimos el String final desde el ArrayList
        // ---------------------------------------------------------------
        StringBuilder sb = new StringBuilder();
        for (char c : resultado) {
            sb.append(c);
        }
        String mensajeFinal = sb.toString();

        if (modoOpcion == 1) {
            System.out.println("Mensaje original: " + mensaje);
            System.out.println("Mensaje cifrado:  " + mensajeFinal);
        } else {
            System.out.println("Mensaje cifrado:    " + mensaje);
            System.out.println("Mensaje descifrado: " + mensajeFinal);
        }

        // Estadistica: cuantas letras se cifraron vs cuantos caracteres
        // se dejaron igual (espacios, signos, Z...)
        int cifradas = 0;
        int sinCambio = 0;
        for (int i = 0; i < mensaje.length(); i++) {
            char orig = Character.toUpperCase(mensaje.charAt(i));
            if (posiciones.containsKey(orig)) {
                cifradas++;
            } else {
                sinCambio++;
            }
        }
        System.out.println("Letras cifradas: " + cifradas + " | Caracteres sin cambio: " + sinCambio);

        teclado.close();
    }

}
