package ficheronsincodpostal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheronSinCodPostal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String csvFilePath = "/ruta/al/archivo.csv";
        String csvOutputFilePath = "/ruta/de/salida/Restaurants2.csv";

        // Crear un objeto FileReader para leer el archivo original
        FileReader fileReader = new FileReader(csvFilePath);

        // Crear un objeto BufferedReader para procesar el archivo línea por línea
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Crear un objeto FileWriter para escribir en el archivo de salida
        FileWriter fileWriter = new FileWriter(csvOutputFilePath);

        // Leer la primera línea del archivo CSV (encabezados) y escribir en el archivo de salida
        String headerLine = bufferedReader.readLine();
        fileWriter.write(headerLine + "\n");

        // Recorrer los registros y escribir en el archivo de salida aquellos que no cumplan la condición
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] fields = line.split(",");
            String codigoPostal = fields[3].trim();
            if (!codigoPostal.startsWith("6")) {
                fileWriter.write(line + "\n");
            }
        }

        // Cerrar los archivos y los lectores/escritores
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }

}
