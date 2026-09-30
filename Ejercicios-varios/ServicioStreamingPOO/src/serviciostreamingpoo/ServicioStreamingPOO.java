/**
 * Clase Main — Punto de entrada de la aplicación
 * ================================================
 * Demuestra el funcionamiento de todos los requisitos del enunciado:
 *
 *   1. Creación de usuarios gratuitos y de pago.
 *   2. Reproducción con control de límite diario (usuario gratis).
 *   3. Reproducción sin restricciones (usuario de pago).
 *   4. Validación de email y número de cuenta.
 *   5. Listas de reproducción: crear, añadir, ver y reproducir.
 *   6. toString() de los usuarios.
 */
package serviciostreamingpoo;

/** 
 *
 * @author Reinaldo Gil
 */
public class ServicioStreamingPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   STREAMING APP - DEMO COMPLETA");
        System.out.println("========================================\n");

        // ?? 1. CREAR CONTENIDOS ?????????????????????????????????????????????
        Cancion c1 = new Cancion("Bohemian Rhapsody", "Queen", 354);         // 5:54
        Cancion c2 = new Cancion("Hotel California", "Eagles", 391);          // 6:31
        Cancion c3 = new Cancion("Stairway to Heaven", "Led Zeppelin", 482); // 8:02

        Podcast p1 = new Podcast("El dos de mayo", "Historia", 3023);    // 50:23
        Podcast p2 = new Podcast("IA en el aula", "Tecnologia", 1800);   // 30:00

        System.out.println("Contenidos creados:");
        System.out.println("  " + c1);
        System.out.println("  " + c2);
        System.out.println("  " + p1);
        System.out.println();

        // ?? 2. USUARIO GRATIS: límite diario y publicidad ???????????????????
        System.out.println("--- USUARIO GRATIS ---");
        UsuarioGratis gratis = new UsuarioGratis("Ana Lopez", "ana@gmail.com");

        // Intentamos reproducir 6 veces (el límite es 5)
        Reproducible[] contenidos = {c1, c2, p1, c3, p2, c1};

        for (Reproducible contenido : contenidos) {
            try {
                gratis.play(contenido);
                System.out.println(); // línea en blanco entre reproducciones
            } catch (LimiteDiarioException e) {
                // Capturamos la excepción y mostramos mensaje informativo
                System.out.println("[AVISO] " + e.getMessage());
                System.out.println();
            }
        }

        // Mostramos el estado del usuario tras las reproducciones
        System.out.println(gratis); // llama a toString() -> nombre + reproducciones
        System.out.println();

        // ?? 3. USUARIO DE PAGO: reproducción sin restricciones ??????????????
        System.out.println("--- USUARIO DE PAGO ---");
        UsuarioPago pago;
        try {
            pago = new UsuarioPago("Carlos Ruiz", "carlos@empresa.es",
                    "0049", "2265", "91", "2300369715");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear usuario de pago: " + e.getMessage());
            return;
        }

        try {
            pago.play(c1);
            pago.play(p1);
        } catch (LimiteDiarioException e) {
            // El usuario de pago nunca lanza esta excepción, pero el compilador obliga
            System.out.println(e.getMessage());
        }

        System.out.println(pago);
        System.out.println();

        // ?? 4. PRUEBA DE VALIDACIONES ????????????????????????????????????????
        System.out.println("--- PRUEBA DE VALIDACIONES ---");

        // Email inválido
        try {
            UsuarioGratis invalido = new UsuarioGratis("Pepe", "emailSinArroba.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Email rechazado correctamente: " + e.getMessage());
        }

        // Cuenta inválida (dc tiene 3 dígitos en vez de 2)
        try {
            UsuarioPago cuentaMala = new UsuarioPago("Maria", "maria@test.com",
                    "0049", "2265", "912", "2300369715");
        } catch (IllegalArgumentException e) {
            System.out.println("Cuenta rechazada correctamente: " + e.getMessage());
        }
        System.out.println();

        // ?? 5. LISTAS DE REPRODUCCIÓN ????????????????????????????????????????
        System.out.println("--- LISTAS DE REPRODUCCION ---");

        // Creamos listas para el usuario de pago
        pago.crearLista("Favoritas");
        pago.crearLista("Para el gym");

        // Añadimos contenidos a las listas
        pago.anyadirALista("Favoritas", c1);
        pago.anyadirALista("Favoritas", p1);
        pago.anyadirALista("Para el gym", c2);
        pago.anyadirALista("Para el gym", c3);

        // Intentamos añadir a una lista que no existe
        pago.anyadirALista("No existe", c1);
        System.out.println();

        // Vemos las listas ordenadas por duración
        pago.verListasReproduccion();
        System.out.println();

        // ?? 6. REPRODUCIR UNA LISTA COMPLETA ????????????????????????????????
        System.out.println("--- REPRODUCCION DE LISTA COMPLETA (usuario pago) ---");

        // Creamos una lista para demostrar la reproducción completa
        pago.crearLista("Mini lista");
        pago.anyadirALista("Mini lista", c1);
        pago.anyadirALista("Mini lista", p2);

        // Buscamos la lista manualmente para pasarla a play()
        // (en una aplicación real habría un método getLista(nombre))
        ListaReproduccion miniLista = new ListaReproduccion("Mini lista");
        miniLista.anyadir(c1);
        miniLista.anyadir(p2);

        try {
            pago.play(miniLista);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Lista vacía
        System.out.println("--- LISTA VACIA ---");
        ListaReproduccion listaVacia = new ListaReproduccion("Vacia");
        try {
            pago.play(listaVacia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // ?? 7. ESTADO FINAL DE LOS USUARIOS ?????????????????????????????????
        System.out.println("--- ESTADO FINAL ---");
        System.out.println(gratis); // toString() de UsuarioGratis
        System.out.println(pago);   // toString() de UsuarioPago
    }
}
