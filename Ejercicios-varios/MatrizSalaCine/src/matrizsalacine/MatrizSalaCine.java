/*
Una sala de cine tiene 8 filas y 10 asientos por fila. Crear un programa que:
Inicialice la matriz de asientos (0 = libre, 1 = ocupado)
Reserve asientos específicos
Muestre cuántos asientos libres quedan por fila
Calcule el porcentaje de ocupación total de la sala
 */
package matrizsalacine;

/**
 *
 * @author Reinaldo Gil
 */
public class MatrizSalaCine {

    public static void main(String[] args) {
        int[][] sala = new int[8][10];

        // Simular algunas reservas
        reservarAsiento(sala, 0, 5);
        reservarAsiento(sala, 0, 6);
        reservarAsiento(sala, 3, 2);
        reservarAsiento(sala, 3, 3);
        reservarAsiento(sala, 3, 4);
        reservarAsiento(sala, 7, 9);

        mostrarEstadoSala(sala);
        mostrarAsientosLibresPorFila(sala);
        System.out.printf("Ocupación total: %.2f%%\n", calcularOcupacion(sala));
    }

    public static void reservarAsiento(int[][] sala, int fila, int asiento) {
        if (sala[fila][asiento] == 0) {
            sala[fila][asiento] = 1;
            System.out.println("Asiento reservado: Fila " + (fila + 1) + ", Asiento " + (asiento + 1));
        } else {
            System.out.println("El asiento ya está ocupado");
        }
    }

    public static void mostrarEstadoSala(int[][] sala) {
        System.out.println("\n=== ESTADO DE LA SALA ===");
        System.out.print("   ");
        for (int i = 1; i <= sala[0].length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();

        for (int i = 0; i < sala.length; i++) {
            System.out.printf("F%d ", (i + 1));
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] == 0 ? " · " : " X ");
            }
            System.out.println();
        }
    }

    public static void mostrarAsientosLibresPorFila(int[][] sala) {
        System.out.println("\n=== ASIENTOS LIBRES POR FILA ===");
        for (int i = 0; i < sala.length; i++) {
            int libres = 0;
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == 0) {
                    libres++;
                }
            }
            System.out.printf("Fila %d: %d asientos libres\n", (i + 1), libres);
        }
    }

    public static double calcularOcupacion(int[][] sala) {
        int ocupados = 0;
        int total = sala.length * sala[0].length;

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == 1) {
                    ocupados++;
                }
            }
        }

        return (ocupados * 100.0) / total;
    }

}
