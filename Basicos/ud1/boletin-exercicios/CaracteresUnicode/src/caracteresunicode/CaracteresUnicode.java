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
          // Declaraci�n de caracteres
        char letraA = 'A';
        char letraZ = 'Z';
        char letraMinusculaA = 'a';
        char letraMinusculaZ = 'z';
        char digito0 = '0';
        char digito9 = '9';
        
        // Conversi�n de caracteres a c�digos Unicode (casting a int)
        int codigoA = (int) letraA;
        int codigoZ = (int) letraZ;
        int codigoMinusculaA = (int) letraMinusculaA;
        int codigoMinusculaZ = (int) letraMinusculaZ;
        int codigo0 = (int) digito0;
        int codigo9 = (int) digito9;
        
        // C�lculo de diferencias
        int diferenciaMayusculaMinuscula = codigoMinusculaA - codigoA;
        int letrasDiferencia = codigoZ - codigoA;
        int digitosDiferencia = codigo9 - codigo0;
        
        // Conversi�n de c�digo Unicode a car�cter
        char caracterDesde65 = (char) 65;
        
        // Operaciones con c�digos
        char letraASumar5 = (char) (codigoA + 5);
        
        // Caracteres especiales
        char nuevaLinea = '\n';
        char tabulador = '\t';
        int codigoNuevaLinea = (int) nuevaLinea;
        int codigoTabulador = (int) tabulador;
        
        // Mostrar resultados
        System.out.println("=== MANIPULACI�N DE CARACTERES Y UNICODE ===");
        System.out.println();
        
        System.out.println("C�digos Unicode de caracteres:");
        System.out.println("'" + letraA + "' ? " + codigoA);
        System.out.println("'" + letraZ + "' ? " + codigoZ);
        System.out.println("'" + letraMinusculaA + "' ? " + codigoMinusculaA);
        System.out.println("'" + letraMinusculaZ + "' ? " + codigoMinusculaZ);
        System.out.println("'" + digito0 + "' ? " + codigo0);
        System.out.println("'" + digito9 + "' ? " + codigo9);
        System.out.println();
        
        System.out.println("An�lisis de diferencias:");
        System.out.println("Diferencia entre 'A' y 'a': " + diferenciaMayusculaMinuscula);
        System.out.println("(Para convertir may�scula a min�scula: sumar " + diferenciaMayusculaMinuscula + ")");
        System.out.println();
        
        System.out.println("Letras entre 'Z' y 'A': " + letrasDiferencia);
        System.out.println("(Hay " + (letrasDiferencia + 1) + " letras en total de A a Z)");
        System.out.println();
        
        System.out.println("D�gitos entre '9' y '0': " + digitosDiferencia);
        System.out.println("(Hay " + (digitosDiferencia + 1) + " d�gitos en total)");
        System.out.println();
        
        System.out.println("Conversiones desde c�digo Unicode:");
        System.out.println("C�digo 65 ? '" + caracterDesde65 + "'");
        System.out.println();
        
        System.out.println("Operaciones con c�digos:");
        System.out.println("'A' + 5 = '" + letraASumar5 + "' (c�digo " + (codigoA + 5) + ")");
        System.out.println();
        
        System.out.println("Caracteres especiales:");
        System.out.println("Nueva l�nea (\\n): c�digo " + codigoNuevaLinea);
        System.out.println("Tabulador (\\t): c�digo " + codigoTabulador);
        System.out.println();
        
        // Demostraci�n pr�ctica
        System.out.println("Demostraci�n pr�ctica:");
        char miLetra = 'B';
        char miLetraMinuscula = (char) ((int) miLetra + diferenciaMayusculaMinuscula);
        System.out.println("Convertir '" + miLetra + "' a min�scula: '" + miLetraMinuscula + "'");
    }
    
}
