/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizmagica;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int acu2 = 0;
        int vec[]  = new int[4];
        int vec2[] = new int[4];
        int vec3[] = new int[4];
 
        int matriz[][] = {
            {16,  3,  2, 13},
            { 5, 10, 11,  8},
            { 9,  6,  7, 12},
            { 4, 15, 14,  1}
        };
 
        imprimir(matriz);
 
        // Vector fila: suma de cada fila
        for (int i = 0; i < matriz.length; i++) {
            int acu1 = 0;
            for (int j = 0; j < matriz.length; j++) {
                acu1 += matriz[i][j];
            }
            vec[i] = acu1;
        }
 
        // Vector columna: suma de cada columna
        for (int i = 0; i < matriz.length; i++) {
            int acu1 = 0;
            for (int j = 0; j < matriz.length; j++) {
                acu1 += matriz[j][i];
            }
            vec2[i] = acu1;
        }
 
        // Vector diagonal: suma de la diagonal principal (repetida en vec3)
        for (int i = 0; i < matriz.length; i++) {
            int acu1 = 0;
            for (int j = 0; j < matriz.length; j++) {
                acu1 += matriz[j][j];
            }
            vec3[i] = acu1;
        }
 
        comprobacion(vec, vec2, vec3);
    }
 
    public void comprobacion(int vec1[], int vec2[], int vec3[]) {
        int acu = 0;
        for (int i = 0; i < vec2.length; i++) {
            if (vec1[i] == vec3[i] && vec2[i] == vec1[i]) {
                acu++;
            }
        }
        if (acu == 4) {
            System.out.println("Es una matriz magica");
        } else {
            System.out.println("No es una matriz magica");
        }
    }
 
    public void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        Ejer5 e = new Ejer5();
        e.MatrizMagica();
    }
    
}
