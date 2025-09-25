/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud3_6_5;

import java.util.Scanner;

public class Ud3_6_5 {

static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
               System.out.println("Introduzca el número del mes");
        System.out.println("1.Enero\n2.Febrero\n3.Marzo\n4.Abril\n5.Mayo\n6.Junio");
        System.out.println("7.Julio\n8.Agosto\n9.Septiembre\n10.Octubre\n11.Noviembre\n12.Diciembre");
        int mes = teclado.nextInt();
        System.out.println("Número de dias");
        int dias2 = teclado.nextInt();


        System.out.println("Introducir el año");
        int ano = teclado.nextInt();
                if(ano < 0) {
            System.out.println("Fecha Invalida. Año negativo");
        } else if (mes < 1 || mes > 12) {
            System.out.println("Fecha invalida. mes fuera de rango");
        } else if (dias2 < 1 || dias2 > 31) {
            System.out.println("Dia fuera de rango");
        } else {
            System.out.println("Fecha correcta"); 
        }
        System.out.println("Dia: " + fecha(mes,ano,dias2) + " Mes: " + mes + ano);
    }
        static int fecha(int mes, int ano, int dias) {
        dias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
        } 
        return dias;
    }
}
