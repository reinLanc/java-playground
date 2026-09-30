/*
 * Problema: Pantallas de Carga - ZX Spectrum
 *
 * El ZX Spectrum divide la pantalla en bloques de 8x8 píxeles.
 * Cada bloque solo puede mostrar como máximo 2 colores distintos.
 * Dado que cada color es representado por una letra (A-O),
 * debemos comprobar si cada bloque 8x8 usa 2 o menos letras distintas.
 *
 * Si TODOS los bloques cumplen la restricción -> "SI"
 * Si ALGÚN bloque usa más de 2 colores       -> "NO"
 */
package pantallacarga;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class PantallaCarga {

    public static void main(String[] args) {

        // Creamos el Scanner con el nombre requerido: "teclado"
        Scanner teclado = new Scanner(System.in);

        // Bucle principal: seguimos leyendo casos hasta recibir "0 0"
        while (teclado.hasNextInt()) {

            // Leemos las dimensiones de la imagen en píxeles
            int ancho = teclado.nextInt();  // número de columnas (píxeles horizontales)
            int alto = teclado.nextInt();  // número de filas   (píxeles verticales)

            // Condición de parada: si ambos son 0, terminamos
            if (ancho == 0 && alto == 0) {
                break;
            }

            // Leemos la imagen completa en una matriz de caracteres
            // Cada celda contiene una letra entre 'A' y 'O' (el color del píxel)
            char[][] imagen = new char[alto][ancho];

            for (int fila = 0; fila < alto; fila++) {
                // Leemos la siguiente línea de texto (una fila de píxeles)
                String linea = teclado.next();

                for (int col = 0; col < ancho; col++) {
                    // Guardamos cada carácter (color) en su posición de la matriz
                    imagen[fila][col] = linea.charAt(col);
                }
            }
            // Analizamos cada bloque de 8x8 píxeles
            /* Los bloques se obtienen dividiendo la imagen en cuadrículas de 8x8.
             Con ancho=16 y alto=8 tendríamos una cuadrícula de 2 columnas x 1 fila de bloques.
             Iteramos por bloques: el origen de cada bloque es (bloqueF*8, bloqueC*8)*/
            boolean esValida = true; // Asumimos que la imagen ES válida hasta que encontremos un bloque inválido

            // Recorremos cada bloque en vertical (por filas de bloques)
            for (int bloqueF = 0; bloqueF < alto / 8 && esValida; bloqueF++) {

                // Recorremos cada bloque en horizontal (por columnas de bloques)
                for (int bloqueC = 0; bloqueC < ancho / 8 && esValida; bloqueC++) {

                    // Usamos un HashSet para registrar los colores distintos del bloque actual.
                    // HashSet no admite duplicados, por lo que su tamaño indica cuántos
                    // colores únicos tiene el bloque.
                    HashSet<Character> coloresBloque = new HashSet<>();

                    // Recorremos los 8 píxeles en vertical dentro del bloque
                    for (int df = 0; df < 8; df++) {

                        // Recorremos los 8 píxeles en horizontal dentro del bloque
                        for (int dc = 0; dc < 8; dc++) {

                            // Calculamos las coordenadas absolutas del píxel en la imagen
                            int fila = bloqueF * 8 + df;
                            int col = bloqueC * 8 + dc;

                            // Añadimos el color de este píxel al conjunto del bloque
                            coloresBloque.add(imagen[fila][col]);

                            // Optimización: si ya hay más de 2 colores en este bloque,
                            // no tiene sentido seguir analizándolo; marcamos la imagen
                            // como inválida y salimos de todos los bucles.
                            if (coloresBloque.size() > 2) {
                                esValida = false;
                                break; // Sale del bucle de columnas de píxeles
                            }
                        }

                        // Si ya sabemos que es inválida, salimos también del bucle de filas
                        if (!esValida) {
                            break;
                        }
                    }
                    // Aquí termina el análisis de un bloque 8x8
                }
                // Aquí termina la columna de bloques para esta fila de bloques
            }
            // Aquí hemos analizado todos los bloques de la imagen

            // Mostramos el resultado del caso de prueba
            if (esValida) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        } // Fin del bucle principal (siguiente caso de prueba)
    }
}
