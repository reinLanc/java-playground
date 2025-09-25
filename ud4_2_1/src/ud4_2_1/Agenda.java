/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4_2_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author gilguerei
 */
public class Agenda {

    ArrayList<Persona> lista = new ArrayList<>();

    public boolean añadePersona(Persona p) {
        ListIterator li = lista.listIterator();
        while (li.hasNext()) {
            if (((Persona) li.next()).getDni().equals(p.getDni())) {
                return false;
            }
        }
        li.add(p);
        return true;

    }

    public boolean borraPersona(Persona p) {
        ListIterator li = lista.listIterator();
        while (li.hasNext()) {
            if (((Persona) li.next()).getDni().equals(p.getDni())) {
                li.remove();
                return false;

            }
        }
        return true;

    }

    public boolean buscaPersona(String dni) {
        ListIterator li = lista.listIterator();
        Persona p;
        while (li.hasNext()) {
            p = (Persona) li.next();
        
        if (p.getDni().equals(dni)) {
            System.out.println(p.getDni() + " corresponde a la persona "  + p.getNombre());
            return true;
        }
        }
        return false;

    }

    public void cuenta() {
        System.out.print("La lista tiene ");
        System.out.println(lista.size() + " personas");
    }

    public void muestraListaPersona() {
        Persona p;
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            p = (Persona) i.next();
            System.out.println("DNI: " + p.getDni() + " Nombre: " + p.getNombre());
        }
    }
}
