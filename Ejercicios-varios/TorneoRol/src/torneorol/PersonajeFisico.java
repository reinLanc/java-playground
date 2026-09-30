/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneorol;

/**
 *
 * @author Reinaldo Gil
 */
// NIVEL 3b: personaje fisico, añade fuerza
abstract class PersonajeFisico extends Personaje {

    protected int fuerza;

    public PersonajeFisico(String nombre, int nivel, int vida, int fuerza) {
        super(nombre, nivel, vida);
        this.fuerza = fuerza;
    }

    @Override
// Los fisicos se defienden con su fuerza bruta
    public int calcularDefensa() {
        return fuerza / 3;
    }
}
// NIVEL 4: clases concretas, solo definen calcularAtaque() y getClase()

class Mago extends PersonajeMagico {

    private int hechizos;

    public Mago(String nombre, int nivel, int vida, int mana, int hechizos) {
        super(nombre, nivel, vida, mana);
        this.hechizos = hechizos;
    }

    @Override
    public int calcularAtaque() {
        return (mana / 2) + (hechizos * nivel);
    }

    @Override
    public String getClase() {
        return "[Mago]";
    }
}
