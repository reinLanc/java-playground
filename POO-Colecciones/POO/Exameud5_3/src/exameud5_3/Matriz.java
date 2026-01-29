package exameud5_3;
/**
 *
 * @author Reinaldo Gil
 */
public class Matriz {

    private int filas;
    private int columnas;
    private int[][] datos;

    // Constructor que inicialice el número de filas y columnas
    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.datos = new int[filas][columnas];

        // Inicializar con valores aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                datos[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    // Obtener el número de filas
    public int getFilas() {
        return filas;
    }

    // Obtener el número de columnas
    public int getColumnas() {
        return columnas;
    }

    // Visualizar matriz en pantalla
    public void visualizar() {
        System.out.println("Matriz " + filas + "x" + columnas + ":");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Establecer el valor de un elemento en la posición (i, j)
    public void setElemento(int i, int j, int valor) {
        if (i >= 0 && i < filas && j >= 0 && j < columnas) {
            datos[i][j] = valor;
        } else {
            System.out.println("Posición fuera de rango");
        }
    }

    // Sumar dos matrices
    public Matriz sumar(Matriz otra) {
        // Verificar si son sumables (mismo tamaño)
        if (this.filas != otra.filas || this.columnas != otra.columnas) {
            System.out.println("No se pueden sumar las matrices");
            return null;
        }

        // Crear matriz resultado
        Matriz resultado = new Matriz(this.filas, this.columnas);

        // Sumar elemento por elemento
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.datos[i][j] = this.datos[i][j] + otra.datos[i][j];
            }
        }

        return resultado;
    }

    // Devolver como array unidimensional los datos de la diagonal principal
    public int[] getDiagonalPrincipal() {
        // Verificar si es matriz cuadrada
        if (filas != columnas) {
            System.out.println("La matriz no es cuadrada");
            return null;
        }

        int[] diagonal = new int[filas];

        for (int i = 0; i < filas; i++) {
            diagonal[i] = datos[i][i];
        }

        return diagonal;
    }
}
