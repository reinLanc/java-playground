/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion_ficheros;

/**
 *
 * @author gilguerei
 */
public class Ampliacion_ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Escribir un programa en Java que lea un archivo de texto llamado "entrada.txt" y que imprima en consola la cantidad de palabras que contiene el archivo.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ContadorDePalabras {


    public static void main(String[] args) {


        File archivo = new File("entrada.txt");
        int cantidadPalabras = 0;


        try {
            Scanner scanner = new Scanner(archivo);


            while (scanner.hasNext()) {
                scanner.next();
                cantidadPalabras++;
            }


            scanner.close();
            System.out.println("El archivo tiene " + cantidadPalabras + " palabras.");


        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo.");
            e.printStackTrace();
        }
    }
}




2. Crear una aplicación en Java que lea un archivo de texto llamado "datos.txt" que contiene una lista de números enteros separados por comas. La aplicación deberá leer el archivo y calcular la media aritmética de los números. Luego, deberá crear un nuevo archivo llamado "resultado.txt" y escribir en él la media calculada.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CalculadoraMedia {


    public static void main(String[] args) {


        File archivoEntrada = new File("datos.txt");
        File archivoSalida = new File("resultado.txt");
        int cantidadNumeros = 0;
        int sumaNumeros = 0;


        try {
            Scanner scanner = new Scanner(archivoEntrada);


            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                String[] numeros = linea.split(",");
                for (String numero : numeros) {
                    sumaNumeros += Integer.parseInt(numero.trim());
                    cantidadNumeros++;
                }
            }


            scanner.close();


            double media = (double) sumaNumeros / cantidadNumeros;


            PrintWriter escritor = new PrintWriter(archivoSalida);
            escritor.printf("La media es %.2f", media);
            escritor.close();


            System.out.println("La media se ha calculado y se ha guardado en el archivo resultado.txt");


        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo de entrada.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("El archivo de entrada no contiene números enteros separados por comas.");
            e.printStackTrace();
        }
    }
}




3. Crear un programa en Java que lea un archivo de texto llamado "datos.txt" que contiene una lista de números enteros separados por comas. El programa deberá encontrar el número más grande de la lista y escribirlo en un archivo llamado "maximo.txt".
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class BuscadorMaximo {


    public static void main(String[] args) {


        File archivoEntrada = new File("datos.txt");
        File archivoSalida = new File("maximo.txt");
        int maximo = Integer.MIN_VALUE;


        try {
            Scanner scanner = new Scanner(archivoEntrada);


            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                String[] numeros = linea.split(",");
                for (String numero : numeros) {
                    int numeroEntero = Integer.parseInt(numero.trim());
                    if (numeroEntero > maximo) {
                        maximo = numeroEntero;
                    }
                }
            }


            scanner.close();


            PrintWriter escritor = new PrintWriter(archivoSalida);
            escritor.println(maximo);
            escritor.close();


            System.out.println("El número más grande se ha encontrado y se ha guardado en el archivo maximo.txt");


        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo de entrada.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("El archivo de entrada no contiene números enteros separados por comas.");
            e.printStackTrace();
        }
    }
}




4. Escribir un programa en Java que lea un archivo de texto llamado "entrada.txt" y que reemplace todas las ocurrencias de una palabra por otra. Por ejemplo, si el archivo contiene la palabra "hola" y se desea reemplazar por "adiós", el programa deberá leer el archivo y escribir uno nuevo llamado "salida.txt" con la palabra "adiós" en lugar de "hola".
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReemplazadorDePalabras {


    public static void main(String[] args) {


        File archivoEntrada = new File("entrada.txt");
        File archivoSalida = new File("salida.txt");


        try {
            Scanner scanner = new Scanner(archivoEntrada);
            PrintWriter escritor = new PrintWriter(archivoSalida);


            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                linea = linea.replaceAll("hola", "adiós");
                escritor.println(linea);
            }


            scanner.close();
            escritor.close();


            System.out.println("El archivo entrada.txt se ha leído y se ha creado el archivo salida.txt con las palabras reemplazadas.");


        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo de entrada.");
            e.printStackTrace();
        }
    }
}




¡Por supuesto! A continuación, te presento 4 ejercicios de Java para un examen sobre manejo de ficheros de datos, utilizando como ejemplo un archivo "numeros.dat":


