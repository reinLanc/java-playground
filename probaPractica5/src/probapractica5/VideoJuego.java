/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probapractica5;

public class VideoJuego extends Producto{
    private String estilo;
    private String plataforma;

    public VideoJuego(int referencia, String titulo, float precio, int plazo, boolean alquilado,String estilo, String plataforma) {
        super(referencia, titulo, precio, plazo, alquilado);
        this.estilo = estilo;
        this.plataforma = plataforma;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    @Override
    public String mostrar() {
        return  super.mostrar()+
                "\nEstilo: "+estilo+
                "\nPlataforma: "+plataforma;
    }    
    
}
