/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizsimetrica;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        boolean simetrica = true;

        for (int i = 0; i < matriz.length && simetrica; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        System.out.println("¿Es simétrica? " + simetrica);
    }
}

