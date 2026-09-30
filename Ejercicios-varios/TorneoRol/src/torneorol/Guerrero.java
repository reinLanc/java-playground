/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneorol;

/**
 *
 * @author Reinaldo Gil
 */
class Guerrero extends PersonajeFisico {

    private int armadura;

    public Guerrero(String nombre, int nivel, int vida, int fuerza, int armadura) {
        super(nombre, nivel, vida, fuerza);
        this.armadura = armadura;
    }

    @Override
    public int calcularAtaque() {
        return fuerza + (nivel * 3);
    }

    @Override
// El guerrero suma la armadura a su defensa base heredada
    public int calcularDefensa() {
        return super.calcularDefensa() + armadura;
    }

    @Override
    public String getClase() {
        return "[Guerrero]";
    }
}
