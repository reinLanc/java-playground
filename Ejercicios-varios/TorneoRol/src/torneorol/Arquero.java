/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneorol;

/**
 *
 * @author Reinaldo Gil
 */
class Arquero extends PersonajeFisico {

    private int precision;

    public Arquero(String nombre, int nivel, int vida, int fuerza, int prec) {
        super(nombre, nivel, vida, fuerza);
        this.precision = prec;
    }

    @Override
// La precision amplifica el ataque del arquero
    public int calcularAtaque() {
        return (fuerza / 2) + (precision * nivel);
    }

    @Override
    public String getClase() {
        return "[Arquero]";
    }
}
