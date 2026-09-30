/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneorol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Reinaldo Gil
 */
// Clase Torneo: simula combates y gestiona el ranking
class Torneo {

    private String nombre;
    private ArrayList<Personaje> participantes = new ArrayList<>();

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public void inscribir(Personaje p) {
        participantes.add(p);
    }
// Combate entre dos personajes usando solo polimorfismo
// Nunca se comprueba de que tipo concreto son: solo se llama a sus metodos

    public void combatir(Personaje a, Personaje b) {
        a.restaurarVida();
        b.restaurarVida();
        System.out.println("Combate: " + a.getNombre() + " vs " + b.getNombre());
        int ronda = 1;
        while (a.estaVivo() && b.estaVivo() && ronda <= 10) {
            b.recibirAtaque(a.calcularAtaque()); // a ataca a b
            a.recibirAtaque(b.calcularAtaque()); // b contraataca a a
            ronda++;
        }
        if (a.estaVivo() && !b.estaVivo()) {
            System.out.println("Gana: " + a.getNombre());
            a.ganarPuntos(3);
        } else if (b.estaVivo() && !a.estaVivo()) {
            System.out.println("Gana: " + b.getNombre());
            b.ganarPuntos(3);
        } else {
            System.out.println("Empate tras " + (ronda - 1) + " rondas.");
            a.ganarPuntos(1);
            b.ganarPuntos(1);
        }
    }
// TreeMap ordena el ranking por puntos de mayor a menor
// El truco: usamos -puntos como clave para invertir el orden natural

    public void mostrarRanking() {
        TreeMap<Integer, Personaje> ranking = new TreeMap<>();
        for (Personaje p : participantes) {
            ranking.put(-p.getPuntos(), p); // negativo = mayor primero
        }
        System.out.println("=== Ranking " + nombre + " ===");
        int pos = 1;
        for (Personaje p : ranking.values()) {
            System.out.println(pos + ". " + p.estado());
            pos++;
        }
    }
// HashMap agrupa por clase sin instanceof: getClase() es polimorfico

    public void mostrarPorClase() {

        HashMap<String, ArrayList<Personaje>> grupos = new HashMap<>();
        for (Personaje p : participantes) {
            String cl = p.getClase(); // polimorfismo, no instanceof
            if (!grupos.containsKey(cl)) {
                grupos.put(cl, new ArrayList<>());
            }
            grupos.get(cl).add(p);
        }
        System.out.println("=== Participantes por clase ===");
        for (String cl : grupos.keySet()) {
            System.out.println(cl);
            for (Personaje p : grupos.get(cl)) {
                System.out.println(" " + p.estado());
            }
        }
    }
}
