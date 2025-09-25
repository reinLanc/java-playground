/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author gilguerei
 */
public class Cliente {
     private String nif;
    private String nombre;
    private String apellidos;
    private int puntos;

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public Cliente(String nif, String nombre, String apellidos){

        this.nif=nif;
        this.nombre=nombre;
        this.apellidos=apellidos;
        
    }

    public String getNIF()
    {
        return this.nif;
    }

    public void setNIF(String nif)
    {
        this.nif=nif;
    }
    
    public String getNombre()
    {
        return this.nombre; 
    }

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.nombre=apellidos;
    }
}
