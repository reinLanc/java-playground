/*
 * Programa que transforma grados Fahrenheit a Celsius y viceversa
 */
package practica2_10;

/**
 *
 * @author 
 */
public class Practica2_10 {

    public static void main(String[] args) {
        // Conversión de fahrenheit a celsius
        double fahrenheit = 86; // Grados Fahrenheit a convertir
        double celsius = (fahrenheit - 32) / 9 * 5; 
        
        System.out.println(fahrenheit + "ºF son " + celsius + "ºC");
        
        // Conversión de celsius a fahrenheit
        celsius = 33; // Grados Celsius a convertir
        fahrenheit= (celsius * 9) / 5 + 32;
        
        System.out.println(celsius + "ºC son " + fahrenheit + "ºF");
    }
    
}
