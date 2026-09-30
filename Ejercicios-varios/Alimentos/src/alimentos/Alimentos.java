/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Reinaldo Gil
 */
public class Alimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Denominación de un alimento: ");
        String nombre = teclado.readLine();
        System.out.print("Contenido en proteínas: ");
        double pro = Double.parseDouble(teclado.readLine());
        System.out.print("Contenido en lípidos: ");
        double lip = Double.parseDouble(teclado.readLine());
        System.out.print("Contenido en hidratos: ");
        double hid = Double.parseDouble(teclado.readLine());
        System.out.print("Contenido en minerales (A,M,B): ");
        char min = teclado.readLine().toUpperCase().charAt(0);
        System.out.print("Contenido en vitaminas (A,M,B): ");
        char vita = teclado.readLine().toUpperCase().charAt(0);
        System.out.print("Es de origen animal? (S/N): ");
        char esOrA = teclado.readLine().toUpperCase().charAt(0);
        Alimento ali = new Alimento(nombre, lip, esOrA == 'S',
                hid, pro, vita, min);
        System.out.println("\n" + ali.muestraAlimento());
        System.out.println("Contenido energético: "
                + ali.calculaContenidoEnergetico() + " Kcal./100gr.");
    }
}
