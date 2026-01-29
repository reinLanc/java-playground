/*
Crea una clase llamada Matriz que contenga un constructor que inicialice el número de filas y el número de 
columnas de un nuevo objeto Matriz.

La clase Matriz tiene la siguiente información:

Número de filas de la matriz

Número de columnas de la matriz

Los datos de la matriz bidimensional

La clase Matriz tiene los siguientes métodos:

Obtener el número de filas

Obtener el número de columnas

Visualizar la matriz en pantalla

Establecer el valor de un elemento de la matriz en la posición dada (i, j)

Sumar dos matrices. Si las matrices no son sumables (distinto tamaño), mostrará
"No se pueden sumar las matrices".
El método recibirá como parámetro de entrada un objeto Matriz que sumará al propio objeto y devolverá otro 
objeto Matriz con la suma.

Devolver como un array unidimensional los datos de la diagonal principal.
Si la matriz no es cuadrada, mostrará "La matriz no es cuadrada".

Finalmente, crea dos objetos de este tipo y prueba todos los métodos.
 */
package exameud5_3;

/**
 *
 * @author Reinaldo Gil
 */
public class Exameud5_3 {

    public static void main(String[] args) {
         System.out.println("=== CREACIÓN DE MATRICES ===");
        
        // Crear dos matrices
        Matriz m1 = new Matriz(4, 4);
        Matriz m2 = new Matriz(4, 4);
        
        System.out.println("\nMatriz 1:");
        m1.visualizar();
        
        System.out.println("\nMatriz 2:");
        m2.visualizar();
        
        // Probar getFilas y getColumnas
        System.out.println("\n=== OBTENER DIMENSIONES ===");
        System.out.println("Filas de m1: " + m1.getFilas());
        System.out.println("Columnas de m1: " + m1.getColumnas());
        
        // Probar setElemento
        System.out.println("\n=== ESTABLECER ELEMENTO ===");
        System.out.println("Cambiando elemento [0][0] de m1 a 99");
        m1.setElemento(0, 0, 99);
        m1.visualizar();
        
        // Probar sumar
        System.out.println("\n=== SUMAR MATRICES ===");
        Matriz suma = m1.sumar(m2);
        if (suma != null) {
            System.out.println("Resultado de m1 + m2:");
            suma.visualizar();
        }
        
        // Probar con matrices no sumables
        System.out.println("\n=== MATRICES NO SUMABLES ===");
        Matriz m3 = new Matriz(2, 3);
        Matriz m4 = new Matriz(3, 2);
        System.out.println("Intentando sumar matriz 2x3 con matriz 3x2:");
        Matriz sumaInvalida = m3.sumar(m4);
        
        // Probar getDiagonalPrincipal
        System.out.println("\n=== DIAGONAL PRINCIPAL ===");
        int[] diagonal = m1.getDiagonalPrincipal();
        if (diagonal != null) {
            System.out.print("Diagonal principal de m1: [");
            for (int i = 0; i < diagonal.length; i++) {
                System.out.print(diagonal[i]);
                if (i < diagonal.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
        
        // Probar con matriz no cuadrada
        System.out.println("\n=== MATRIZ NO CUADRADA ===");
        Matriz m5 = new Matriz(3, 4);
        System.out.println("Matriz 3x4:");
        m5.visualizar();
        System.out.println("Intentando obtener diagonal principal:");
        m5.getDiagonalPrincipal();
    }
    }
    
