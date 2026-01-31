/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication123;

import java.util.Comparator;

/**
 *
 * @author gilguerei
 */
public class ComparadorNombre {

    public ComparadorNombre() {
        

    public int compare(Alumno a1, Alumno a2) {
        return a1.getApellido().compareTo(a2.getApellido);
    }

}

}
