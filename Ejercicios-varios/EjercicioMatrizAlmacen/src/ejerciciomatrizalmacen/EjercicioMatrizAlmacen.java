/**
 * EJERCICIO 6 — Control de stock de un almacén
 * 
 * Un almacén tiene P productos y T tiendas.
 * El stock se representa en una matriz P×T donde
 * stock[i][j] = unidades del producto i en la tienda j.
 *
 * El programa debe:
 *   1. Leer la matriz de stock.
 *   2. Calcular el stock TOTAL de cada producto (suma de su fila).
 *   3. Calcular el stock TOTAL de cada tienda (suma de su columna).
 *   4. Detectar qué productos están en situación crítica
 *      (stock total < umbral mínimo introducido por el usuario).
 *   5. Encontrar qué tienda tiene el stock más DESCOMPENSADO,
 *      es decir, la mayor diferencia entre su producto más abundante
 *      y su producto más escaso.
 *
 * Ejemplo con 3 productos y 4 tiendas, umbral = 10:
 *
 *          T0   T1   T2   T3
 *   P0  [  5    3    0    2  ]   total =  10  -> limite justo 
 * P1 [ 8 6 4 7 ] total = 25 -> ok 
 * P2  [ 1 0 2 0 ] total = 3 -> CRITICO
 *
 * Stock tienda T0: 5+8+1=14 Stock tienda T1: 3+6+0= 9 Stock tienda T2: 0+4+2= 6
 * Stock tienda T3: 2+7+0= 9
 *
 * Descompensación: T0: max=8, min=1, diferencia=7 T1: max=6, min=0,
 * diferencia=6 T2: max=4, min=0, diferencia=4 T3: max=7, min=0, diferencia=7
 * Tiendas más descompensadas: T0 y T3 (empate con diferencia 7)
 */
package ejerciciomatrizalmacen;

import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioMatrizAlmacen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Leemos el número de productos y de tiendas
        System.out.print("Numero de productos: ");
        int productos = teclado.nextInt();

        System.out.print("Numero de tiendas: ");
        int tiendas = teclado.nextInt();

        // Umbral mínimo de stock total por producto
        System.out.print("Umbral minimo de stock total para considerar critico: ");
        int umbral = teclado.nextInt();

        // Rellenamos la matriz de stock
        int[][] stock = new int[productos][tiendas];

        System.out.println("Introduce el stock (producto por producto, tienda por tienda):");
        for (int i = 0; i < productos; i++) {
            System.out.print("Producto " + i + ": ");
            for (int j = 0; j < tiendas; j++) {
                stock[i][j] = teclado.nextInt();
            }
        }

        // PARTE 1: stock total por producto (suma de cada fila)
        System.out.println("Stock total por producto:");
        for (int i = 0; i < productos; i++) {
            int totalProducto = 0;
            for (int j = 0; j < tiendas; j++) {
                totalProducto += stock[i][j];
            }
            System.out.println("  Producto " + i + ": " + totalProducto + " unidades");
        }

        // PARTE 2: stock total por tienda (suma de cada columna)
        System.out.println("Stock total por tienda:");
        for (int j = 0; j < tiendas; j++) {
            int totalTienda = 0;
            for (int i = 0; i < productos; i++) {
                totalTienda += stock[i][j];
            }
            System.out.println("  Tienda " + j + ": " + totalTienda + " unidades");
        }

        // PARTE 3: productos en situación crítica
        // Un producto es crítico si su stock total en todas las tiendas
        // es menor que el umbral introducido
        System.out.println("Productos en situacion critica (total < " + umbral + "):");
        boolean hayCriticos = false;

        for (int i = 0; i < productos; i++) {
            int totalProducto = 0;
            for (int j = 0; j < tiendas; j++) {
                totalProducto += stock[i][j];
            }
            if (totalProducto < umbral) {
                System.out.println("  Producto " + i + " -> solo " + totalProducto + " unidades en total");
                hayCriticos = true;
            }
        }

        if (!hayCriticos) {
            System.out.println("  Ningun producto esta en situacion critica");
        }

        // PARTE 4: tienda más descompensada
        // Para cada tienda calculamos: max del producto más abundante
        // menos el min del producto más escaso.
        // La tienda con mayor diferencia es la más descompensada.
        int mayorDiferencia = -1;  // la mayor diferencia encontrada
        int tiendaDesequilibrada = 0; // índice de esa tienda

        for (int j = 0; j < tiendas; j++) {

            // Inicializamos max y min con el primer producto de esta tienda
            int maxStock = stock[0][j];
            int minStock = stock[0][j];

            // Recorremos el resto de productos buscando el máximo y mínimo
            for (int i = 1; i < productos; i++) {
                if (stock[i][j] > maxStock) {
                    maxStock = stock[i][j];
                }
                if (stock[i][j] < minStock) {
                    minStock = stock[i][j];
                }
            }

            int diferencia = maxStock - minStock;

            // Nos quedamos con la tienda que tenga la mayor diferencia
            if (diferencia > mayorDiferencia) {
                mayorDiferencia = diferencia;
                tiendaDesequilibrada = j;
            }
        }

        System.out.println("Tienda mas descompensada: Tienda " + tiendaDesequilibrada
                + " (diferencia entre max y min: " + mayorDiferencia + " unidades)");

    }

}
