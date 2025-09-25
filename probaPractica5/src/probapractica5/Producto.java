/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probapractica5;

public class Producto {
    private int referencia;
    private String titulo;
    private float precio;
    private int plazo;
    private boolean alquilado;

    public Producto(int referencia, String titulo, float precio, int plazo, boolean alquilado) {
        this.referencia = referencia;
        this.titulo = titulo;
        this.precio = precio;
        this.plazo = plazo;
        this.alquilado = alquilado;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public float getPrecio() {
        return precio;
    }

    public int getPlazo() {
        return plazo;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }    

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    public String mostrar()
    {
        return "\nReferencia: "+referencia+
                "\nReferencia: "+titulo+
               "\nPrecio: "+precio+
               "\nPlazo: "+plazo+
               "\nAlquilado: "+(alquilado?"Si":"No");
    }
    
}

