/*
 * Programa que, a partir de una cantidad dada, la desglosa en billetes y
 * monedas.
 */
package practica2_7;

/**
 *
 * @author 
 */
public class Practica2_7 {

    public static void main(String[] args) {
        double efectivo = 2000;
        double compra = 1227.26;
        
        // Calculamos e imprimimos las vueltas
        double vueltas = efectivo - compra;
        System.out.println("Vueltas: " + vueltas);
        
        // Desglosamos las vueltas en euros y en céntimos e imprimimos
        // los céntimos
        int vueltasEnCentimos = (int)(efectivo*100 - compra*100);
        int euros = vueltasEnCentimos / 100;
        int centimos = vueltasEnCentimos % 100;
        
//        int euros = (int) vueltas;
//        int centimos = (int)((vueltas - euros) * 100);
        System.out.println("Céntimos: " + centimos);
        
        // Calculo y muestro los billetes y monedas de euro
        
        System.out.println((euros / 500) + " de 500 Euros"); // Billetes de 500
        euros = euros % 500;
        
        System.out.println((euros / 200) + " de 200 Euros"); // Billetes de 200
        euros = euros % 200;
        
        System.out.println((euros / 100) + " de 100 Euros"); // Billetes de 100
        euros = euros % 100;
        
        System.out.println((euros / 50) + " de 50 Euros"); // Billetes de 50
        euros = euros % 50;
        
        System.out.println((euros / 20) + " de 20 Euros"); // Billetes de 20
        euros = euros % 20;

        System.out.println((euros / 10) + " de 10 Euros"); // Billetes de 20
        euros = euros % 10;

        System.out.println((euros / 5) + " de 5 Euros"); // Billetes de 5
        euros = euros % 5;

        System.out.println((euros / 2) + " de 2 Euros"); // Monedas de 2
        euros = euros % 2;

        System.out.println(euros + " de 1 Euro"); // Monedas de 1
        

        // Calculo y muestro las monedas de céntimos de euro
        
        System.out.println((centimos / 50) + " de 50 céntimos"); // Mon. de 50c
        centimos = centimos % 50;
        
        System.out.println((centimos / 20) + " de 20 céntimos"); // Mon. de 20c
        centimos = centimos % 20;

        System.out.println((centimos / 10) + " de 10 céntimos"); // Mon. de 10c
        centimos = centimos % 10;

        System.out.println((centimos / 5) + " de 5 céntimos"); // Mon. de 5 cent
        centimos = centimos % 5;
        
        System.out.println((centimos / 2) + " de 2 céntimos"); // Mon. de 2 cent
        centimos = centimos % 2;

        System.out.println(centimos + " de 1 céntimo"); // Mon. de 1 cent
       
    }
    
}
