/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probapractica5;

public class Pelicula extends Producto{
    private String genero;
    private int año;
    private String director;
    private String interpretes;


    public Pelicula(int referencia, String titulo, float precio, int plazo, boolean alquilado, String genero, int año, String director, String interpretes) {
        super(referencia, titulo, precio, plazo, alquilado);
        this.genero = genero;
        this.año = año;
        this.director = director;
        this.interpretes = interpretes;
    }

    public String getGenero() {
        return genero;
    }

    public int getAño() {
        return año;
    }

    public String getDirector() {
        return director;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }

    @Override
    public String mostrar() {
        return  super.mostrar()+
                "\nDirector: "+director+
                "\nGénero: "+genero+
                "\nIntérpretes: "+interpretes;
    }
    
    
}

