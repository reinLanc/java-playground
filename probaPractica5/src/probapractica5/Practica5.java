/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probapractica5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practica5 {
    private static Scanner teclado = new Scanner(System.in);
    private static VideoClub videoclub;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public static void main(String[] args) {
       int op=0;
       videoclub = new VideoClub();

        do
        {
          op=mostrarMenu();

          switch (op)
          {
              case 1: videoclub.listaProductos();
                      break;
              case 2: añadirProducto();
                      break;
              case 3: fichaProducto();
                      break;
              case 4: videoclub.listaClientes();
                      break;
              case 5: añadirCliente();
                      break;
              case 6: fichaCliente();
                      break;
              case 7: alquilarProducto();
                      break;
              case 8: videoclub.listadoAlquileres();
                      break;
          }

        } while(op!=0);
    }
    
    static int mostrarMenu()
    {
        int op;
        
        System.out.println("1. Lista productos");
        System.out.println("2. Añadir producto");
        System.out.println("3. Ficha producto");
        System.out.println("4. Lista clientes");
        System.out.println("5. Añadir cliente");
        System.out.println("6. Ficha cliente");
        System.out.println("7. Alquilar producto");
        System.out.println("8. Listado de registro de alquiler");
        System.out.println("0. Salir");
        
        op=teclado.nextInt();
        teclado.nextLine();
        
        return op;
    }    



    private static void añadirProducto() {
        int op;
        
        System.out.println("1. Película");
        System.out.println("2. Videojuego");
        System.out.println("3. Cancelar");
        op = Integer.parseInt(teclado.nextLine());
        switch(op)
        {
            case 1: añadirPelicula();
                break;
            case 2: añadirVideojuego();
                break;
        }
    }
    
    private static void añadirPelicula()
    {
        int referencia;
        String titulo;
        float precio;
        int plazo;
        String genero;
        int año;
        String director;
        String interpretes;
        
        System.out.println("Introduzca referencia");
        referencia = Integer.parseInt(teclado.nextLine());  
        System.out.println("Introduzca titulo");
        titulo = teclado.nextLine();  
        System.out.println("Introduzca precio");
        precio = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduzca plazo");
        plazo = Integer.parseInt(teclado.nextLine());   
        System.out.println("Introduzca genero");
        genero = teclado.nextLine();  
        System.out.println("Introduzca año");
        año = Integer.parseInt(teclado.nextLine());  
        System.out.println("Introduzca director");
        director = teclado.nextLine();  
        System.out.println("Introduzca interpretes");
        interpretes = teclado.nextLine();      
        videoclub.añadirProducto(new Pelicula(referencia,
                                              titulo,
                                              precio,
                                              plazo,
                                              false,
                                              genero,
                                              año,
                                              director,
                                              interpretes));
    }
    
    private static void añadirVideojuego()
    {
        int referencia;
        String titulo;
        float precio;
        int plazo;
        String estilo;
        String plataforma;
        
        System.out.println("Introduzca referencia");
        referencia = Integer.parseInt(teclado.nextLine()); 
        System.out.println("Introduzca titulo");
        titulo = teclado.nextLine(); 
        System.out.println("Introduzca precio");
        precio = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduzca plazo");
        plazo = Integer.parseInt(teclado.nextLine());      
        System.out.println("Introduzca estilo");
        estilo = teclado.nextLine(); 
        System.out.println("Introduzca plataforma");
        plataforma = teclado.nextLine(); 
        videoclub.añadirProducto(new VideoJuego(referencia,
                                                titulo,
                                                precio,
                                                plazo,
                                                false,
                                                estilo,
                                                plataforma));        
    }    

    private static void fichaProducto() {
        int referencia;
        
        System.out.println("Introduzca referencia");
        referencia = Integer.parseInt(teclado.nextLine());
        videoclub.fichaProducto(referencia);
    }



    private static void añadirCliente() {
        int numero;
        String nombre;
        String direccion;
        String telefono;
        
        System.out.println("Introduzca numero");
        numero = Integer.parseInt(teclado.nextLine());      
        System.out.println("Introduzca nombre");
        nombre = teclado.nextLine(); 
        System.out.println("Introduzca direccion");
        direccion = teclado.nextLine(); 
        System.out.println("Introduzca telefono");
        telefono = teclado.nextLine();        
        videoclub.añadirCliente(new Cliente(numero,
                                            nombre,
                                            direccion,
                                            telefono));          
    }

    private static void fichaCliente() {
        int numero;
        
        System.out.println("Introduzca numero cliente");
        numero = Integer.parseInt(teclado.nextLine());
        videoclub.fichaCliente(numero);        
    }

    private static void alquilarProducto() {
        int numeroCliente;
        int referenciaProducto;
        Date fechaAlquiler;
        Date fechaDevolucion;
        float importe;
        
        System.out.println("Introduzca numero cliente");
        numeroCliente = Integer.parseInt(teclado.nextLine());     
        System.out.println("Introduzca referencia producto");
        referenciaProducto = Integer.parseInt(teclado.nextLine());   
        try
        {
            System.out.println("Introduce fecha alquiler");
            fechaAlquiler = sdf.parse(teclado.nextLine());
            System.out.println("Introduce fecha devolución");
            fechaDevolucion = sdf.parse(teclado.nextLine());
        }   
        catch(Exception e){
            System.out.println("Fecha incorrecta");
            return;
        }
        System.out.println("Introduzca importe");
        importe = Float.parseFloat(teclado.nextLine());
        videoclub.añadirAlquiler(new Alquiler(videoclub.localizarCliente(numeroCliente), 
                                              videoclub.localizarProducto(referenciaProducto), 
                                              fechaAlquiler, 
                                              fechaDevolucion,
                                              importe));
        videoclub.localizarProducto(referenciaProducto).setAlquilado(true);
        
    }


    
}

