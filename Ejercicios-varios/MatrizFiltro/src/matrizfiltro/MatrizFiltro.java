/*
Ejercicio 1: Matrices (Complejidad Media-Alta)Enunciado:
Filtro de Suavizado de Imágenes y Binarización (Umbral)En el procesamiento digital de imágenes, las 
fotografías se representan como matrices donde cada celda es un píxel con un valor de brillo (de 0 a 255)
.Escribe un programa en Java que solicite al usuario los valores de una matriz de $4 \times 4$ píxeles.
El programa debe realizar dos tareas complejas:Filtro de Vecindad (Suavizado): Generar una nueva matriz
de tipo double donde cada celda sea el promedio entre el píxel original y sus vecinos directos (arriba, abajo,
izquierda y derecha). Debes asegurarte de controlar los límites de la matriz (las esquinas y bordes tienen 
menos vecinos).Binarización por Umbral: Solicitar al usuario un valor límite (umbral). Si el valor de la matriz 
suavizada es mayor o igual al umbral, el píxel se convierte en 1 (blanco); si es menor, se convierte en
0 (negro). Esta última matriz debe ser de enteros.Al final, el programa debe mostrar las tres matrices
construyendo las filas en cadenas de texto para imprimirlas exclusivamente con System.out.println.
 */
package matrizfiltro;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizFiltro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Matriz original para almacenar los valores de los píxeles (0 a 255)
        int[][] matrizOriginal = new int[4][4];

        // 1. Lectura de datos
        System.out.println("--- INGRESO DE DATOS DE LA MATRIZ (4x4) ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el valor para el pixel [" + i + "][" + j + "] (0-255):");
                matrizOriginal[i][j] = teclado.nextInt();
            }
        }

        // Matriz secundaria para almacenar los promedios reales
        double[][] matrizSuavizada = new double[4][4];

        // 2. Procesamiento Matemático: Filtro de Vecindad
        // Este bloque enseña a los alumnos a controlar de forma estricta los límites (evitar IndexOutOfBounds)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double suma = matrizOriginal[i][j]; // Sumamos el píxel actual
                int cantidadVecinos = 1;            // Contador de celdas válidas evaluadas

                // Validar vecino de ARRIBA (Fila anterior dentro de rango)
                if (i - 1 >= 0) {
                    suma += matrizOriginal[i - 1][j];
                    cantidadVecinos++;
                }
                // Validar vecino de ABAJO (Fila siguiente dentro de rango)
                if (i + 1 < 4) {
                    suma += matrizOriginal[i + 1][j];
                    cantidadVecinos++;
                }
                // Validar vecino de la IZQUIERDA (Columna anterior dentro de rango)
                if (j - 1 >= 0) {
                    suma += matrizOriginal[i][j - 1];
                    cantidadVecinos++;
                }
                // Validar vecino de la DERECHA (Columna siguiente dentro de rango)
                if (j + 1 < 4) {
                    suma += matrizOriginal[i][j + 1];
                    cantidadVecinos++;
                }

                // Calculamos el promedio exacto para esa celda
                matrizSuavizada[i][j] = suma / cantidadVecinos;
            }
        }

        // 3. Solicitar el umbral de binarización
        System.out.println("Ingrese el valor del umbral (0.0 a 255.0) para binarizar la imagen:");
        double umbral = teclado.nextDouble();

        // Matriz final binaria
        int[][] matrizBinarizada = new int[4][4];

        // Evaluamos cada posición con respecto al umbral establecido
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrizSuavizada[i][j] >= umbral) {
                    matrizBinarizada[i][j] = 1;
                } else {
                    matrizBinarizada[i][j] = 0;
                }
            }
        }

        // 4. Impresión de Resultados utilizando estrictamente System.out.println
        System.out.println("=== MATRIZ ORIGINAL ===");
        for (int i = 0; i < 4; i++) {
            String fila = "";
            for (int j = 0; j < 4; j++) {
                fila += matrizOriginal[i][j] + "    ";
            }
            System.out.println(fila);
        }

        System.out.println("=== MATRIZ SUAVIZADA (PROMEDIOS) ===");
        for (int i = 0; i < 4; i++) {
            String fila = "";
            for (int j = 0; j < 4; j++) {
                fila += matrizSuavizada[i][j] + "  ";
            }
            System.out.println(fila);
        }

        System.out.println("=== MATRIZ BINARIZADA (UMBRAL: " + umbral + ") ===");
        for (int i = 0; i < 4; i++) {
            String fila = "";
            for (int j = 0; j < 4; j++) {
                fila += matrizBinarizada[i][j] + "    ";
            }
            System.out.println(fila);
        }
    }
}
