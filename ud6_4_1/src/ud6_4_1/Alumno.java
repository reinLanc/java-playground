package ud6_4_1;

import java.io.Serializable;

public class Alumno implements Serializable {

    private int numero;
    private String nombre;
    private double nota;

    public Alumno(String nombre, int numero, double nota) {
        this.numero = numero;
        this.nombre = nombre;
        this.nota = nota;
    }

    public void ponNota(double nota) {
        this.nota = nota;

    }

    public void ponNumero(int numero) {
        this.numero = numero;
    }

    public void ponNombre(String nombre) {
        this.nombre = nombre;

    }

    public double dameNota() {
        return nota;

    }

    public String dameNombre() {
        return nombre;

    }

    public int dameNumero() {
        return numero;

    }

    public String muestraAlumno() {
        return "Número matrícula: " + numero + "\nNombre: " + nombre + "\nNota media; " + nota;

    }
}
