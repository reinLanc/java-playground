/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizparesimpares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizParesImpares {

    /**
     * @param args the command line arguments
     */
    public void matriz() throws IOException {
        int n = Integer.parseInt(leer("Ingrese el numero de filas"));
        int m = Integer.parseInt(leer("Ingrese el numero de columnas"));

        int matriz[][] = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = 10;
                } else if (j % 2 != 0) {
                    matriz[i][j] = 11;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public String leer(String mensaje) throws IOException {
        BufferedReader enlace = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(mensaje);
        return enlace.readLine();
    }

    public static void main(String[] args) throws IOException {
        Ejer1 e = new Ejer1();
        e.matriz();
    }
}
