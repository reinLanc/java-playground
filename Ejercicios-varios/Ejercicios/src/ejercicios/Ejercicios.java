/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class Ejercicios {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1: Matriz filas pares=10, columnas impares=11, resto=0 ===");
        ejercicio1();

        System.out.println("\n=== EJERCICIO 2: Contar digitos de cada elemento ===");
        ejercicio2();

        System.out.println("\n=== EJERCICIO 3: Rellenar matriz de distintas maneras ===");
        ejercicio3();

        System.out.println("\n=== EJERCICIO 5: Verificar si la matriz es magica ===");
        ejercicio5();

        System.out.println("\n=== EJERCICIO 8: Comite olimpico - Seleccion de atletas ===");
        ejercicio8();
    }

    // EJERCICIO 1
    // Matriz con filas pares = 10, columnas impares = 11, resto = 0
    static void ejercicio1() {
        System.out.print("Numero de filas: ");
        int n = teclado.nextInt();
        System.out.print("Numero de columnas: ");
        int m = teclado.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = 10;
                } else if (j % 2 != 0) {
                    matriz[i][j] = 11;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Resultado:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // EJERCICIO 2
    // Cargar matriz m x n y crear otra con la cantidad de digitos de cada elemento
    static void ejercicio2() {
        System.out.print("Numero de filas (m): ");
        int m = teclado.nextInt();
        System.out.print("Numero de columnas (n): ");
        int n = teclado.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int c = 0;
                int aux = A[i][j];
                do {
                    c++;
                    aux = aux / 10;
                } while (aux != 0);
                B[i][j] = c;
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + A[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("Matriz de cantidad de digitos:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + B[i][j] + "] ");
            }
            System.out.println();
        }
    }

    // EJERCICIO 3
    // Rellenar una matriz de distintas maneras
    static void ejercicio3() {
        System.out.print("Numero de filas: ");
        int m = teclado.nextInt();
        System.out.print("Numero de columnas: ");
        int n = teclado.nextInt();

        // a) Suma de indices
        System.out.println("\na) Suma de indices:");
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i + j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // b) Contador fila a fila
        System.out.println("\nb) Contador fila a fila:");
        int[][] b = new int[m][n];
        int cont = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = cont++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // c) Contador columna a columna
        System.out.println("\nc) Contador columna a columna:");
        int[][] c = new int[m][n];
        cont = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                c[i][j] = cont++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

        // d) Diagonal principal '*' y diagonal secundaria '+' (cuadrada)
        System.out.print("\nd) Tamanio para matriz cuadrada de diagonales: ");
        int size = teclado.nextInt();
        String[][] d = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                d[i][j] = " ";
            }
        }
        for (int i = 0; i < size; i++) {
            d[i][i] = "*";
            d[i][size - 1 - i] = "+";
        }
        System.out.println("Resultado diagonales:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + d[i][j] + "] ");
            }
            System.out.println();
        }
    }

    // EJERCICIO 5
    // Verificar si una matriz cuadrada es magica
static void ejercicio5() {
    int[][] matriz = {
        {16, 3, 2, 13},
        {5, 10, 11, 8},
        {9, 6, 7, 12},
        {4, 15, 14, 1}
    };

    int n = matriz.length;

    // Mostrar matriz
    System.out.println("Matriz:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(matriz[i][j] + "\t");
        }
        System.out.println();
    }

    // Suma de referencia (primera fila)
    int sumaReferencia = 0;
    for (int j = 0; j < n; j++) {
        sumaReferencia += matriz[0][j];
    }

    boolean esMagica = true;

    // Comprobar filas
    for (int i = 0; i < n; i++) {
        int sumaFila = 0;
        for (int j = 0; j < n; j++) {
            sumaFila += matriz[i][j];
        }
        if (sumaFila != sumaReferencia) {
            esMagica = false;
            break;
        }
    }

    // Comprobar columnas
    for (int j = 0; j < n && esMagica; j++) {
        int sumaColumna = 0;
        for (int i = 0; i < n; i++) {
            sumaColumna += matriz[i][j];
        }
        if (sumaColumna != sumaReferencia) {
            esMagica = false;
        }
    }

    // Diagonal principal
    int diagPrincipal = 0;
    for (int i = 0; i < n; i++) {
        diagPrincipal += matriz[i][i];
    }

    // Diagonal secundaria
    int diagSecundaria = 0;
    for (int i = 0; i < n; i++) {
        diagSecundaria += matriz[i][n - 1 - i];
    }

    if (diagPrincipal != sumaReferencia || diagSecundaria != sumaReferencia) {
        esMagica = false;
    }

    // Resultado final
    if (esMagica) {
        System.out.println("Es una matriz magica");
    } else {
        System.out.println("No es una matriz magica");
    }
}

    // EJERCICIO 8
    // Comite olimpico: 20 atletas, 10 carreras, seleccionar 3 mejores
    static void ejercicio8() {
        double[] factores = {0.5, 0.6, 0.7, 0.8, 0.9, 1.0, 1.1, 1.2, 1.3, 1.5};
        int numAtletas = 20;
        int numCarreras = 10;

        String[] nombres = new String[numAtletas];
        int[][] posiciones = new int[numAtletas][numCarreras];
        double[] puntuaciones = new double[numAtletas];

        for (int i = 0; i < numAtletas; i++) {
            System.out.print("Nombre del atleta " + (i + 1) + ": ");
            nombres[i] = teclado.next();
            for (int j = 0; j < numCarreras; j++) {
                System.out.print("  Posicion en carrera " + j + " (1-100): ");
                posiciones[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < numAtletas; i++) {
            double suma = 0;
            for (int j = 0; j < numCarreras; j++) {
                suma += posiciones[i][j] * factores[j];
            }
            puntuaciones[i] = suma / numCarreras;
        }

        System.out.println("\n--- TABLA DE ATLETAS ---");
        System.out.printf("%-15s", "Atleta");
        for (int j = 0; j < numCarreras; j++) {
            System.out.printf("C%-4d", j);
        }
        System.out.printf("%-10s%n", "Media");
        for (int i = 0; i < numAtletas; i++) {
            System.out.printf("%-15s", nombres[i]);
            for (int j = 0; j < numCarreras; j++) {
                System.out.printf("%-5d", posiciones[i][j]);
            }
            System.out.printf("%.2f%n", puntuaciones[i]);
        }

        // Ordenar burbuja (menor puntuacion = mejor)
        for (int i = 0; i < numAtletas - 1; i++) {
            for (int j = 0; j < numAtletas - 1 - i; j++) {
                if (puntuaciones[j] > puntuaciones[j + 1]) {
                    double tmpP = puntuaciones[j];
                    puntuaciones[j] = puntuaciones[j + 1];
                    puntuaciones[j + 1] = tmpP;
                    String tmpN = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tmpN;
                    int[] tmpR = posiciones[j];
                    posiciones[j] = posiciones[j + 1];
                    posiciones[j + 1] = tmpR;
                }
            }
        }

        System.out.println("\n--- 3 ATLETAS SELECCIONADOS ---");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %-15s Puntuacion media: %.2f%n", i + 1, nombres[i], puntuaciones[i]);
        }

        System.out.println("\n--- RANKING COMPLETO (mejor a peor) ---");
        for (int i = 0; i < numAtletas; i++) {
            System.out.printf("%2d. %-15s %.2f%n", i + 1, nombres[i], puntuaciones[i]);
        }
    }

}