1. Escribir un programa en Java que lea un archivo binario llamado "numeros.dat" que contiene una serie de números enteros y luego calcule la suma de todos ellos. El programa debe imprimir la suma total en la consola.
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class SumadorDeNumerosBinarios {


    public static void main(String[] args) {


        String archivoBinario = "numeros.dat";
        int suma = 0;


        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(archivoBinario))) {


            while (inputStream.available() > 0) {
                int numero = inputStream.readInt();
                suma += numero;
            }


            System.out.println("La suma de los números en el archivo " + archivoBinario + " es: " + suma);


        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivoBinario);
            e.printStackTrace();
        }
    }
}




2. Escribir un programa en Java que lea un archivo binario llamado "numeros.dat" que contiene una serie de números enteros y determine cuántos de ellos son pares. El programa debe imprimir el número total de números pares en la consola.
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class ContadorDePares {


    public static void main(String[] args) {


        String archivoBinario = "numeros.dat";
        int contadorPares = 0;


        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(archivoBinario))) {


            while (inputStream.available() > 0) {
                int numero = inputStream.readInt();
                if (numero % 2 == 0) {
                    contadorPares++;
                }
            }


            System.out.println("El archivo " + archivoBinario + " contiene " + contadorPares + " números pares");


        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivoBinario);
            e.printStackTrace();
        }
    }
}




3. Escribir un programa en Java que lea un archivo binario llamado "numeros.dat" que contiene una serie de números enteros y calcule el número máximo y mínimo en el archivo. El programa debe imprimir ambos números en la consola.
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class MaximoMinimo {


    public static void main(String[] args) {


        String archivoBinario = "numeros.dat";
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;


        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(archivoBinario))) {


            while (inputStream.available() > 0) {
                int numero = inputStream.readInt();
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }


            System.out.println("El número máximo en el archivo " + archivoBinario + " es " + maximo);
            System.out.println("El número mínimo en el archivo " + archivoBinario + " es " + minimo);


        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivoBinario);
            e.printStackTrace();
        }
    }
}




4. Escribir un programa en Java que lea un archivo binario llamado "numeros.dat" que contiene una serie de números enteros y determine si alguno de ellos es igual a cero. Si se encuentra al menos uno, el programa debe imprimir un mensaje indicando que se encontró al menos un número igual a cero. Si no se encuentra ninguno, el programa debe imprimir un mensaje indicando que no se encontró ningún número igual a cero en el archivo.
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class BusquedaCero {


    public static void main(String[] args) {


        String archivoBinario = "numeros.dat";
        boolean encontrado = false;


        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(archivoBinario))) {


            while (inputStream.available() > 0) {
                int numero = inputStream.readInt();
                if (numero == 0) {
                    encontrado = true;
                    break;
                }
            }


            if (encontrado) {
                System.out.println("Se encontró al menos un número igual a cero en el archivo " + archivoBinario);
            } else {
                System.out.println("No se encontró ningún número igual a cero en el archivo " + archivoBinario);
            }


        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivoBinario);
            e.printStackTrace();
        }
    }
}




¡Claro! A continuación te presento 4 ejercicios de Java para un examen sobre serialización:


1. Escribir un programa en Java que cree un objeto de una clase llamada "Persona" y lo serialice en un archivo llamado "persona.ser". El programa debe permitir al usuario ingresar los detalles de la persona, como nombre, edad, número de identificación, entre otros. El programa debe luego deserializar el objeto y mostrar los detalles de la persona en la consola.
import java.io.*;


public class Persona implements Serializable {
    private String nombre;
    private int edad;
    private int id;


