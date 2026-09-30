/*
Una empresa registra las ventas de 5 productos durante 4 trimestres. Crear un programa que:
Almacene las ventas en una matriz (filas = productos, columnas = trimestres)
Calcule el total de ventas por producto
Determine qué trimestre tuvo mayores ventas globales
Identifique el producto más vendido del año
 */
package matrizventastrimestrales;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizVentasTrimestrales {

    public static void main(String[] args) {
        // Ventas de 5 productos en 4 trimestres
        double[][] ventas = {
            {15000, 18000, 22000, 19000}, // Producto A
            {12000, 13500, 14000, 16000}, // Producto B
            {20000, 21000, 19500, 23000}, // Producto C
            {8000, 9500, 11000, 10000}, // Producto D
            {25000, 27000, 26000, 28000} // Producto E
        };

        String[] productos = {"Laptop", "Mouse", "Monitor", "Teclado", "Impresora"};

        System.out.println("=== ANÁLISIS DE VENTAS ===\n");

        ventasPorProducto(ventas, productos);
        trimestreMayoresVentas(ventas);
        productoMasVendido(ventas, productos);
    }

    public static void ventasPorProducto(double[][] ventas, String[] productos) {
        System.out.println("Total de ventas por producto:");
        for (int i = 0; i < ventas.length; i++) {
            double total = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
            System.out.printf("%s: €%.2f\n", productos[i], total);
        }
        System.out.println();
    }

    public static void trimestreMayoresVentas(double[][] ventas) {
        double[] totalesTrimestre = new double[4];

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < ventas.length; i++) {
                totalesTrimestre[j] += ventas[i][j];
            }
        }

        int mejorTrimestre = 0;
        for (int i = 1; i < totalesTrimestre.length; i++) {
            if (totalesTrimestre[i] > totalesTrimestre[mejorTrimestre]) {
                mejorTrimestre = i;
            }
        }

        System.out.printf("Trimestre con mayores ventas: Q%d con $%.2f\n\n",
                (mejorTrimestre + 1), totalesTrimestre[mejorTrimestre]);
    }

    public static void productoMasVendido(double[][] ventas, String[] productos) {
        double maxVentas = 0;
        int indiceMax = 0;

        for (int i = 0; i < ventas.length; i++) {
            double total = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
            if (total > maxVentas) {
                maxVentas = total;
                indiceMax = i;
            }
        }

        System.out.printf("Producto más vendido del año: %s con $%.2f\n",
                productos[indiceMax], maxVentas);
    }
}
