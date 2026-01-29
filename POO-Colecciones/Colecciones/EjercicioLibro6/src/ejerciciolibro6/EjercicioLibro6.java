/*
Implementa el control de acceso al área restringida de un programa. Se debe pedir un nombre de usuario y 
una contraseña. Si el usuario introduce los datos correctamente, el programa dirá
“Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan las 
oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres de usuario
con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase HashMap.
 */
package ejerciciolibro6;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Reinaldo Gil
 */
public class EjercicioLibro6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Creamos el HashMap para almacenar usuarios y contraseñas
        // Clave: nombre de usuario, Valor: contraseña
        HashMap<String, String> usuarios = new HashMap<>();

        // Añadimos algunos usuarios al sistema
        usuarios.put("admin", "admin123");
        usuarios.put("usuario1", "pass1234");
        usuarios.put("maria", "maria2024");
        usuarios.put("carlos", "carlos99");
        usuarios.put("invitado", "guest");

        // Variables para el control de acceso
        int intentos = 0;
        final int MAX_INTENTOS = 3;
        boolean accesoPermitido = false;

        System.out.println("=== SISTEMA DE CONTROL DE ACCESO ===");
        System.out.println("Tienes " + MAX_INTENTOS + " intentos para acceder.\n");

        // Bucle para los intentos de login
        while (intentos < MAX_INTENTOS && !accesoPermitido) {
            // Pedimos usuario y contraseña
            System.out.print("Usuario: ");
            String usuario = teclado.nextLine();

            System.out.print("Contraseña: ");
            String contraseña = teclado.nextLine();

            // Verificamos si el usuario existe y la contraseña es correcta
            // containsKey() comprueba si existe la clave (usuario)
            // get() obtiene el valor asociado a esa clave (contraseña)
            if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contraseña)) {
                // Login correcto
                accesoPermitido = true;
                System.out.println("\n Ha accedido al área restringida");
                System.out.println("Bienvenido, " + usuario + "!");
            } else {
                // Login incorrecto
                intentos++;
                int restantes = MAX_INTENTOS - intentos;

                if (restantes > 0) {
                    System.out.println("\n Usuario o contraseña incorrectos.");
                    System.out.println("Te quedan " + restantes + " intentos.\n");
                }
            }
        }

        // Si se agotaron los intentos
        if (!accesoPermitido) {
            System.out.println("\n Lo siento, no tiene acceso al área restringida");
            System.out.println("Has agotado los " + MAX_INTENTOS + " intentos permitidos.");
        }

    }
    /*
 * EXPLICACIÓN DE HASHMAP:
 * 
 * HashMap es una estructura de datos que almacena pares clave-valor.
 * 
 * Características principales:
 * - Cada clave es única (no puede haber claves duplicadas)
 * - Búsqueda muy rápida por clave
 * - No mantiene orden de inserción
 * 
 * Métodos principales:
 * - put(clave, valor): añade o actualiza un par clave-valor
 * - get(clave): obtiene el valor asociado a una clave
 * - containsKey(clave): verifica si existe una clave
 * - remove(clave): elimina un par clave-valor
 * - size(): devuelve el número de elementos
 * 
 * En este ejercicio:
 * - Clave: nombre de usuario (String)
 * - Valor: contraseña (String)
     */
}
