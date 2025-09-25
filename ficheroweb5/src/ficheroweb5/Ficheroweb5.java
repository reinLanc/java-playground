package ficheroweb5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ficheroweb5 {

    public static void main(String[] args) {
        int mes;
        String dia;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Escribe número de mes");
            mes = Integer.parseInt(teclado.readLine());
            System.out.println("Escribe día del mes");
            dia = teclado.readLine().toUpperCase(); // Me aseguro de pasar el String en mayúsculas
            teclado.close();
            crearMes(mes, dia);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static String nombre;
    static String mesCompleto = ""; // Si no incializo o pongo null no puedo concatenar
    static FileWriter fill = null;

    static String concatenaDias(int mes, String dia) {

        int i;
        int j = 0;
        String[] semana = {"L", "M", "X", "J", "V", "S", "D"}; // Array para control de día
        String resultado = "";

        // Saber posicion del array del comienzo
        switch (dia) {
            case "L":
                j = 0;
                break;
            case "M":
                j = 1;
                break;
            case "X":
                j = 2;
                break;
            case "J":
                j = 3;
                break;
            case "V":
                j = 4;
                break;
            case "S":
                j = 5;
                break;
            case "D":
                j = 6;
                break;
        }

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                for (i = 1; i < 32; i++) {
                    resultado = resultado + String.valueOf(i) + semana[j];
                    if (j == 6) {
                        j = 0;
                    } else {
                        j++;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                for (i = 1; i < 31; i++) {
                    resultado = resultado + String.valueOf(i) + semana[j];
                    if (j == 6) {
                        j = 0;
                    } else {
                        j++;
                    }
                }
                break;
            case 2:
                for (i = 1; i < 29; i++) {
                    resultado = resultado + String.valueOf(i) + semana[j];
                    if (j == 6) {
                        j = 0;
                    } else {
                        j++;
                    }
                }
                break;
        }
        System.out.println(resultado);
        return resultado;
    }

    static void crearMes(int mes, String dia) {

        nombre = "mes" + mes + ".txt"; // Concateno para crear el nombre del fichero
        try {
            fill = new FileWriter(nombre); // Creo nuevo fichero
            fill.write(concatenaDias(mes, dia)); // Hago la llamada a la funcion que crea el String
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fill.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
