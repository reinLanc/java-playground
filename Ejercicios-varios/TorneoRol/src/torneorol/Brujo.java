/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneorol;

/**
 *
 * @author Reinaldo Gil
 */
class Brujo extends PersonajeMagico {

    private int pactosSombra;

    public Brujo(String nombre, int nivel, int vida, int mana, int pactos) {
        super(nombre, nivel, vida, mana);
        this.pactosSombra = pactos;
    }

    @Override
    public int calcularAtaque() {
        return (mana / 3) + (pactosSombra * nivel * 2);
    }

    @Override
    public String getClase() {
        return "[Brujo]";
    }
}
