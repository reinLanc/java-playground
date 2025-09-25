package ud4_2_4;

import java.util.Scanner;

public class Ud4_2_4 {

    public static void main(String[] args) {
        FichaLibros libreria = new FichaLibros();
        System.out.println("Introducir código de Libro");
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            int codigo = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introducir titulo");
            String titulo = teclado.nextLine();
            System.out.println("introducir autor");
            String autor = teclado.nextLine();


            /*Libro libro2 = new Libro(2, "El viejo y el mar", "Hemingway");
        Libro libro3 = new Libro(3, "Dracula", "Bram stoker");
        Libro libro4 = new Libro(4, "100 años de soledad", "Garcia Marquez");*/
            libreria.añadir(new Libro(codigo, titulo, autor));
        }
        /*libreria.añadir(libro2);
        libreria.añadir(libro3);
        libreria.añadir(libro4);*/
        //metodos
        libreria.visualizar();
        libreria.fichar();
        libreria.visualizar();
    }

}
