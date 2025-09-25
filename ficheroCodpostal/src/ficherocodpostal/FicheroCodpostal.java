package ficherocodpostal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FicheroCodpostal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String csvFilePath = "/ruta/al/archivo.csv";

        // Crear un objeto FileReader para leer el archivo
        FileReader fileReader = new FileReader(csvFilePath);

        // Crear un objeto BufferedReader para procesar el archivo línea por línea
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Leer la primera línea del archivo CSV (encabezados)
        String headerLine = bufferedReader.readLine();

        // Recorrer los registros y filtrar los que empiezan por "6"
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] fields = line.split(",");
            String codigoPostal = fields[3].trim();
            if (codigoPostal.startsWith("6")) {
                System.out.println(fields[0] + ", " + fields[1] + ", " + fields[2] + ", " + codigoPostal);
            }
        }

        // Cerrar el archivo y el lector
        bufferedReader.close();
        fileReader.close();
    }

}
