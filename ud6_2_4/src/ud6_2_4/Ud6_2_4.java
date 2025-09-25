package ud6_2_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ud6_2_4 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo: ");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String nombreArchivo = b.readLine();

        try {
            File archivo = new File(nombreArchivo);
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter br = new BufferedWriter(fw);

            String codigo = " ";
            while (!codigo.equals("")) {
                System.out.println("Introduce el código del libro (intro para salir): ");
                codigo = b.readLine();
                if (!codigo.equals("")) {
                    if (buscarCodigo(archivo, codigo)) {
                        System.out.println("El código ya existe. Introduce otro código.");
                    } else {
                        System.out.println("Introduce el ISBN del libro: ");
                        String isbn = sc.nextLine();
                        System.out.println("Introduce el título del libro: ");
                        String titulo = sc.nextLine();
                        System.out.println("Introduce el autor del libro: ");
                        String autor = sc.nextLine();
                        System.out.println("Introduce la editorial del libro: ");
                        String editorial = sc.nextLine();
                        System.out.println("Introduce el año de edición del libro: ");
                        String anioEdicion = sc.nextLine();

                        String linea = codigo + ";" + isbn + ";" + titulo + ";" + autor + ";" + editorial + ";" + anioEdicion;
                        br.write(linea);
                        br.newLine();
                        System.out.println("Libro añadido correctamente.");
                    }
                }
            }
            br.flush();
            br.close();
            fw.flush();
            fw.close();
            
        } catch (IOException e) {
            System.out.println("Error al crear el archivo.");
            e.printStackTrace();
        }

    }

    public static boolean buscarCodigo(File archivo, String codigo) throws IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        boolean encontrado = false;
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] campos = linea.split(";");
            if (campos[0].equals(codigo)) {
                encontrado = true;
                break;
            }
        }

        br.close();
        fr.close();
        return encontrado;
    }

}
