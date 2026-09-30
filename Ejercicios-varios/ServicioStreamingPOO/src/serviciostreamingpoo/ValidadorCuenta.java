/**
 * Clase ValidadorCuenta
 * ======================
 * Biblioteca de utilidades para validar el número de cuenta bancaria
 * de los usuarios de pago (punto 3a del enunciado).
 *
 * El número de cuenta tiene cuatro partes (todas String):
 *   - entidad : exactamente 4 dígitos numéricos
 *   - oficina : exactamente 4 dígitos numéricos
 *   - dc      : exactamente 2 dígitos numéricos (dígitos de control)
 *   - cuenta  : exactamente 10 dígitos numéricos
 *
 * Esta clase solo contiene métodos estáticos (no necesita instanciarse).
 */
package serviciostreamingpoo;

/**
 *
 * @author Reinaldo Gil
 */
public class ValidadorCuenta {

    /**
     * Valida el número de cuenta completo. Comprueba que cada parte tenga la
     * longitud correcta y solo dígitos.
     *
     * @param entidad campo entidad (debe tener 4 dígitos)
     * @param oficina campo oficina (debe tener 4 dígitos)
     * @param dc dígitos de control (debe tener 2 dígitos)
     * @param cuenta número de cuenta (debe tener 10 dígitos)
     * @return true si todas las partes son válidas, false en caso contrario
     */
    public static boolean validar(String entidad, String oficina, String dc, String cuenta) {
        return esSoloDígitos(entidad, 4)
                && esSoloDígitos(oficina, 4)
                && esSoloDígitos(dc, 2)
                && esSoloDígitos(cuenta, 10);
    }

    /**
     * Comprueba que una cadena tenga exactamente la longitud indicada y que
     * todos sus caracteres sean dígitos numéricos (0-9).
     *
     * Usamos Character.isDigit() en lugar de regex para mayor claridad.
     *
     * @param campo la cadena a comprobar
     * @param longitud la longitud exacta que debe tener
     * @return true si la cadena es válida
     */
    public static boolean esSoloDígitos(String campo, int longitud) {
        // Primero comprobamos que no sea nula y que tenga la longitud exacta
        if (campo == null || campo.length() != longitud) {
            return false;
        }

        // Luego comprobamos que cada carácter sea un dígito
        for (int i = 0; i < campo.length(); i++) {
            if (!Character.isDigit(campo.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * Devuelve el número de cuenta formateado como se muestra habitualmente:
     * ENTIDAD-OFICINA-DC-NUMEROCUENTA Ejemplo: 0049-2265-91-2300369715
     *
     * @param entidad campo entidad
     * @param oficina campo oficina
     * @param dc dígitos de control
     * @param cuenta número de cuenta
     * @return cadena formateada
     */
    public static String formatear(String entidad, String oficina, String dc, String cuenta) {
        return entidad + "-" + oficina + "-" + dc + "-" + cuenta;
    }
}
