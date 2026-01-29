/*
Crear una clase Distancia con dos constructores (uno sin argumentos que por defecto guarde distancia
cero y otro con un argumento).
Crear setter, getter y método de visualización.
Crear un método que agregue dos objetos de tipo Distancia y devuelva el objeto Distancia resultante.

Finalmente, crear al menos dos objetos y probar todos los métodos.
 */
package exameud5_1;

/**
 *
 * @author Reinaldo Gil
 */
public class Exameud5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos con constructor por defecto
        Distancia d1 = new Distancia();
        System.out.println("Distancia 1 (constructor sin argumentos):");
        d1.visualizar();

        // Crear objeto con constructor con argumento
        Distancia d2 = new Distancia(150.5);
        System.out.println("\nDistancia 2 (constructor con argumento):");
        d2.visualizar();

        // Usar setter
        d1.setDistancia(75.3);
        System.out.println("\nDistancia 1 después de usar setter:");
        d1.visualizar();

        // Usar getter
        System.out.println("\nValor de d2 usando getter: " + d2.getDistancia());

        // Agregar dos distancias
        Distancia d3 = d1.agregar(d2);
        System.out.println("\nDistancia 3 (d1 + d2):");
        d3.visualizar();

        // Probar todos los métodos
        System.out.println("\n=== PRUEBA COMPLETA ===");
        Distancia test1 = new Distancia();
        Distancia test2 = new Distancia(200);

        System.out.println("Test 1:");
        test1.visualizar();
        System.out.println("Test 2:");
        test2.visualizar();

        Distancia suma = test1.agregar(test2);
        System.out.println("Suma de test1 y test2:");
        suma.visualizar();
    }

}
