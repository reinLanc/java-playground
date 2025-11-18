/*
Programa que muestre una tabla de multiplicar de tamaño N ( se pide por teclado )
 */
package exametablademultiplicar;
import java.util.Scanner;
/**
 *
 * @author Reinaldo Gil
 */
public class ExameTablaDeMultiplicar {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño N de la tabla: ");
        int n = teclado.nextInt();
        
        // Imprimir encabezado
        System.out.print("   |");
        for (int col = 1; col <= n; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();
        
        // Línea separadora
        System.out.print("----");
        for (int col = 1; col <= n; col++) {
            System.out.print("----");
        }
        System.out.println();
        
        // Imprimir tabla
        for (int fila = 1; fila <= n; fila++) {
            System.out.printf("%2d |", fila);
            
            for (int col = 1; col <= n; col++) {
                // Calcular multiplicación usando solo sumas
                int resultado = 0;
                for (int i = 0; i < fila; i++) {
                    resultado += col;
                }
                System.out.printf("%4d", resultado);
            }
            System.out.println();
        }
    }
}