    public Persona(String nombre, int edad, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public int getId() {
        return id;
    }


    public static void main(String[] args) {
        // Pedir al usuario que ingrese los detalles de la persona
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = br.readLine();


            System.out.print("Ingrese la edad de la persona: ");
            int edad = Integer.parseInt(br.readLine());


            System.out.print("Ingrese el número de identificación de la persona: ");
            int id = Integer.parseInt(br.readLine());


            // Crear un objeto Persona con los detalles ingresados
            Persona persona = new Persona(nombre, edad, id);


            // Serializar el objeto en un archivo llamado "persona.ser"
            FileOutputStream fileOut = new FileOutputStream("persona.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(persona);
            out.close();
            fileOut.close();


            // Deserializar el objeto del archivo "persona.ser" y mostrar los detalles de la persona en la consola
            FileInputStream fileIn = new FileInputStream("persona.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Persona personaDeserializada = (Persona) in.readObject();
            in.close();
            fileIn.close();


            System.out.println("\nDetalles de la persona:");
            System.out.println("Nombre: " + personaDeserializada.getNombre());
            System.out.println("Edad: " + personaDeserializada.getEdad());
            System.out.println("ID: " + personaDeserializada.getId());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}




2. Escribir un programa en Java que serialice un objeto de una clase llamada "Empleado" y lo guarde en un archivo binario llamado "empleado.ser". La clase debe tener atributos como nombre, número de identificación, salario, entre otros. El programa debe permitir al usuario actualizar el salario de un empleado existente en el archivo y luego deserializar el objeto actualizado y mostrar los detalles del empleado en la consola.
import java.io.*;


public class Main {
    public static void main(String[] args) {
        // Serializar un objeto Empleado y guardarlo en un archivo binario
        Empleado empleado = new Empleado("Juan", "12345", 2500);
        serializar(empleado, "empleado.ser");


        // Actualizar el salario de un empleado existente en el archivo
        String idEmpleado = "12345";
        double nuevoSalario = 3000;
        actualizarSalario(idEmpleado, nuevoSalario, "empleado.ser");


        // Deserializar el objeto actualizado y mostrar los detalles del empleado en la consola
        Empleado empleadoActualizado = deserializar("empleado.ser");
        System.out.println(empleadoActualizado);
    }


    // Método para serializar un objeto y guardarlo en un archivo binario
    public static void serializar(Empleado empleado, String nombreArchivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(empleado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Método para deserializar un objeto desde un archivo binario
    public static Empleado deserializar(String nombreArchivo) {
        Empleado empleado = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            empleado = (Empleado) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return empleado;
    }


    // Método para actualizar el salario de un empleado existente en un archivo binario
    public static void actualizarSalario(String idEmpleado, double nuevoSalario, String nombreArchivo) {
        try (RandomAccessFile file = new RandomAccessFile(nombreArchivo, "rw")) {
            boolean encontrado = false;
            while (!encontrado && file.getFilePointer() < file.length()) {
                long posActual = file.getFilePointer();
                Empleado empleado = deserializar(nombreArchivo);
                if (empleado.getId().equals(idEmpleado)) {
                    encontrado = true;
                    empleado.setSalario(nuevoSalario);
                    file.seek(posActual);
                    serializar(empleado, nombreArchivo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Clase Empleado que implementa Serializable
class Empleado implements Serializable {
    private String nombre;
    private String id;
    private double salario;


    public Empleado(String nombre, String id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }


    public String getNombre() {
        return nombre;
    }


    public String getId() {
        return id;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", salario=" + salario +
                '}';
    }
}




3. Escribir un programa en Java que serialice un objeto de una clase llamada "Producto" y lo guarde en un archivo binario llamado "producto.ser". La clase debe tener atributos como nombre, precio, cantidad en stock, entre otros. El programa debe permitir al usuario agregar un nuevo producto al archivo y luego deserializar el objeto y mostrar los detalles del producto en la consola.
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();


        // Leemos el archivo de productos existente (si existe)
        try {
            FileInputStream fis = new FileInputStream("producto.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaProductos = (ArrayList<Producto>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            // Si el archivo no existe o no se puede leer, simplemente
            // creamos una lista vacía
            listaProductos = new ArrayList<>();
        }


        // Pedimos al usuario los datos del nuevo producto
        System.out.print("Ingrese el nombre del nuevo producto: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el precio del nuevo producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad en stock del nuevo producto: ");
        int stock = sc.nextInt();


        // Creamos el nuevo objeto Producto
        Producto nuevoProducto = new Producto(nombre, precio, stock);


        // Agregamos el nuevo producto a la lista existente
        listaProductos.add(nuevoProducto);


        // Serializamos la lista de productos actualizada en el archivo
        try {
            FileOutputStream fos = new FileOutputStream("producto.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaProductos);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Imprimimos en consola la lista de productos actualizada
        System.out.println("Lista de productos actualizada:");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }
}


// Clase Producto
class Producto implements Serializable {
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}




4. Escribir un programa en Java que lea un archivo binario que contiene una serie de objetos de una clase llamada "Cliente". La clase debe tener atributos como nombre, número de identificación, dirección, entre otros. El programa debe permitir al usuario buscar un cliente por su número de identificación y mostrar sus detalles si se encuentra en el archivo. Si no se encuentra el cliente, el programa debe imprimir un mensaje indicando que el cliente no existe en el archivo. El programa también debe permitir la serialización de un nuevo objeto "Cliente" y su guardado en el archivo binario.
clase:
import java.io.Serializable;


public class Cliente implements Serializable {
    private String nombre;
    private int identificacion;
    private String direccion;


    public Cliente(String nombre, int identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }


    public int getIdentificacion() {
        return identificacion;
    }


    public String getDireccion() {
        return direccion;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion=" + identificacion +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}


main:
import java.io.*;


public class Main {
    private static final String FILENAME = "clientes.dat";


    public static void main(String[] args) {
        File file = new File(FILENAME);


        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            Cliente cliente;
            int opcion;


            do {
                System.out.println("1. Buscar cliente");
                System.out.println("2. Agregar cliente");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = Integer.parseInt(System.console().readLine());


                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el número de identificación del cliente: ");
                        int identificacion = Integer.parseInt(System.console().readLine());


                        while ((cliente = (Cliente) input.readObject()) != null) {
                            if (cliente.getIdentificacion() == identificacion) {
                                System.out.println(cliente);
                                break;
                            }
                        }


                        break;
                    case 2:
                        System.out.print("Ingrese el nombre del cliente: ");
                        String nombre = System.console().readLine();


                        System.out.print("Ingrese el número de identificación del cliente: ");
                        identificacion = Integer.parseInt(System.console().readLine());


                        System.out.print("Ingrese la dirección del cliente: ");
                        String direccion = System.console().readLine();


                        cliente = new Cliente(nombre, identificacion, direccion);


                        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file, true))) {
                            output.writeObject(cliente);
                        }


                        System.out.println("Cliente agregado exitosamente.");
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                        break;
                }
            } while (opcion != 3);
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo " + FILENAME);
        } catch (EOFException e) {
            // No hacer nada, simplemente termina el ciclo de búsqueda.
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}




¡Por supuesto! A continuación, te presento 4 ejercicios de Java sobre ficheros que usen arrays:


1. Escribir un programa en Java que lea un archivo de texto llamado "numeros.txt" que contiene una serie de números enteros separados por espacios y los almacene en un array. El programa debe imprimir el contenido del array en la consola.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LeerArchivoNumeros {


    public static void main(String[] args) {
        // Archivo a leer
        File archivo = new File("numeros.txt");


        try {
            // Crear un objeto Scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);


            // Leer el archivo y almacenar los números en un array
            int[] numeros = new int[10]; // se asume que el archivo tiene 10 números
            int i = 0;
            while (scanner.hasNextInt()) {
                numeros[i] = scanner.nextInt();
                i++;
            }


            // Cerrar el scanner
            scanner.close();


            // Imprimir los números en la consola
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[j] + " ");
            }


        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        }
    }
}




2. Escribir un programa en Java que lea un archivo binario llamado "datos.bin" que contiene una serie de objetos de una clase llamada "Producto". La clase debe tener atributos como nombre, precio, cantidad en stock, entre otros. El programa debe leer los objetos del archivo y almacenarlos en un array. Luego, el programa debe permitir al usuario buscar un producto por su nombre en el array y mostrar sus detalles si se encuentra. Si no se encuentra el producto, el programa debe imprimir un mensaje indicando que no se encontró el producto en el array.
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;


public class BuscarProducto {


    public static void main(String[] args) {
        // Leer el archivo binario y almacenar los objetos en un array
        Producto[] productos = leerArchivoBinario("datos.bin");


        // Pedir al usuario que ingrese el nombre del producto a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreProducto = scanner.nextLine();


        // Buscar el producto en el array
        Producto productoBuscado = null;
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                productoBuscado = producto;
                break;
            }
        }


        // Mostrar los detalles del producto si se encuentra
        if (productoBuscado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(productoBuscado.toString());
        } else {
            System.out.println("No se encontró el producto en el archivo.");
        }


        scanner.close();
    }


    public static Producto[] leerArchivoBinario(String nombreArchivo) {
        Producto[] productos = null;


        try (FileInputStream fis = new FileInputStream(nombreArchivo);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            productos = (Producto[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        return productos;
    }


}




3. Escribir un programa en Java que lea un archivo de texto llamado "personas.txt" que contiene una serie de líneas de texto, cada una representando a una persona y con campos separados por comas. El programa debe almacenar los datos de las personas en un array de objetos de una clase llamada "Persona". La clase debe tener atributos como nombre, edad, número de identificación, entre otros. El programa debe luego ordenar el array por edad de forma ascendente y mostrar el contenido del array ordenado en la consola.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    
    public static void main(String[] args) {
        // Leer archivo y almacenar datos en array
        Persona[] personas = leerPersonas("personas.txt");
        
        // Ordenar array por edad ascendente
        Arrays.sort(personas, Comparator.comparing(Persona::getEdad));
        
        // Imprimir array ordenado
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
    
    private static Persona[] leerPersonas(String archivo) {
        Persona[] personas = null;
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)) {
            // Contar líneas del archivo
            int numLineas = 0;
            while (br.readLine() != null) {
                numLineas++;
            }
            personas = new Persona[numLineas];
            
            // Leer archivo línea por línea y crear objetos Persona
            String linea;
            int i = 0;
            br.reset();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                String nombre = campos[0];
                int edad = Integer.parseInt(campos[1]);
                String id = campos[2];
                personas[i] = new Persona(nombre, edad, id);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;
    }
}


class Persona {
    private String nombre;
    private int edad;
    private String id;
    
    public Persona(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getId() {
        return id;
    }
    
    public String toString() {
        return nombre + " (" + edad + ") - ID: " + id;
    }
}




4. Escribir un programa en Java que cree un archivo de texto llamado "alumnos.txt" y lo llene con los datos de un array de objetos de una clase llamada "Alumno". La clase debe tener atributos como nombre, número de identificación, nota promedio, entre otros. El programa debe permitir al usuario agregar alumnos al array y luego escribir los datos de todos los alumnos en el archivo de texto.
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AlumnosProgram {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[0];
        Scanner sc = new Scanner(System.in);
        String respuesta = "";

        // Leer los datos de los alumnos
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el número de identificación del alumno: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese la nota promedio del alumno: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            // Agregar el alumno al array
            alumnos = agregarAlumno(alumnos, new Alumno(nombre, id, nota));

            System.out.print("Desea agregar otro alumno? (s/n): ");
            respuesta = sc.nextLine();
        } while (respuesta.equals("s"));

        // Escribir los datos de los alumnos en el archivo de texto
        try {
            FileWriter archivo = new FileWriter("alumnos.txt");
            PrintWriter pw = new PrintWriter(archivo);

            for (int i = 0; i < alumnos.length; i++) {
                pw.println(alumnos[i].getNombre() + "," + alumnos[i].getId() + "," + alumnos[i].getNota());
            }

            archivo.close();
            System.out.println("Los datos de los alumnos han sido escritos en el archivo 'alumnos.txt'");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public static Alumno[] agregarAlumno(Alumno[] alumnos, Alumno nuevoAlumno) {
        Alumno[] temp = new Alumno[alumnos.length + 1];
        for (int i = 0; i < alumnos.length; i++) {
            temp[i] = alumnos[i];
        }
        temp[temp.length - 1] = nuevoAlumno;
        return temp;
    }
}

class Alumno {
    private String nombre;
    private int id;
    private double nota;

    public Alumno(String nombre, int id, double nota) {
        this.nombre = nombre;
        this.id = id;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }
}

REGISTRO AL INICIO 













import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class ArchivoDatos {


    public static void main(String[] args) {
        RandomAccessFile archivo = null;
        Scanner entrada = new Scanner(System.in);


        try {
            // Creamos el archivo y lo abrimos con permisos de lectura y escritura
            archivo = new RandomAccessFile("datos.dat", "rw");


            // Pedimos los datos al usuario
            System.out.print("Ingrese el nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // limpiamos el buffer


            // Movemos los registros existentes hacia abajo
            long tamArchivo = archivo.length();
            for (long i = tamArchivo; i > 0; i--) {
                archivo.seek(i-1);
                byte b = archivo.readByte();
                archivo.seek(i);
                archivo.writeByte(b);
            }


            // Escribimos los nuevos datos al principio del archivo
            archivo.seek(0);
            archivo.writeUTF(nombre);
            archivo.writeInt(edad);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerramos el flujo de entrada y salida
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
*/
    }
    
}
