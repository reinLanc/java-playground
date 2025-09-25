package ud4_2_4;

import java.util.LinkedList;
import java.util.Iterator;

public class FichaLibros {

    LinkedList<Libro> pila = new LinkedList<Libro>();

    public void añadir(Libro libro) {
        pila.push(libro);
    }

    public void visualizar() {
        Libro libro;
        Iterator i = pila.iterator();
        System.out.println("Libros en mesa:");
        while (i.hasNext()) {
            libro = (Libro) i.next();
            System.out.println("codigo: " + libro.getCodigo() + " Titulo: " + libro.getTitulo() + " Autor: " + libro.getAutor());
        }
    }

    public void fichar() {
            System.out.println("Fichando libro con código: "+pila.pop().getCodigo());
    }
}
