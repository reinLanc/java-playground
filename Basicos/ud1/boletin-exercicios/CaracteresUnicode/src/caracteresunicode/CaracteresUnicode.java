/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caracteresunicode;

/**
 *
 * @author Reinaldo Gil
 */
public class CaracteresUnicode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Declaración de caracteres
        char letraA = 'A';
        char letraZ = 'Z';
        char letraMinusculaA = 'a';
        char letraMinusculaZ = 'z';
        char digito0 = '0';
        char digito9 = '9';
        
        // Conversión de caracteres a códigos Unicode (casting a int)
        int codigoA = (int) letraA;
        int codigoZ = (int) letraZ;
        int codigoMinusculaA = (int) letraMinusculaA;
        int codigoMinusculaZ = (int) letraMinusculaZ;
        int codigo0 = (int) digito0;
        int codigo9 = (int) digito9;
        
        // Cálculo de diferencias
        int diferenciaMayusculaMinuscula = codigoMinusculaA - codigoA;
        int letrasDiferencia = codigoZ - codigoA;
        int digitosDiferencia = codigo9 - codigo0;
        
        // Conversión de código Unicode a carácter
        char caracterDesde65 = (char) 65;
        
        // Operaciones con códigos
        char letraASumar5 = (char) (codigoA + 5);
        
        // Caracteres especiales
        char nuevaLinea = '\n';
        char tabulador = '\t';
        int codigoNuevaLinea = (int) nuevaLinea;
        int codigoTabulador = (int) tabulador;
        
        // Mostrar resultados
        System.out.println("=== MANIPULACIÓN DE CARACTERES Y UNICODE ===");
        System.out.println();
        
        System.out.println("Códigos Unicode de caracteres:");
        System.out.println("'" + letraA + "' ? " + codigoA);
        System.out.println("'" + letraZ + "' ? " + codigoZ);
        System.out.println("'" + letraMinusculaA + "' ? " + codigoMinusculaA);
        System.out.println("'" + letraMinusculaZ + "' ? " + codigoMinusculaZ);
        System.out.println("'" + digito0 + "' ? " + codigo0);
        System.out.println("'" + digito9 + "' ? " + codigo9);
        System.out.println();
        
        System.out.println("Análisis de diferencias:");
        System.out.println("Diferencia entre 'A' y 'a': " + diferenciaMayusculaMinuscula);
        System.out.println("(Para convertir mayúscula a minúscula: sumar " + diferenciaMayusculaMinuscula + ")");
        System.out.println();
        
        System.out.println("Letras entre 'Z' y 'A': " + letrasDiferencia);
        System.out.println("(Hay " + (letrasDiferencia + 1) + " letras en total de A a Z)");
        System.out.println();
        
        System.out.println("Dígitos entre '9' y '0': " + digitosDiferencia);
        System.out.println("(Hay " + (digitosDiferencia + 1) + " dígitos en total)");
        System.out.println();
        
        System.out.println("Conversiones desde código Unicode:");
        System.out.println("Código 65 ? '" + caracterDesde65 + "'");
        System.out.println();
        
        System.out.println("Operaciones con códigos:");
        System.out.println("'A' + 5 = '" + letraASumar5 + "' (código " + (codigoA + 5) + ")");
        System.out.println();
        
        System.out.println("Caracteres especiales:");
        System.out.println("Nueva línea (\\n): código " + codigoNuevaLinea);
        System.out.println("Tabulador (\\t): código " + codigoTabulador);
        System.out.println();
        
        // Demostración práctica
        System.out.println("Demostración práctica:");
        char miLetra = 'B';
        char miLetraMinuscula = (char) ((int) miLetra + diferenciaMayusculaMinuscula);
        System.out.println("Convertir '" + miLetra + "' a minúscula: '" + miLetraMinuscula + "'");
    }
    
}
