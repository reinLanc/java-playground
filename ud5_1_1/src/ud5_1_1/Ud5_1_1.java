package ud5_1_1;

import java.util.Scanner;

public class Ud5_1_1 {

    public static void main(String[] args) {
        System.out.println("Introduzca el titulo de la pelicula");
        Scanner teclado = new Scanner(System.in);
        String title = teclado.nextLine();
        System.out.println("Introduzca el director de la pelicula");
        String director = teclado.nextLine();
        System.out.println("Introduzca los protagonistas de la pelicula");
        String protagonistas = teclado.nextLine();
        System.out.println("Introduzca el genero de la pelicula");
        String genero = teclado.nextLine();

        System.out.println("Introduzca el resumen de la pelicula");
        String resumen = teclado.nextLine();
        System.out.println("Introduzca la duracion de la pelicula");
        int duracion = teclado.nextInt();
        DVDcine pelicula1 = new DVDcine(title, director, protagonistas, duracion, resumen, genero);
        System.out.println("TITULO: " + pelicula1.titulo);
        System.out.println("DIRECTOR: " + pelicula1.director);
        System.out.println("CON: " + pelicula1.protagonistas);
        System.out.println("Genero: " + pelicula1.genero);
        System.out.println("Duracion " + pelicula1.muestraDuracion());
        System.out.println(pelicula1.esThriller()? "Es un Thriller." : "No es un thriller.");
        
        //LLamada a metodos:
        System.out.println(pelicula1.muestraDVDCine());
        System.out.println(pelicula1.esThriller());
        System.out.println(pelicula1.muestraDuracion());
        System.out.println(pelicula1.tieneResumen());

    }
}
