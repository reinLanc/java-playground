/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneorol;

/**
 *
 * @author Reinaldo Gil
 */
// NIVEL 3a: personaje magico, añade mana
abstract class PersonajeMagico extends Personaje {

    protected int mana;

    public PersonajeMagico(String nombre, int nivel, int vida, int mana) {
        super(nombre, nivel, vida);
        this.mana = mana;
    }

    @Override
// Los magicos se defienden con barreras de mana, no con armadura
    public int calcularDefensa() {
        return mana / 5;
    }
}
